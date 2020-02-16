$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search_item.feature");
formatter.feature({
  "line": 1,
  "name": "Search by Price",
  "description": "",
  "id": "search-by-price",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9563964,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for expensive dress on new account",
  "description": "",
  "id": "search-by-price;search-for-expensive-dress-on-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "A new customer account is created",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The customer logs in with the new account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "The customer search for the most expensive dresses",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The selected dress is added to cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The customer log out and back in again",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The selected dress must still be in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchItemStepDef.scala:24"
});
formatter.result({
  "duration": 12193259177,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemStepDef.scala:34"
});
formatter.result({
  "duration": 2364693792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dresses",
      "offset": 43
    }
  ],
  "location": "SearchItemStepDef.scala:39"
});
formatter.result({
  "duration": 2162806521,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemStepDef.scala:45"
});
formatter.result({
  "duration": 1863596523,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemStepDef.scala:55"
});
formatter.result({
  "duration": 3437088803,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemStepDef.scala:62"
});
formatter.result({
  "duration": 5876761408,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#total_product\"}\n  (Session info: chrome\u003d80.0.3987.106)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1428:bb22:ca23:a148%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.3\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.106, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /var/folders/n4/syq93gnx5cq...}, goog:chromeOptions: {debuggerAddress: localhost:52088}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 504f9028c60b859e39a71a2e5b278124\n*** Element info: {Using\u003dcss selector, value\u003d#total_product}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:441)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:494)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\n\tat pages.SearchItem.getPriceItemInCart(SearchItem.scala:50)\n\tat StepDefs.SearchItemStepDef$$anonfun$7.apply(SearchItemStepDef.scala:64)\n\tat StepDefs.SearchItemStepDef$$anonfun$7.apply(SearchItemStepDef.scala:62)\n\tat cucumber.api.scala.ScalaDsl$StepBody$$anonfun$apply$1.applyOrElse(ScalaDsl.scala:62)\n\tat cucumber.api.scala.ScalaDsl$StepBody$$anonfun$apply$1.applyOrElse(ScalaDsl.scala:62)\n\tat scala.runtime.AbstractPartialFunction.apply(AbstractPartialFunction.scala:36)\n\tat cucumber.runtime.scala.ScalaStepDefinition.execute(ScalaStepDefinition.scala:71)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n\tat ✽.Then The selected dress must still be in the cart(search_item.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 631660823,
  "status": "passed"
});
});