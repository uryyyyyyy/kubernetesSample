package com.github.uryyyyyyy.springbootkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class IndexController {

  @GetMapping("/")
  fun hello(): String {
    return "index"
  }

  @GetMapping("/healthz")
  fun welcome(): String {
    return "healthz"
  }

}