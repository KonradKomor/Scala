package pl.ka.erp

trait UserRepository {
  def save(user: User): Unit
  def load(userId : Int) : User
  def loadByEmail(email : String) : User

}
