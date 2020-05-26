package com.zjy.study.spring.springboottest.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试用登录认证的拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    public LoginInterceptor() {
        System.out.println("创建一个LoginInterceptor");

    }

    /**
     * Handler执行之前调用这个方法
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        return true;
    }


}