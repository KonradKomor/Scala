package pl.ka.erp

class User(private val userId: Int, private var name: String, private var surname: String, private var address: String, private var emailAddress: String){
  def setName(x:String){
    name=x
  }
  def getName(): String ={
    return name
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
}
