package com.BasicsSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


// if there is only one constructor(can be parameterized or default) no need of @Autowired

@Service
@PropertySources(
        {
                @PropertySource("custom1.properties"),
                @PropertySource("custom2.properties")
        }
)
public class MyFirstClassService {


    private MyFirstClass myFirstClass;


    @Value("${custom1.prop}")
    private String CustomizedClassPathFileVlaue;

    @Value("${custom2.prop}")
    private String AnotherCustomizedClassPathFileVlaue;


    public String getAnotherCustomizedClassPathFileVlaue() {
        return AnotherCustomizedClassPathFileVlaue;
    }

    public String getCustomizedClassPathFileVlaue() {
        return CustomizedClassPathFileVlaue;
    }

    @Autowired
    private Environment environment;


    @Autowired
    public MyFirstClassService(@Qualifier("Third") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String saySomething() {
        return myFirstClass.sayHello();
    }


    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }

    public String getOSName() {
        return environment.getProperty("os.name");
    }

    public String getDefaultPropertiesFileValue() {
        return environment.getProperty("my.application.properties");
    }


}