package org.example.javakq.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lixiang
 */
@RestController
public class askforleaveController {
    @GetMapping("/privateaffairleave")
    public String leave(){
        return "事假！";
    }
    @GetMapping("/sickleave")
    public String sickleave(){
        return "病假";
    }
    @GetMapping("/yearleave")
    public String yearleave(){
        return "年假";
    }
    @GetMapping("/marryleave")
    public String marryleave(){
        return "婚假";
    }
    @GetMapping("/childleave")
    public String childleave(){
        return "产假";
    }
    @GetMapping("/paternityleave")
    public String paternityleave(){
        return "陪产假";
    }
    @GetMapping("/Bereavementleave")
    public String Bereavementleave(){
        return "丧假";
    }
@GetMapping("/forget")
    public String forget(){
        return "忘打卡";
    }
    @GetMapping("/overtime")
    public String overtime(){
        return "加班";
    }
    @GetMapping("/out")
    public String out(){
        return "外出";
    }
    @GetMapping("/business")
    public String business(){
        return "出差";
    }
    @GetMapping("/duty")
    public String duty(){
        return "调休";
    }
}
