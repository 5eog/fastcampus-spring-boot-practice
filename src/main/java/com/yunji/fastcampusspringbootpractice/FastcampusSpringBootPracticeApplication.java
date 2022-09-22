package com.yunji.fastcampusspringbootpractice;

import com.yunji.fastcampusspringbootpractice.properties.MyProperties;
import com.yunji.fastcampusspringbootpractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.event.EventListener;


@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastcampusSpringBootPracticeApplication {


    private final MyProperties myProperties;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSpringBootPracticeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
//        System.out.println("내 키는: " + myProperties.getHeight());
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("fred");
        studentService.printStudent("cassie");
        studentService.printStudent("cassie");
    }

}
