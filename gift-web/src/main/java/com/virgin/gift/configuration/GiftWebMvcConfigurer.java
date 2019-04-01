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

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        System.out.println("configure");
        resolvers.add(new GiftHandlerExceptionResolver());
        for(HandlerExceptionResolver resolver : resolvers){
            System.out.println(resolver);
        }
    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        System.out.println("extend");
        for(HandlerExceptionResolver resolver : resolvers){
            System.out.println(resolver);
        }
    }

    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor());
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        for(HttpMessageConverter converter : converters){
            System.out.println(converter);
        }
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
