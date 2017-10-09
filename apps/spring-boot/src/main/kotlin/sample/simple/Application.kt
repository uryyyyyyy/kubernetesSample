package sample.simple

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
open class Application : SpringBootServletInitializer() {

  companion object {
    @Throws(Exception::class)
    @JvmStatic fun main(args: Array<String>) {
      SpringApplication.run(Application::class.java, *args)
    }
  }
}