package com.fzj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    //映射访问路径
    @RequestMapping("/restful/{p1}/{p2}/{p3}")
    public String index(@PathVariable int p1, @PathVariable int p2, @PathVariable String p3,Model model){
        int result=p1+p2;
        String res2= p3+"okokokok";
        model.addAttribute("msg","p1+p2="+result+","+res2);
        return "result";
    }
    //映射访问路径
    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("msg", "hello!");
        return "result";
    }
    @PostMapping(value = "/helloP")
    public String index3(Model model){
        model.addAttribute("msg", "helloPOST!");
        return "result";
    }
}
