package org.example.javakq.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class exceptionController {
    @GetMapping("/exception")
    public String exception(){
        return "异常报告查看";
    }
    @GetMapping("/exceptionhandle")
    public String exceptionhandle(){
        return "异常处理";
    }
}
