object Mapping {
  def double(x: Int) = x * 2


  def doubleOption(xInt: Option[Int]): Option[Int] = xInt.map(double) // use "double"
  doubleOption(Some(1)) // Some(2)
  doubleOption(None) // None


  def doubleOptionThenStringify(xOpt: Option[Int]): Option[String] = doubleOption(xOpt).map(_.toString) // use "doubleOption"
  doubleOption(Some(1)) // Some("2")
  doubleOption(None) // None


  def doubleEachItemInList(xs: List[Int]) = xs.map(double) // use "double"
  doubleEachItemInList(List(1,2,3)) // List(2,4,6)


  def doubleEachItemInListThenStringify(xs: List[Int]): List[String] = doubleEachItemInList(xs).map(_.toString) // use "doubleEachItemInList"
  doubleEachItemInListThenStringify(List(1,2,3)) // List("1","2","3")


  def doubleEachItemInListOfOptions(xsOpt: List[Option[Int]]): List[Option[Int]] = xsOpt.map(doubleOption) // use doubleEachItemInList + doubleOption
  doubleEachItemInListOfOptions(List(Some(1), Some(2), Some(3))) // List(Some(2), Some(4), Some(6))
  doubleEachItemInListOfOptions(List(Some(1), None, Some(3))) // List(Some(2), None, Some(6))


  def doubleEachItemInListOfOptionsThenStringify(xsOpt: List[Option[Int]]): List[Option[String]] = doubleEachItemInListOfOptions(xsOpt).map(x => x.map(_.toString)) // use "doubleEachItemInListOfOption"
  doubleEachItemInListOfOptionsThenStringify(List(Some(1), Some(2), Some(3))) // List(Some("2"), Some("4"), Some("6"))
  doubleEachItemInListOfOptionsThenStringify(List(Some(1), None, Some(3))) // List(Some("2"), None, Some("6"))


  def doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(xsOpt: List[Option[Int]]): List[Option[String]] = doubleEachItemInListOfOptionsThenStringify(xsOpt).filter(_.isDefined) // use "doubleEachItemInListOfOptionsThenStringify"
  doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(List(Some(1), Some(2), Some(3))) // List(Some("2"), Some("4"), Some("6"))
  doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(List(Some(1), None, Some(3))) // List(Some("2"), Some("6")) // get rid of Some("4")


  def doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions(xsOpt: List[Option[Int]]): List[String] =  doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(xsOpt).map(_.get) // use doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones
  doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions(List(Some(1), None, Some(3))) // List("1","3")


  def doubleAndStringifyAndRemoveOptions(xsOpt: List[Option[Int]]): List[String] = xsOpt.map(x => x.map(y => (y * 2).toString)).filter(_.isDefined).map(_.get) // create doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions from scratch
  doubleAndStringifyAndRemoveOptions(List(Some(1), None, Some(3))) // List("1","3")
}
























