package org.example.javakq.controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
/**
 * @author lixiang
 */
@RestController
public class qsktmenuController {
    @GetMapping("/qsktmenu")
    public String qsktmenu() {
        {
            return "考勤系统菜单";
        }
    }
    @GetMapping("/qiandao")
    public String qiandao() {
        return "上班签到！";
    }
    @GetMapping("/qingjia")
    public String qingjia() {
        return "请假申请！";
    }
    @GetMapping("/kaoqin")
    public String kaoqin() {
        return "考勤查询！";
    }
    @GetMapping("/qiantui")
    public String qianTui() {
        return "下班打卡";
    }
    @GetMapping("jiluchaxun")
    public String jiluchaxun() {
        return "上班记录查询";
    }
    @GetMapping("/end")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String end() {
        return "结束请求成功";
    }
    @GetMapping("/statistic")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String statistic() {
        return "考勤月度统计";
    }
    @GetMapping("/query/rule")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String rule() {
        return "查询规则日期";
    }
    @GetMapping("/set/rule")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String set() {
        return "设置规则日期";
    }
    @GetMapping("/del/rule")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String delete() {
        return "删除规则日期";
    }
    @GetMapping("/set/add")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String add(){
        return "设置当月规则日期";
    }
    @GetMapping("/query/config")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String config(){
        return "查询配置";
    }
    @GetMapping("/set/config")  // 完整路径为：/api/qiantui（若配合@RequestMapping）
    public String setconfig(){
        return "设置配置";
    }
    @GetMapping("/query/user")
    public String queryuser(){
        return "查询用户";
    }
    @GetMapping("/set/user")
    public String setuser(){
        return "设置用户";
    }

}
