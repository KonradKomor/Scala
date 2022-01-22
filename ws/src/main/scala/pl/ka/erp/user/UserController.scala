package pl.ka.erp.user

class UserController (private val userRepositoryImpl: UserRepositoryImpl){

  def getUser(): User ={
    userRepositoryImpl.load(1)
  }

}
