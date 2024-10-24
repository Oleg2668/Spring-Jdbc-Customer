package org.example.app.config;

import org.springframework.context.annotation.ComponentScan;
// Вказує, що клас оголошує один або більше @Bean методів
// і може бути оброблений контейнером Spring для генерації
// визначень компонентів і запитів на обслуговування для
// цих компонентів під час виконання
// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html
import org.springframework.context.annotation.Configuration;
// @EnableWebMvc, у випадку REST, зокрема, виявляє існування
// Jackson (бібліотека, яка конвертує JSON та POJO)
// на шляху до класів і автоматично створює та реєструє
// стандартні конвертери JSON.
// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/config/annotation/EnableWebMvc.html
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.example.app")
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
}