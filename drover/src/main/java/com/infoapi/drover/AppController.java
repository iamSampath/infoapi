package com.infoapi.drover;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class AppController{
    @RequestMapping("/")
    public String basicinfo(){
        return "Information API development in Progress";
    }

}