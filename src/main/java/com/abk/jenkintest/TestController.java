package com.abk.jenkintest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abk on 3/18/2022
 * @project
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Welcome ABK ";
    }
}
