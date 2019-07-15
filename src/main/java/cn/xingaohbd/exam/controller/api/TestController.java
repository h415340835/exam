package cn.xingaohbd.exam.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/get")
    public String get(){
        return "testController";
    }
}
