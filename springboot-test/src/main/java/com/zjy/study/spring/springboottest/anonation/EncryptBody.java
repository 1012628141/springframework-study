package com.zjy.study.spring.springboottest.anonation;

import java.lang.annotation.*;

/**
 * @Description: 自定义注解，利用Aop统一处理返回加密数据
 * @author: ZJY
 * @date: 2019/5/25 10:05
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface EncryptBody {


    boolean md5() default true;

    boolean aes() default true;


}
