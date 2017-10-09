package com.github.uryyyyyyy.springbootkotlin.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.PreparedStatementCreatorFactory
import org.springframework.jdbc.support.GeneratedKeyHolder
import java.sql.Timestamp
import java.sql.Types
import java.time.LocalDateTime
import javax.sql.DataSource

@Configuration
@Profile("prod")
class UserDao @Autowired constructor(@Qualifier("default") private val dataSource: DataSource) {

  fun insert(name: String): Int {
    val sql = "insert into sample(name, created_at) values(?, ?)"

    val fac = PreparedStatementCreatorFactory(sql, Types.VARCHAR, Types.TIMESTAMP)
    fac.setReturnGeneratedKeys(true)
    fac.setGeneratedKeysColumnNames("id")
    val pa = fac.newPreparedStatementCreator(listOf(name, Timestamp.valueOf(LocalDateTime.now())))
    val keyHolder = GeneratedKeyHolder()
    JdbcTemplate(dataSource).update(pa, keyHolder)
    return keyHolder.key.toInt()
  }

  fun selectAllName(): List<String> {
    val list = JdbcTemplate(dataSource).queryForList("SELECT * FROM sample")
    return list.map { v -> v.get("name").toString() }
  }
}
