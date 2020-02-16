package pages

import actions.CommonUIActions
import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.FindBy

class LoginPage(driver: WebDriver) extends CommonUIActions(driver) {

  @FindBy(css = "#email")
  var userName: WebElement = _

  @FindBy(css = "#passwd")
  var passWord: WebElement = _

  @FindBy(css = "#SubmitLogin")
  var submitLogin: WebElement = _

  @FindBy(css = ".logout")
  var logOut: WebElement = _

  def enterUserName(username: String): LoginPage = {
    typeInto(userName, username)
    this
  }

  def enterPassword(password: String): LoginPage = {
    typeInto(passWord, password)
    this
  }

  def clickLogin(): LoginPage = {
    waitForElementVisibility(submitLogin)
    submitLogin.click()
    this
  }

  def clickLogOut(): LoginPage = {
    waitForElementVisibility(logOut)
    logOut.click()
    this
  }
}
