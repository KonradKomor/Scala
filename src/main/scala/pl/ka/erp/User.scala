package pl.ka.erp

import scala.language.postfixOps


class User(private val userId: Int = 0, private var name: String, private var surname: String, private var address: String, private var emailAddress: String, private val password: String) {

  def getName(): String = this.name

  def getId(): Int = this.userId

  def getEmailAddress(): String = this.emailAddress;

}
