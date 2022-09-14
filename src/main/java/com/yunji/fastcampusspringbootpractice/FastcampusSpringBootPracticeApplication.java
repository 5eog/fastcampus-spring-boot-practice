package com.yunji.fastcampusspringbootpractice;

import com.yunji.fastcampusspringbootpractice.config.MyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;


@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {

    private final MyProperties myProperties;

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println("[configurationProps] " + myProperties.getHeight());
    }


}
