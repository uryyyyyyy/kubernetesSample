package com.github.uryyyyyyy.springbootkotlin.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

import org.hamcrest.Matchers.containsString
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(HelloController::class)
class HelloControllerTest {

  @Autowired
  private val mvc: MockMvc? = null

  @Test
  fun helloTest() {
    mvc!!.perform(get("/hello/"))
        .andExpect(status().isOk)
        .andExpect(content().string(containsString("Hello")))
  }

  @Test
  fun helloTest2() {
    mvc!!.perform(get("/hello/10"))
        .andExpect(status().isOk)
        .andExpect(content().string(containsString("10")))
  }
}