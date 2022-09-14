package com.yunji.fastcampusspringbootpractice.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 25.
 */
@Getter
@ConstructorBinding
@ConfigurationProperties("my")
public class MyProperties {

    /**
     * 제 키에요
     */
    private final Integer height;

    public MyProperties(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

}
