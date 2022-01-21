package pl.ka.erp.user

trait UserRepository {
  def save(user: User): Unit

  def load(userId: Int): User

  def loadByEmail(email: String): User

}
