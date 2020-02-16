package pages

import actions.CommonUIActions
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}
import org.scalatest.selenium.Page
import utils.Env

class HomePage(driver: WebDriver) extends CommonUIActions(driver) with Page {

  @FindBy(css = ".login")
  var signIn: WebElement = _

  PageFactory.initElements(driver, this)

  def clickOnSignIn: HomePage = {
    waitForElementVisibility(signIn)
    signIn.click()
    this
  }

  override val url: String = Env.baseUrl
}
