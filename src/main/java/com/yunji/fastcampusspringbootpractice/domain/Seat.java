package com.yunji.fastcampusspringbootpractice.domain;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 20.
 */

@AllArgsConstructor(staticName = "of")
@ToString
public class Seat {
    @ToString.Exclude private final Car car;
}