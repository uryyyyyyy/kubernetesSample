package com.github.uryyyyyyy.springbootkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

  @GetMapping("/")
  fun hello(): String {
    return "Hello, World!"
  }

  @GetMapping("/{num}")
  fun welcome(@PathVariable("num") number: Int): String {
    return "Hello, ${number}"
  }

}
