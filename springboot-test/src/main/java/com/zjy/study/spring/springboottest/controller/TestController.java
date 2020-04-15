package com.zjy.study.spring.springboottest.controller;


import com.alibaba.fastjson.JSON;
import com.zjy.study.spring.springboottest.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zjy
 * @Date: 2020-04-13 11:34
 */
@RestController
public class TestController {

    public TestController() {
        System.out.println("启动");
    }

    @PostMapping(value = "test01")
    public String test01(@RequestBody Student student) {

        System.out.println(JSON.toJSONString(student));
        return "test01";
    }




}