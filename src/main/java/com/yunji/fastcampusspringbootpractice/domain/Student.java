package com.yunji.fastcampusspringbootpractice.domain;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 14.
 */
public record Student(
        String name,
        Integer age,
        Grade grade
) {
    private enum Grade {
        A, B, C, D
    }
}
