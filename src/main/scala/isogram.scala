object isogram extends App {

  def isIsogram(l: String): Boolean = {
    val letter = l.filter(c => c.isLetter).toLowerCase
    letter.distinct == letter
  }

}
