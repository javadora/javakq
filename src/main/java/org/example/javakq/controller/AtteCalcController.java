package org.example.javakq.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AtteCalcController {
    @GetMapping("username")
    public String userName() {
        return "名称";
    }

    @GetMapping("Doubletotal")
    public String Doubletotal() {
        return "当月总工时（分钟）";
    }

    @GetMapping("absenceTotal")
    public String absenceTotal() {
        return "当月缺勤总工时(分钟）";
    }

    @GetMapping("leaveTotal")
    public String leaveTotal() {
        return "当月度总请假工时(分钟)";
    }

    @GetMapping("sickTotal")
    public String sickTotal() {
        return "当月度总病假工时(分钟)";
    }

    @GetMapping("annualTotal")
    public String annualTotal() {
        return "当月度年假工时(分钟)";
    }
    @GetMapping("marriageTotal")
    public String marriageTotal() {
        return "当月度婚假工时(分钟)";
    }
    @GetMapping("funeralTotal")
    public String funeralTotal() {
        return "用户月度总丧假工时(分钟)";
    }
    @GetMapping("paternityTotal")
    public String paternityTotal(){
        return "月度产假总工时";
    }
    @GetMapping("compensatoryTotal")
    public String compensatoryTotal(){
        return "月度调休总工时";
    }
    @GetMapping("goOutTotal")
    public  String goOutTotal(){
        return "月度外出总工时";
    }
    @GetMapping("addTotal")
    public  String addTotal(){
        return "加班总工时";
    }
    @GetMapping("businessTotal")
    public  String businessTotal(){
        return "出差总工时";
    }
}


