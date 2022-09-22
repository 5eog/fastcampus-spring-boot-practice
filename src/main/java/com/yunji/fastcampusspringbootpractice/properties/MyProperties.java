package com.yunji.fastcampusspringbootpractice.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 20.
 */
@Getter
@RequiredArgsConstructor
@ConstructorBinding
@ConfigurationProperties("my")
public class MyProperties {

    /** 제 키에요. */
    private final Integer height;

}
