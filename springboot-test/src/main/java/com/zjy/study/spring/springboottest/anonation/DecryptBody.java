package com.zjy.study.spring.springboottest.anonation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 自定义注解对参数进行AES解密
 * @author: ZJY
 * @date: 2019/5/25 11:19
 */

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface DecryptBody {

    public final static String AES = "AES";

    public final static String BASE64 = "BASE64";

    boolean required() default true;

    String use() default AES;


}
