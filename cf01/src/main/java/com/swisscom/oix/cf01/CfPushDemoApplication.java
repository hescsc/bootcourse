package com.swisscom.oix.cf01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class CfPushDemoApplication {

    public static void main(String... args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(CfPushDemoApplication.class, args);
    }
}



