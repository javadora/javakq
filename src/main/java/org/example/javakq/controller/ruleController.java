package org.example.javakq.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ruleController {
    @GetMapping("/rule")
    public String AtteRule(){
        return "上班规则";
    }
    @GetMapping("/date")
    public String LocalDate(){
        return "日期";
    }
    @GetMapping("/workTime")
    public String workTime(){
        return "工作时间段";
    }
    }


