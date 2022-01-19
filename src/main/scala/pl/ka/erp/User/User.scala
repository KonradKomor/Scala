package pl.ka.erp.User

import scala.language.postfixOps


class User(private val userId: Int = 0, private var name: String, private var surname: String, private var address: String, private var emailAddress: String, private val password: String, private var salt: Array[Byte]) {
  def getName(): String = this.name

  def getId(): Int = this.userId

  def getEmailAddress(): String = this.emailAddress;
 this.salt = null
}
