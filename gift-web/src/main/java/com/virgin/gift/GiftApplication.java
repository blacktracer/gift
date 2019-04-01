package com.virgin.gift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class GiftApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GiftApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        //springApplication.setAdditionalProfiles("default");
        springApplication.run(args);
    }
}
