package pl.ka.erp

import java.security.KeyStore.TrustedCertificateEntry
import scala.language.postfixOps


class User(private val userId: Int, private var name: String, private var surname: String, private var address: String, private var emailAddress: String, private val password: String){

  def getName(): String = this.name
  def getPassword(): String = this.password
  def getId(): Int = this.userId

// Password validiation
  def validatePassword(password1: String){
  val NUM_UPPER_LETTERS = 2
  val NUM_LOWER_LETTERS = 3
  val NUM_DIGITS = 1
  var upperCount = 0
  var lowerCount = 0
  var digitCount = 0
  var i = 0
  val PassArray = password1.toCharArray()
  var passwordOkFlag = true
  for(i <-1 until PassArray.length) {
    if (PassArray(i).isLower)
      lowerCount = lowerCount + 1
    else if (PassArray(i).isUpper)
      upperCount = upperCount + 1
    else (PassArray(i).isDigit)
    digitCount = digitCount + 1
  }
    if (upperCount <= NUM_UPPER_LETTERS && lowerCount <= NUM_LOWER_LETTERS && digitCount <= NUM_DIGITS)
      passwordOkFlag= false
    else
      passwordOkFlag = true

  }
}
