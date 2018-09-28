package com.cdzic.spring_test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @creator yaotao
 * @date 2018/9/28 10:17
 * @describe:
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String test1(){
        return "帅哥你好啊！";
    }
}
