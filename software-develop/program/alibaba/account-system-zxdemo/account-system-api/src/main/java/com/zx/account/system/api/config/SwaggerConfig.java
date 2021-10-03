package com.zx.account.system.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @description:
 * @author: zx
 * @create: 2021-09-28 14:09
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("account-system")
                .apiInfo(apiInfo())
                .select()
                .paths(petstorePaths())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("account system zxdemo API")
                .description("这套API模拟了一个非常简单版本的账户系统，用来做spring-cloud-alibaba等框架和中间件的demo")
                .termsOfServiceUrl("http://localhost")
                .contact(new Contact("大雄", "", ""))
                .version("2.0")
                .build();
    }

    private Predicate<String> petstorePaths() {
        return regex("/V1/payment.*");
    }
}
