package com.example.jrb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Uicontroller {

    @GetMapping("/")
    public String testUi(){
        return "index";
    }
}
