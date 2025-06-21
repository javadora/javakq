package org.example.javakq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class searchController {
    @GetMapping("/search")
    public String search(@RequestParam String query) {
        return "搜索员工信息和考勤情况" + query;
    }
}
