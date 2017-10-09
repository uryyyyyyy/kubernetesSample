package sample.simple.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.sql.DataSource


@RestController
open class WelcomeController @Autowired constructor(
    @Qualifier("default") private val dataSource: DataSource
){

  @GetMapping("/")
  fun welcome(): Map<String, String> {
    return Collections.singletonMap("message", "hello")
  }


  @GetMapping("/selectAll")
  fun selectAll(): List<String> {
    val list = JdbcTemplate(dataSource).queryForList("SELECT name FROM sample")
    return list.map { v -> v.get("name").toString() }
  }
}