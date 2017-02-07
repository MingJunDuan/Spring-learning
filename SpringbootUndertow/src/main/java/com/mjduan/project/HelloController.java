package com.mjduan.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Duan on 2017/2/7.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world, the server is undertow instead of tomcat";
    }

}
