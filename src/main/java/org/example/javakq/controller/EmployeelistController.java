package org.example.javakq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class EmployeelistController {
    @GetMapping("/Employeelist")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String Employeelist() {
        return "员工列表";
    }
    @GetMapping("/Applyforemployment")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String Applyforemployment() {
        return "办理入职";
    }
    @GetMapping("/addEmployeelist")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String addEmployeelist() {
        return "添加员工";
    }
    @GetMapping("/deleteEmployeelist")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String deleteEmployeelist() {
        return "删除员工";
    }
    @GetMapping("/updateEmployeelist")
    public String updateEmployeelist() {
        return "修改员工";
    }
    @GetMapping("/queryEmployeelist")
    public String queryEmployeelist() {
        return "查询员工";
    }
    @GetMapping("/setEmployeelist")
    public String setEmployeelist() {
        return "设置员工";
    }
    @GetMapping("/exportEmployeelist")
    public String exportEmployeelist() {
        return "导出员工";
    }
    @GetMapping("/importEmployeelist")
    public String importEmployeelist() {
        return "导入员工";
    }
    @GetMapping("/suncheng")
    public String suncheng () {
        return "员工姓名：孙诚";
    }
    @GetMapping("/Manager")
    public String RDManager () {
        return "职位：研发部经理";
    }
    @GetMapping("/lixiang")
    public String lixiang() {
        return "员工姓名：黎想";
    }
    @GetMapping("/internship")
    public String internship() {
        return "职位：实习生";
    }
    @GetMapping("/dengbo")
    public String dengbo() {
        return "员工姓名：邓博";
    }
    @GetMapping("/SoftwareTestingEngineer")
    public String SoftwareTestingEngineer() {
        return "职位：软件测试工程师";
    }
    @GetMapping("/guoben")
    public String guoben() {
        return "员工姓名：郭奔";
    }
    @GetMapping("/Head of Marketing Department")
    public String Head_of_Marketing_Department() {
        return "职位：市场部经理";
    }
    @GetMapping("/huwei")
    public String huwei() {
        return "员工姓名：胡魏";
    }
    @GetMapping("/CProduct Director")
    public String ProductDirector() {
        return "职位：产品总师";
    }
    @GetMapping("/jinxiaopeng")
    public String jinxiaopeng() {
        return "员工姓名：金小鹏";
    }
    @GetMapping("/administrative authorities")
    public String administrative_authorities() {
        return "职位：行政部经理";
    }
    @GetMapping("/xiongfeiteng")
    public String xiongfeiteng() {
        return "员工姓名：熊飞腾";
    }
    @GetMapping("/Vice President of the company")
    public String Vice_President_of_the_company() {
        return "职位：公司副总";
    }
}
