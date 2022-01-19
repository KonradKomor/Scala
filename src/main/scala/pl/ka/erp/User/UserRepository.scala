package pl.ka.erp.User

trait UserRepository {
  def save(user: User): Unit

  def load(userId: Int): User

  def loadByEmail(email: String): User

}
