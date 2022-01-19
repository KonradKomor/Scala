package pl.ka.erp

import org.springframework.boot.SpringApplication

object Demo {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[App],args:_*)
  }
}
