package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wl on 2019/3/13.
 */
@RestController
@RequestMapping("/demo")
public class TestController {

    @RequestMapping("/")
    public  String test(){

        return "Hello";
    }

    /***
     *
     * @return
     */
    @RequestMapping("/test")
    public  String testReq(){
        return "redirect:page/html";
    }

}
