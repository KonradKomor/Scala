package pl.ka.erp

import org.scalatest.FunSuite

class PasswordHashingServiceTest extends FunSuite{

  val passwordHashingService = new PasswordHashingService()
  test("Password Hashing test"){
    //given
    val password = "Password"
    //when
    val hashed = passwordHashingService.doHashing(password)
    //then
    assert(hashed == passwordHashingService.doHashing(password))
  }
}
