package pages

import actions.CommonUIActions
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.{WebDriver, WebElement}
import utils.DataContext


class AuthenticationPage(driver: WebDriver, dataContext: DataContext) extends CommonUIActions(driver) {

  val createAccountPage = new CreateAccountPage(driver)
  val loginPage = new LoginPage(driver)

  @FindBy(css = "#email_create")
  var emailAddress: WebElement = _

  @FindBy(css = "#SubmitCreate")
  var createAccountButton: WebElement = _

  def enterEmailAddress(): AuthenticationPage = {
    typeInto(emailAddress, dataContext.emailValue)
    this
  }

  def clickCreateAccount(): AuthenticationPage = {
    createAccountButton.click()
    this
  }

  def createAccount(): Unit = {
    createAccountPage.selectTitle(dataContext.title)
      .enterCustomerFirstName(dataContext.firstN)
      .enterCustomerLastName(dataContext.lastN)
      .enterEmail(dataContext.emailValue)
      .enterPassword(dataContext.passWord)
      .selectDOB(dataContext.dob(0), dataContext.dob(1), dataContext.dob(2))
      .enterFirstName(dataContext.firstN)
      .enterLastName(dataContext.lastN)
      .enterCompany(dataContext.company)
      .enterAddressLine1(dataContext.enterAddressLine1)
      .enterAddressLine2(dataContext.enterAddressLine2)
      .enterCity(dataContext.enterCity)
      .selectState(dataContext.enterState)
      .enterPostCode(dataContext.enterPostCode)
      .enterMobilePhone(dataContext.enterMobilePhone)
      .submitCreateAccountRequest()
  }

  def userLogin(): Unit = {
    loginPage.enterUserName(dataContext.emailValue)
      .enterPassword(dataContext.passWord)
      .clickLogin()
  }

  def userSignOut(): Unit = {
    loginPage.clickLogOut()
  }
}
