package runner

import cucumber.api.Scenario
import cucumber.api.java.{After, Before}
import org.openqa.selenium._
import utils.SingletonDriver

class Hooks {

  @Before
  def initialize() {
    SingletonDriver.driver.manage().deleteAllCookies()
  }

  @After
  def tearDown(result: Scenario) {
    if (result.isFailed) {
     takesScreenshot(result)
    }
    SingletonDriver.driver.quit()
  }

  def takesScreenshot(result: Scenario): Unit={
    SingletonDriver.driver match {
      case screenshot1: TakesScreenshot =>
        try {
          val screenshot = screenshot1.getScreenshotAs(OutputType.BYTES)
          result.embed(screenshot, "image/png")
        } catch {
          case somePlatformsDontSupportScreenshots: WebDriverException => System.err.println(somePlatformsDontSupportScreenshots.getMessage)
        }
      case _ =>
    }
  }

}
