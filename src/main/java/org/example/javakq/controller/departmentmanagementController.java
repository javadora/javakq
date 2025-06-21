package org.example.javakq.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class departmentmanagementController {
    @GetMapping("/add")
    public String add()
    {
        return "添加部门成功";
    }
    @GetMapping("/delete")
    public String delete()
        {
            return "删除部门成功";
        }
}
