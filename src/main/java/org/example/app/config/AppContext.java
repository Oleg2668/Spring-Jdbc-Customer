package org.example.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

// @Configuration використовується для вказівки того,
// що клас конфігурації оголошує один або кілька
// методів @Bean.
// Ці класи обробляються контейнером Spring для генерації
// визначень bean-компонентів та запитів на обслуговування
// для цих bean-компонентів під час виконання.
@Configuration
// @ComponentScan використовується для вказівки базових пакетів
// для сканування компонентів.
@ComponentScan("org.example.app")
// @PropertySource забезпечує механізм додавання
// PropertySource в Spring Environment для використання
// у поєднанні з класами @Configuration.
@PropertySource("classpath:app.properties")
public class AppContext {

    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource =
                new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty("dbUrl"));
        driverManagerDataSource.setUsername(environment.getProperty("dbUser"));
        driverManagerDataSource.setPassword(environment.getProperty("dbPass"));
        driverManagerDataSource.setDriverClassName(
                Objects.requireNonNull(environment.getProperty("jdbcDriver")));
        return driverManagerDataSource;
    }
}
