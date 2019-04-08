package com.virgin.gift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class GiftApplication {
    public static void main(String[] args) {
        SpringApplication.run(GiftApplication.class, args);
    }
}
