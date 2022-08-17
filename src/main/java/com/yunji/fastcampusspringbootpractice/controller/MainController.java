package com.yunji.fastcampusspringbootpractice.controller;

import com.yunji.fastcampusspringbootpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 17.
 */
@RestController
public class MainController {

    private final SortService service;

    public MainController(SortService service){
        this.service = service;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list){
        return service.doSort(list).toString();
    }
}
