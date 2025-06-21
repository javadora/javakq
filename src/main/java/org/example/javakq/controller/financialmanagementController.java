package org.example.javakq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class financialmanagementController{
    @GetMapping("/Salarydistribution")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String Salarydistribution() {
        return "发放工资";
    }
    @GetMapping("/Exportattendancereport")
    public String Exportattendancereport() {
        return "导出考勤报表";
    }
    @GetMapping("/Viewuserattendance")
    public String Viewuserattendance() {
        return "查看用户考勤";
    }
}
