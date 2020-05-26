package com.zjy.study.spring.springboottest.config;


import com.zjy.study.spring.springboottest.anonation.DecryptBody;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


/**
 * @Description: 自定义注解，改写适配器，将适配器的注入方式自定义
 * @author: ZJY
 * @date: 2019/5/25 11:23
 */
@Log4j2
@Component
public class DecryptResolver implements HandlerMethodArgumentResolver {

    private Logger loggerFactory = LoggerFactory.getLogger("other");

    public DecryptResolver() {
        log.info("创建一个DecryptResolver");
        loggerFactory.info("创建测试用D");
    }


    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(DecryptBody.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {

        return null;
    }


}