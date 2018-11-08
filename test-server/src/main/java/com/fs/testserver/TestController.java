package com.fs.testserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test/test")
    public String testFun(){
        return "okok";
    }

}
