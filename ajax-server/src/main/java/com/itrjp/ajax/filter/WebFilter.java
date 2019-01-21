package com.itrjp.ajax.filter;/**
 * Created by renjp on 2019/1/21.
 */


import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 使用拦截器得方式配置跨域
 *
 * @author renjp
 * @Date 2019/1/21 14:11
 * @Version 1.0
 */
//@Configuration
public class WebFilter {
    @Bean
    CorsFilter corsFilter() {

        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);

    }
}
