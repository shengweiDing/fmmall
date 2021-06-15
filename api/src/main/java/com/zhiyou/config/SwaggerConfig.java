package com.zhiyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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
     * 封装接口文档信息
     *
     * @return Docket 接口文档对象
     */
    @Bean
    public Docket getDocket() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        //指定生成文档的封面 标题、版本、作者
        apiInfoBuilder.title("后端接口文档").description("说明了项目中所用到的后端接口").version("2.0.1").contact(new Contact("丁胜伟", "http://www.iextreme.top", "dingshengwei1999@gmail.com"));
        // 指定文档风格  只对com.zhiyou.controller路径下的接口进行扫描,只通过user请求的
        ApiInfo apiInfor = apiInfoBuilder.build();
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfor).select().apis(RequestHandlerSelectors.basePackage("com.zhiyou.controller")).paths(PathSelectors.any()).build();

    }
}
