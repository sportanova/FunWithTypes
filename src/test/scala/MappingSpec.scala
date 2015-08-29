package FunWithTypes

import org.specs2.mutable._

class MappingSpec extends Specification {
  import FunWithTypes.Mapping._

  "Mapping" should {
    "doubleOption" in {
      doubleOption(Some(1)) mustEqual Some(2)
      doubleOption(None) mustEqual None
    }

    "doubleOptionThenStringify" in {
      doubleOptionThenStringify(Some(1)) mustEqual Some("2")
      doubleOptionThenStringify(None) mustEqual None
    }

    "doubleEachItemInList" in {
      doubleEachItemInList(List(1,2,3)) mustEqual List(2,4,6)
    }

    "doubleEachItemInListThenStringify" in {
      doubleEachItemInListThenStringify(List(1,2,3)) mustEqual List("2","4","6")
    }

    "doubleEachItemInListOfOptions" in {
      doubleEachItemInListOfOptions(List(Some(1), Some(2), Some(3))) mustEqual List(Some(2), Some(4), Some(6))
      doubleEachItemInListOfOptions(List(Some(1), None, Some(3))) mustEqual List(Some(2), None, Some(6))
    }

    "doubleEachItemInListOfOptionsThenStringify" in {
      doubleEachItemInListOfOptionsThenStringify(List(Some(1), Some(2), Some(3))) mustEqual List(Some("2"), Some("4"), Some("6"))
      doubleEachItemInListOfOptionsThenStringify(List(Some(1), None, Some(3))) mustEqual List(Some("2"), None, Some("6"))
    }

    "doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones" in {
      doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(List(Some(1), Some(2), Some(3))) mustEqual List(Some("2"), Some("4"), Some("6"))
      doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNones(List(Some(1), None, Some(3))) mustEqual List(Some("2"), Some("6"))
    }

    "doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions" in {
      doubleEachItemInListOfOptionsThenStringifyAndGetRidOfNonesAndExtractIntsFromOptions(List(Some(1), None, Some(3))) mustEqual List("2","6")
    }

    "doubleAndStringifyAndRemoveOptions" in {
      doubleAndStringifyAndRemoveOptions(List(Some(1), None, Some(3))) mustEqual List("2","6")
    }
  }
}
























