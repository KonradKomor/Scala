package pl.ka.erp.user

import org.scalatest.FunSuite
import pl.ka.erp.password.PasswordHashingService
import pl.ka.erp.user.{User, UserRepositoryMapImpl}

class UserRepositoryMapImplTest extends FunSuite {
  val passwordHashingService = new PasswordHashingService
  test("UserRepositoryMapImpl.save") {
    // given
    val repository = new UserRepositoryMapImpl()
    val salt = passwordHashingService.createSalt()
    val user = new User(1, "Adam", "Nowak", "Zachlapana 333", "adam@emxaple.com", "secret123456$", salt)

    // when
    repository.save(user)

    //then
    assert(user == repository.load(1))
  }

  test("UserRepositoryMapImpl.save2") {
    // given
    val salt = passwordHashingService.createSalt()
    val repository = new UserRepositoryMapImpl()
    val user = new User(1, "Adam", "Nowak", "Zachlapana 333", "adam@emxaple.com", "secret123456$", salt)
    val user2 = new User(2, "Elzbieta", "Knur", "Zachlapana 333", "adam@emxaple.com", "secret123456$", salt)
    val user3 = new User(3, "Tytus", "Bomba", "Zachlapana 333", "adam@emxaple.com", "secret123456$", salt)
    // when
    repository.save(user)
    repository.save(user2)
    repository.save(user3)

    //then
    assert(user == repository.load(1))
    assert(user2 == repository.load(2))
    assert(user3 == repository.load(3))
  }

  test("UserRepositoryMapImpl.loadByEmail") {
    // given
    val salt = passwordHashingService.createSalt()
    val repository = new UserRepositoryMapImpl()
    val user = new User(3, "Tytus", "Bomba", "Zachlapana 333", "tytus@bomba.com", "secret123456$", salt)
    // when
    repository.save(user)

    //then
    assert(user == repository.loadByEmail("tytus@bomba.com"))
  }

  test("UserRepositoryMapImpl.loadByEmail2") {
    // given
    val repository = new UserRepositoryMapImpl()
    //then
    assert(null == repository.loadByEmail("tytus@bomba.com"))
  }
}
