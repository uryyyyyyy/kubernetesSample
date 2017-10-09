package com.github.uryyyyyyy.springbootkotlin.controller

import com.github.uryyyyyyy.springbootkotlin.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController @Autowired constructor(private val helloService: HelloService) {

  @GetMapping("/")
  fun hello(): String {
    return "Hello, World!"
  }

  @GetMapping("/{num}")
  fun welcome(@PathVariable("num") number: Int): String {
    return helloService.say(number.toString())
  }

}
