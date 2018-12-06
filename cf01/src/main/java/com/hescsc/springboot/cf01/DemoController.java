package com.hescsc.springboot.cf01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestController
public class DemoController {


    @Autowired
    DateCalculationService dateCalculationService;


    @ResponseBody
    @GetMapping("/demo")
    public String demo(HttpServletRequest request) {
        LocalDateTime now = LocalDateTime.now();
        return "Hello visitor, today it's the  " + now.getDayOfMonth() + ". of " + now.getMonth() + " there are " +
                dateCalculationService.secondsLeftInThisYear() + " seconds left in " + now.getYear() + " enjoy every one of them";
    }


}
