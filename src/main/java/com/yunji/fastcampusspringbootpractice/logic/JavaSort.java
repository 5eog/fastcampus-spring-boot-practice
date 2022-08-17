package com.yunji.fastcampusspringbootpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 12.
 */
@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<T>(list);

        Collections.sort(output);

        return output;
    }
}
