package StepDefs


import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.{WebDriver, WebElement}
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser
import pages.{AuthenticationPage, HomePage, SearchItem}
import utils.{DataContext, SalesItem, SingletonDriver}

import scala.collection.immutable.ListMap


class SearchItemStepDef extends Matchers with ScalaDsl with EN with WebBrowser {

  implicit val driver: WebDriver = SingletonDriver.driver

  lazy val homePage = new HomePage(driver)
  val dataContext = new DataContext()
  lazy val authenticationPage = new AuthenticationPage(driver, dataContext)
  lazy val searchItem = new SearchItem(driver)
  var prices: Map[WebElement, Double] = collection.immutable.Map[WebElement, Double]()

  Given("""^A new customer account is created$""") { () =>
    go to homePage
    pageTitle should be("My Store")
    homePage.clickOnSignIn
    authenticationPage.enterEmailAddress().clickCreateAccount()
    authenticationPage.createAccount()
    authenticationPage.userSignOut()
    pageTitle should be("Login - My Store")
  }

  Given("""^The customer logs in with the new account$""") { () =>
    homePage.clickOnSignIn
    authenticationPage.userLogin()
  }

  When("""^The customer search for the most expensive (.*)$""") { saleItem: String =>
    searchItem.movePriceSlider()
    val item = SalesItem.withNameOpt(saleItem.toUpperCase).get
    prices = searchItem.fetchPriceFilterItem(item)
  }

  When("""^The selected dress is added to cart$""") { () =>
    val itemPrice : Double = ListMap(prices.toSeq.sortBy(_._2): _*).last._2
    searchItem.addHighestPriceItemToCart(ListMap(prices.toSeq.sortBy(_._2): _*).last._1)
    val selectedItem = searchItem.getPriceItemInCart()
    withScreenshot {
      assert(itemPrice == selectedItem)
    }

  }

  When("""^The customer log out and back in again$""") { () =>
    authenticationPage.userSignOut()
    pageTitle should be("Order - My Store")
    homePage.clickOnSignIn
    authenticationPage.userLogin()
  }

  Then("""^The selected dress must still be in the cart$""") { () =>
    val itemPrice : Double = ListMap(prices.toSeq.sortBy(_._2): _*).last._2
    val selectedItem = searchItem.getPriceItemInCart()
    withScreenshot {
      assert(itemPrice == selectedItem)
    }
  }
}
