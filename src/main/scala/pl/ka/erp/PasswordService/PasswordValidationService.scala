package pl.ka.erp.PasswordService

class PasswordValidationService() {
  private val NUMBER_OF_UPPER_LETTERS = 2
  private val NUMBER_OF_LOWER_LETTERS = 3
  private val NUMBER_OF_DIGITS = 1

  def isValid(password: String): Boolean = {
    val PassArray = password.toCharArray
    var upperCount = 0
    var lowerCount = 0
    var digitCount = 0
    for (i <- 0 until PassArray.length) {
      if (PassArray(i).isLower)
        lowerCount = lowerCount + 1
      else if (PassArray(i).isUpper)
        upperCount = upperCount + 1
      else (PassArray(i).isDigit)
      digitCount = digitCount + 1
    }

    if (upperCount < NUMBER_OF_UPPER_LETTERS) {
      return false;
    }

    if (lowerCount < NUMBER_OF_LOWER_LETTERS) {
      return false
    }

    if (digitCount < NUMBER_OF_DIGITS) {
      return false
    }

    true
  }


}
