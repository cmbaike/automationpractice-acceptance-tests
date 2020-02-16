package utils

object SalesItem extends Enumeration {
  type EnumType = Value
  val WOMEN,
  DRESSES,
  T_SHIRTS = Value

  def withNameOpt(s: String): Option[Value] = values.find(_.toString == s)

}
