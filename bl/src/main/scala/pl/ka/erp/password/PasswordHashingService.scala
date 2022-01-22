package pl.ka.erp.password

import java.security.{MessageDigest, NoSuchAlgorithmException, SecureRandom}


class PasswordHashingService {
  def createSalt(): Array[Byte] = {
    val bytes: Array[Byte] = new Array[Byte](20)
    val random: SecureRandom = new SecureRandom()
    random.nextBytes(bytes)
    return bytes
  }

  def doHashing(password: String, salt: Array[Byte]): String = {
    try {
      val messageDigest: MessageDigest = MessageDigest.getInstance("SHA-256")
      messageDigest.reset()
      messageDigest.update(password.getBytes())
      messageDigest.update(salt)
      val resultByteArray: Array[Byte] = messageDigest.digest()
      val sb: StringBuilder = new StringBuilder()
      for (b <- 0 until resultByteArray.length) {
        sb.append(String.format("%02x", b))
      }
      sb.toString()
    } catch {
      case e: NoSuchAlgorithmException => {
        println("No such Algorithm Exception")
      }
        ""
    }
  }
}
