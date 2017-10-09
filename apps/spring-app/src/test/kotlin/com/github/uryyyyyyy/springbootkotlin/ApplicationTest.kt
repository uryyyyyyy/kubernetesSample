package com.github.uryyyyyyy.springbootkotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTest {

  @Autowired
  private var ctx: ApplicationContext? = null

  @Test
  @Throws(Exception::class)
  fun testContextLoads() {
    assertThat(this.ctx).isNotNull()
    assertThat(this.ctx!!.containsBean("helloController")).isTrue()
  }
}
