package com.BasicsSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// bean is different
// @Qualifier is different

@Configuration
public class ApplicationConfig {


    @Bean("First")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }


    @Bean("Second")
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }


    @Bean("Third")
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }



}