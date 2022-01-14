package pl.ka.erp

import org.scalatest.FunSuite

class PasswordValidationServiceTest extends FunSuite {

  val passwordValidationService = new PasswordValidationService();

  test("Password.validate() => valid password ") {
    // given
    val password = "VAlid1"

    // when
    val actual = passwordValidationService.isValid(password)

    // then
    assert(actual)
  }

  test("Password.validate() => invalid password ") {
    // given
    val password = "invalid"

    // when
    val actual = passwordValidationService.isValid(password)

    // then
    assert(!actual)
  }
}
