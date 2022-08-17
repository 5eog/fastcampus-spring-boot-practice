package com.yunji.fastcampusspringbootpractice.logic;

import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 16.
 */

public interface Sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}
