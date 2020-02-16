package actions

import java.time.Duration

import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{WebDriver, WebElement}

class CommonUIActions(driver: WebDriver) {

  PageFactory.initElements(driver, this)

  import org.openqa.selenium.interactions.Actions

  val actions = new Actions(driver)

  val onWait = new WebDriverWait(driver, 15)

  def waitForElementVisibility(element: WebElement): Unit={
    onWait.pollingEvery(Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOf(element))
  }

  def typeInto(element: WebElement, value: String): CommonUIActions = {
    waitForElementVisibility(element)
    element.clear()
    element.sendKeys(value);
    this
  }
}
