package com.yunji.fastcampusspringbootpractice.service;

import com.yunji.fastcampusspringbootpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 16.
 */
@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("javaSort") Sort<String> sort){
        this.sort =sort;
        System.out.println("구현체는 " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
