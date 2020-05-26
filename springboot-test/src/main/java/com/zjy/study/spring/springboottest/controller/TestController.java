package com.zjy.study.spring.springboottest.controller;


import com.alibaba.fastjson.JSON;
import com.zjy.study.spring.springboottest.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zjy
 * @Date: 2020-04-13 11:34
 */
@Log4j2
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

    @PostMapping(value = "test02")
    public Object test02(@RequestBody Student student) {

        System.out.println(JSON.toJSONString(student));
        return student;
    }
    @PostMapping(value = "test03")
    public String test03(@RequestBody String student) {
        log.debug("哈哈哈");
        System.out.println(JSON.toJSONString(student));
        return student;
    }

    @PostMapping(value = "test03/{test}")
    public String test04(@RequestBody String student, @PathVariable String test) {
        System.out.println(test);
        System.out.println(JSON.toJSONString(student));
        return student;
    }

}