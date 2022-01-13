package pl.ka.erp

import scala.collection.immutable.HashMap

class UserRepositoryMapImpl(private var map: HashMap[Int, User] = new HashMap[Int, User]()) extends UserRepository {
  override def save(user: User): Unit = this.map += (user.getId() -> user)

  override def load(userId: Int): User = this.map.getOrElse(userId, null)
}
