package com.github.uryyyyyyy.springbootkotlin.controller

import com.github.uryyyyyyy.springbootkotlin.service.HelloService
import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.mockito.Matchers.anyString
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(HelloController::class)
class HelloControllerTest {

  @Autowired
  private val mvc: MockMvc? = null

  @MockBean
  private val helloService: HelloService? = null

  @Test
  fun helloTest() {
    mvc!!.perform(get("/hello/"))
        .andExpect(status().isOk)
        .andExpect(content().string(containsString("Hello")))
  }

  @Test
  fun helloTest2() {
    given(helloService!!.say(anyString()))
        .willReturn("Hello")

    mvc!!.perform(get("/hello/10"))
        .andExpect(status().isOk)
        .andExpect(content().string(containsString("Hello")))
  }
}