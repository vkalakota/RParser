package com.ufj.parser.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration(value = "myEnviroment")
@PropertySource(value = "classpath:application.properties")
public class Environment {

    @Autowired
    private org.springframework.core.env.Environment sysEnvironment;

    public String getPropertyValue(String key) {
        return sysEnvironment.getProperty(key);
    }
}
