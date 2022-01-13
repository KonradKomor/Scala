package pl.ka.erp

import org.scalatest.FunSuite

class UserRepositoryMapImplTest extends FunSuite {

  test("UserRepositoryMapImpl.save") {
    // given
    val repository = new UserRepositoryMapImpl()
    val user = new User(1, "Adam", "Nowak", "Zachlapana 333", "adam@emxaple.com", "secret123456$")

    // when
    repository.save(user)

    //then
    assert(user == repository.load(1))
  }

  test("UserRepositoryMapImpl.save2") {
    // given
    val repository = new UserRepositoryMapImpl()
    val user = new User(1, "Adam", "Nowak", "Zachlapana 333", "adam@emxaple.com", "secret123456$")
    val user2 = new User(2, "Elzbieta", "Knur", "Zachlapana 333", "adam@emxaple.com", "secret123456$")
    val user3 = new User(3, "Tytus", "Bomba", "Zachlapana 333", "adam@emxaple.com", "secret123456$")
    // when
    repository.save(user)
    repository.save(user2)
    repository.save(user3)

    //then
    assert(user == repository.load(1))
    assert(user2 == repository.load(2))
    assert(user3 == repository.load(3))
  }
}
