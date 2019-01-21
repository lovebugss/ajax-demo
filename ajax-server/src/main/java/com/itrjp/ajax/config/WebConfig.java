package com.itrjp.ajax.config;/**
 * Created by renjp on 2019/1/21.
 */

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 *  通过配置的方式 允许跨域
 * @author renjp
 * @Date 2019/1/21 14:21
 * @Version 1.0
 */
//@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry
                .addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("Content-Type")
                .allowCredentials(true)
                .maxAge(3600);


    }
}
