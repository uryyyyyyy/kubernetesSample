package sample.simple

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import javax.sql.DataSource

@Configuration
open class DataSourceConfiguration {

  @Primary
  @Bean(name = arrayOf("default"))
  @ConfigurationProperties("spring.datasource.default")
  open fun getDefaultDataSource(): DataSource {
    return DataSourceBuilder.create().build()
  }
}