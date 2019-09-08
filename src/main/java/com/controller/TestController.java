package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yq
 * @version 1.0
 * @date 2019/9/8 19:15
 */
@RestController

public class TestController {
    @RequestMapping("/index")
    public String index() {
        return "index-first";
    }
}
