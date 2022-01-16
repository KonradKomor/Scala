package pl.ka.erp


import sun.jvm.hotspot.HelloWorld.e

import java.security.{MessageDigest, NoSuchAlgorithmException}


class PasswordHashingService {
  def doHashing(password: String):String ={
    try{
      var b=0
      val messageDigest:MessageDigest = MessageDigest.getInstance("MD5")

      messageDigest.update(password.getBytes())
      messageDigest.digest()
      val resultByteArray:Array[Byte]= messageDigest.digest()
      val sb:StringBuilder = new StringBuilder()
      for ( b <- 1 until resultByteArray.length){
        sb.append(String.format("%02x",b))
      }
      sb.toString()
    } catch  {
      case e: NoSuchAlgorithmException =>
        {
          println("No such Algorithm Exception")
        }
        ""
    }
  }


}
