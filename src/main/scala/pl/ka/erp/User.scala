package pl.ka.erp

import java.security.KeyStore.TrustedCertificateEntry
import scala.language.postfixOps


class User(private val userId: Int, private var name: String, private var surname: String, private var address: String, private var emailAddress: String, private val password: String){
  def setName(x:String){
    name=x
  }
  def getName(): String ={
    return name
  }
  def getPassword(): String ={
    return password
  }
  def setSurname(x:String){
    surname=x
  }
  def setAddress(x:String){
    address=x
  }
  def setEmailAddress(x:String){
    emailAddress=x
  }
// Password validiation
@throws(classOf[WrongPasswordException])
  def validatePassword(password1: String){
  val NUM_UPPER_LETTERS = 2
  val NUM_LOWER_LETTERS = 3
  val NUM_DIGITS = 1
  var upperCount = 0
  var lowerCount = 0
  var digitCount = 0
  var i = 0
  val PassArray = password1.toCharArray()
  for(i <-1 until PassArray.length) {
    if (PassArray(i).isLower)
      lowerCount = lowerCount + 1
    else if (PassArray(i).isUpper)
      upperCount = upperCount + 1
    else (PassArray(i).isDigit)
    digitCount = digitCount + 1
  }
    if (upperCount <= NUM_UPPER_LETTERS && lowerCount <= NUM_LOWER_LETTERS && digitCount <= NUM_DIGITS)
      throw new WrongPasswordException("Password is not strong enough")


  }
}
