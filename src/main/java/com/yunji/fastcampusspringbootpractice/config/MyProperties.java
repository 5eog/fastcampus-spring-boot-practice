package com.yunji.fastcampusspringbootpractice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 25.
 */
@ConstructorBinding
@ConfigurationProperties("my")
public class MyProperties {

    private final Integer height;

    public MyProperties(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

}
