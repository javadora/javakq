package org.example.javakq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class startController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/start")
    public String start() {
        return "考勤系统启动中";
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "欢迎使用启山考勤系统";
    }
    @GetMapping("/off")
    public String off() {
        return "考勤系统关闭中";
    }
}