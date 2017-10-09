package com.github.uryyyyyyy.springbootkotlin.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("mock")
class HelloServiceMock @Autowired constructor(): HelloService{

  override fun say(name: String): String {
    return "Hello, dummy!"
  }
}
