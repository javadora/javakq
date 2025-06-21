package org.example.javakq.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class dataanalysisController {
    @GetMapping("/Attendancereport")
    public String Attendancereport()
    {
        return "考勤报表导出";
    }
    @GetMapping("/Clock in")
    public String Clockin()
    {
        return "上班记录查询";
    }
    @GetMapping("/Clock out")
    public String Clockout()
    {
        return "下班签退查询";
    }
}
