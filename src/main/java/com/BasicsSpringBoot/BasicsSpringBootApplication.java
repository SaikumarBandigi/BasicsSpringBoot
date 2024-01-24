package com.BasicsSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicsSpringBootApplication {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = SpringApplication.run(BasicsSpringBootApplication.class, args);
        MyFirstClassService myFirstClassService = context.getBean(MyFirstClassService.class);

        System.out.println(myFirstClassService.saySomething());
        System.out.println(myFirstClassService.getOSName());
        System.out.println(myFirstClassService.getJavaVersion());
        System.out.println(myFirstClassService.getDefaultPropertiesFileValue());
        System.out.println(myFirstClassService.getCustomizedClassPathFileVlaue());
        System.out.println(myFirstClassService.getAnotherCustomizedClassPathFileVlaue());
    }


}


