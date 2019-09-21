package com.example.contorllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    //进入登陆页面;
    @RequestMapping("/index")
    public String index(){

        System.out.println("11111111111");
        return "index";
    }

}
