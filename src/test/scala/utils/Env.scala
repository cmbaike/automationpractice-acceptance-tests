package utils

object Env {

  val baseUrl: String = Option(System.getProperty("environment")) match {

    case Some("qa") => Urls.QA
    case _ => Urls.QA

  }

  def isQA (url: String): Boolean = url.startsWith(Urls.QA)
}
