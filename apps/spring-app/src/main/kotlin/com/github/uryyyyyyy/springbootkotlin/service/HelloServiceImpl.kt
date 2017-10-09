package com.github.uryyyyyyy.springbootkotlin.service

import com.github.uryyyyyyy.springbootkotlin.dao.UserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Profile("prod")
class HelloServiceImpl @Autowired constructor(private val userDao: UserDao) : HelloService {

  @Transactional
  override fun say(name: String): String {
    userDao.selectAllName().forEach{ v -> println(v) }
    return "Hello, ${name}!"
  }
}

