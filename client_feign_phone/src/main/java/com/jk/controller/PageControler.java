package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("page")
public class PageControler {

    @RequestMapping("show")
    public String index(){
        return "show";
    }

    @RequestMapping("add")
    public String add(){
        return "add";
    }
  
}
