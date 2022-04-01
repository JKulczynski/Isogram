import org.scalatest.flatspec.AnyFlatSpec
import isogram.isIsogram
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class isogramSpec extends AnyFlatSpec{

  behavior of "isogram"

  it should "Determine if a word or phrase is an isogram."
  isIsogram("lumberjacks") shouldBe true
  isIsogram("background") shouldBe true
  isIsogram("downstream") shouldBe true
  isIsogram("six-year-old") shouldBe true
}
