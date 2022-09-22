package com.yunji.fastcampusspringbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 14.
 */
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Data
public class Student {
    private String name;
    private Integer age;
    private Grade grade;

    public enum Grade {
        A, B, C, D, F
    }
}