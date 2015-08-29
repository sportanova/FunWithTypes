package FunWithTypes

/* Implement the folling functions. Just because the function names sound sequential ("do x and y") doesn't necessarily
   mean that you couldn't do y and then x - as long as the result is the same
*/
object Mapping {
  def double(x: Int): Int = x * 2

  // use "double"
  def doubleOption(xOpt: Option[Int]): Option[Int] = ???

  // use "doubleOption"
  def doubleOptionThenStringify(xOpt: Option[Int]): Option[String] = ???

  // use "double"
  def doubleEachItemInList(xs: List[Int]): List[Int] = ???

  // use "doubleEachItemInList"
  def doubleEachItemInListThenStringify(xs: List[Int]): List[String] = ???

  // use doubleEachItemInList + doubleOption
  def doubleEachItemInListOfOptions(xsOpt: List[Option[Int]]): List[Option[Int]] = ???

  // use "doubleEachItemInListOfOption"
  def doubleEachItemInListOfOptionsThenStringify(xsOpt: List[Option[Int]]): List[Option[String]] = ???

  // use "doubleEachItemInListOfOptionsThenStringify"
  def doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(xsOpt: List[Option[Int]]): List[Option[String]] = ???

  // use doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones
  def doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions(xsOpt: List[Option[Int]]): List[String] = ???

  /* create doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions from scratch - don't use ANY of the above functions,
     but use the same techniques
  */
  def doubleAndStringifyAndRemoveOptions(xsOpt: List[Option[Int]]): List[String] = ???
}