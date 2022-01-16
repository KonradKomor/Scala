package pl.ka.erp

class UserRegistrationService(private val userRepository: UserRepository, private val passwordValidationService: PasswordValidationService, private val passwordHashingService: PasswordHashingService) {
  // TODO doać klasę reslut z polem success i ewentualnym kodem błędu zamiast tych flag
  private val USER_ALREADY_EXISTS = false
  private val INVALID_PASSWORD = false
  private val SUCCESS = true

  def registerUser(firstName: String, lastName: String, address: String, emailAddress: String, password: String): Boolean = {
    val salt = passwordHashingService.createSalt()
    if (this.userRepository.loadByEmail(emailAddress) != null) {
      return USER_ALREADY_EXISTS
    }

    if (!passwordValidationService.isValid(password)) {
      return INVALID_PASSWORD
    }

    this.userRepository.save(new User(0, firstName, lastName, address, emailAddress, password,salt))

    SUCCESS
  }
}
