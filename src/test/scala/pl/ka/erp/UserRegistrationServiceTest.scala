package pl.ka.erp

import org.scalatest.FunSuite

class UserRegistrationServiceTest extends FunSuite {
  val userRegistrationService = new UserRegistrationService(new UserRepositoryMapImpl(), new PasswordValidationService())

  test("UserRegistrationService.registerUser() => SUCCESS") {
    // given
    val firstName = "Konrad"
    val lastName = "Komor"
    val password = "VAlid1"
    val address = "Bytom Zachlapana 33"
    val email = "konrad@komor.com"

    // when
    val result = userRegistrationService.registerUser(firstName, lastName, address, email, password);

    // then
    assert(result)
  }

  test("UserRegistrationService.registerUser() => USER_ALREADY_EXISTS") {
    // given
    val firstName = "Konrad"
    val lastName = "Komor"
    val password = "VAlid1"
    val address = "Bytom Zachlapana 33"
    val email = "konrad@komor.com"
    userRegistrationService.registerUser(firstName, lastName, address, email, password);

    // when
    val result = userRegistrationService.registerUser(firstName, lastName, address, email, password);

    // then
    assert(!result)
  }

  test("UserRegistrationService.registerUser() => INVALID_PASSWORD") {
    // given
    val firstName = "Konrad"
    val lastName = "Komor"
    val password = "valid"
    val address = "Bytom Zachlapana 33"
    val email = "konrad@komor.com"

    // when
    val result = userRegistrationService.registerUser(firstName, lastName, address, email, password);

    // then
    assert(!result)
  }
}
