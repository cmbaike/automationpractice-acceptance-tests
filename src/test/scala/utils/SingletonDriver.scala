package utils

import org.openqa.selenium.WebDriver

object SingletonDriver {
  implicit val driver: WebDriver = DriverFactory.getDriver
}
