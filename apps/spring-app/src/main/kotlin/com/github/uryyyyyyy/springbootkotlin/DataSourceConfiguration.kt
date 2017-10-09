package com.github.uryyyyyyy.springbootkotlin

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import javax.sql.DataSource

@Configuration
class DataSourceConfiguration {

  @Primary
  @Bean(name = arrayOf("default"))
  @ConfigurationProperties("app.datasource.default")
  fun getDefaultDataSource(): DataSource {
    return DataSourceBuilder.create()
        .type(HikariDataSource::class.java).build()
  }
}