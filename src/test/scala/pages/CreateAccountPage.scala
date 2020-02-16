package pages

import java.util.concurrent.TimeUnit

import actions.CommonUIActions
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.{By, WebDriver, WebElement}

class CreateAccountPage(driver: WebDriver) extends CommonUIActions(driver) {

  @FindBy(css = "#customer_firstname")
  var customerFirstName: WebElement = _

  @FindBy(css = "#customer_lastname")
  var customerLastName: WebElement = _

  @FindBy(css = "#email")
  var email: WebElement = _

  @FindBy(css = "#passwd")
  var password: WebElement = _

  @FindBy(css = "#days")
  var days: WebElement = _

  @FindBy(css = "#months")
  var months: WebElement = _

  @FindBy(css = "#years")
  var years: WebElement = _

  @FindBy(css = "#firstname")
  var firstName: WebElement = _

  @FindBy(css = "#lastname")
  var lastName: WebElement = _

  @FindBy(css = "#company")
  var company: WebElement = _

  @FindBy(css = "#address1")
  var addressLine_1: WebElement = _

  @FindBy(css = "#address2")
  var addressLine_2: WebElement = _

  @FindBy(css = "#city")
  var city: WebElement = _

  @FindBy(css = "#id_state")
  var state: WebElement = _

  @FindBy(css = "#postcode")
  var postcode: WebElement = _

  @FindBy(css = "#phone")
  var phone: WebElement = _

  @FindBy(css = "#submitAccount")
  var submitAccount: WebElement = _

  @FindBy(css = "#phone_mobile")
  var phone_mobile: WebElement = _

  def selectTitle(value: Int): CreateAccountPage = {
    driver.manage.timeouts.implicitlyWait(5, TimeUnit.SECONDS)
    val title: WebElement = driver.findElement(By.cssSelector(String.format("#id_gender%s", value.toString)))
    title.click()
    this
  }

  def enterCustomerFirstName(value: String): CreateAccountPage = {
    typeInto(customerFirstName, value)
    this
  }

  def enterCustomerLastName(value: String): CreateAccountPage = {
    typeInto(customerLastName, value)
    this
  }

  def enterEmail(value: String): CreateAccountPage = {
    if (!email.getText.equalsIgnoreCase(value)) {
      typeInto(email, value)
    }
    typeInto(email, value)
    this
  }

  def enterPassword(value: String): CreateAccountPage = {
    typeInto(password, value)
    this
  }

  def selectDOB(day: String, month: String, year: String): CreateAccountPage = {
    days.findElement(By.cssSelector(String.format("option[value='%s']", day))).click()
    months.findElement(By.cssSelector(String.format("option[value='%s']", month))).click()
    years.findElement(By.cssSelector(String.format("option[value='%s']", year))).click()
    this
  }

  def enterFirstName(value: String): CreateAccountPage = {
    if (!firstName.getText.equalsIgnoreCase(value)) {
      typeInto(firstName, value)
    }
    this
  }

  def enterLastName(value: String): CreateAccountPage = {
    if (!lastName.getText.equalsIgnoreCase(value)) {
      typeInto(lastName, value)
    }
    this
  }

  def enterCompany(value: String): CreateAccountPage = {
    typeInto(company, value)
    this
  }

  def enterAddressLine1(value: String): CreateAccountPage = {
    typeInto(addressLine_1, value)
    this
  }

  def enterAddressLine2(value: String): CreateAccountPage = {
    typeInto(addressLine_2, value)
    this
  }

  def enterCity(value: String): CreateAccountPage = {
    typeInto(city, value)
    this
  }

  def selectState(value: Int): CreateAccountPage = {
    state.findElement(By.cssSelector(String.format("option[value='%s']", value.toString))).click()
    this
  }

  def enterPostCode(value: String): CreateAccountPage = {
    typeInto(postcode, value)
    this
  }

  def enterHomePhone(value: String): CreateAccountPage = {
    typeInto(phone, value)
    this
  }

  def enterMobilePhone(value: String): CreateAccountPage = {
    typeInto(phone_mobile, value)
    this
  }

  def submitCreateAccountRequest(): Unit = {
    submitAccount.click()
  }
}

