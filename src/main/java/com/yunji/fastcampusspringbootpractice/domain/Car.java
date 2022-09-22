package com.yunji.fastcampusspringbootpractice.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 20.
 */

@Data(staticConstructor = "of")
@ToString
public class Car {
    private final String name;
    private List<Seat> seats;
}