package com.hescsc.springboot.cf01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {


    @ResponseBody
    @GetMapping("/demo")
    public String demo(HttpServletRequest request) {

        StringBuffer requestURL = request.getRequestURL();
        String remoteAddr = request.getRemoteAddr();

        return "Hello " + remoteAddr + " from  " + requestURL;
    }


}
