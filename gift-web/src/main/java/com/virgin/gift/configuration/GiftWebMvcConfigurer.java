package com.virgin.gift.configuration;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.virgin.gift.exception.GiftHandlerExceptionResolver;
import com.virgin.gift.interceptor.LoginInterceptor;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class GiftWebMvcConfigurer implements WebMvcConfigurer {

    /**
     * 配置HandlerExceptionResolver
     * @param resolvers
     */
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(new GiftHandlerExceptionResolver());
    }

    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor());
    }

    /**
     * 配置HttpMessageConverter
     * @return
     */
    @Bean
    public HttpMessageConverters httpMessageConverters(){
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullListAsEmpty);
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        fastJsonHttpMessageConverter.setDefaultCharset(Charset.forName("UTF-8"));
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
        return new HttpMessageConverters(fastJsonHttpMessageConverter);
    }
}
