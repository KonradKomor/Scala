package pl.ka.erp.password

import org.scalatest.FunSuite
import pl.ka.erp.password.PasswordValidationService

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
