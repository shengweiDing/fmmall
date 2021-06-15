package com.zhiyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Administrator
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*
       Swagger会帮助我们生成接口文档
       1. 配置文档信息
       2. 配置生成规则

     */

    /**
     *  封装接口文档信息
     * @return Docket 接口文档对象
     */
    @Bean
    public Docket getDocket(){
        // 指定文档风格
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        return docket;
    }
}
