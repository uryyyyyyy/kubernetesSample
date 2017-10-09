package com.github.uryyyyyyy.springbootkotlin.service

import org.junit.Assert.assertEquals
import org.junit.Test

class HelloServiceImplTest {

  @Test
  fun sayHelloTest() {

    val service = HelloServiceImpl()
    assertEquals("Hello, World!", service.say("World"))
  }

}
