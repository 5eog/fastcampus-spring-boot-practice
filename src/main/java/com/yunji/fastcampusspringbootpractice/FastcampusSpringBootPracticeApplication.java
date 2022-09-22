package com.yunji.fastcampusspringbootpractice;

import com.yunji.fastcampusspringbootpractice.properties.MyProperties;
import com.yunji.fastcampusspringbootpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.event.EventListener;


@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {


    private final MyProperties myProperties;
    private final StudentService studentService;
    private final String username;
    private final String password;

    public FastcampusSpringBootPracticeApplication(
            MyProperties myProperties,
            StudentService studentService,
            @Value("${spring.datasource.username:}") String username,
            @Value("${spring.datasource.password:}") String password
    ) {
        this.myProperties = myProperties;
        this.studentService = studentService;
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        System.out.println("name : " + username);
        System.out.println("password : " + password);
    }

}
