package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wl on 2019/3/14.
 */
@RestController
@RequestMapping("/add")
public class AddController {

    @RequestMapping
    public String test(){

        return  "test";
    }


}
