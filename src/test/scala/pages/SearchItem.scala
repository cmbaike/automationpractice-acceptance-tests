package pages

import actions.CommonUIActions
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.{By, WebDriver, WebElement}
import utils.SalesItem

import scala.collection.JavaConverters._
import scala.collection.immutable.ListMap
import utils.SalesItem._

class SearchItem(driver: WebDriver) extends CommonUIActions(driver) {

  @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
  var dresses: WebElement = _

  def selectSaleItem(): Unit = {

  }

  def movePriceSlider(): Unit = {
    dresses.click()
    val width: Int = driver.findElement(By.cssSelector(".ui-slider-range")).getSize.getWidth
    actions.clickAndHold(driver.findElements(By.cssSelector(".ui-slider-handle")).get(0))
    actions.moveByOffset(width, 0)
    actions.release.perform()
  }

  def fetchPriceFilterItem(searchItem: SalesItem.Value): Map[WebElement, Double] = {

    implicit val prices: Map[WebElement, Double] = searchItem match {
      case DRESSES =>
        var prices = collection.immutable.Map[WebElement, Double]()
        val items: Seq[WebElement] = driver.findElements(By.cssSelector("div.right-block > div.content_price > span.price.product-price")).asScala
        items.foreach(element => prices += (element -> element.getText.replace("$", "").toDouble))
        prices
    }
    prices
  }

  def addHighestPriceItemToCart(element: WebElement): Unit = {
    element.click()
    driver.findElement(By.cssSelector("div > span[class='cross']")).click()
  }

  def getPriceItemInCart(): Double = {
    actions.clickAndHold(driver.findElement(By.cssSelector(".shopping_cart > a > b")))
    actions.release().perform()

    val selectedItem = driver.findElement(By.cssSelector("#total_product")).getText.replace("$", "")
      .toDouble
    selectedItem
  }


}
