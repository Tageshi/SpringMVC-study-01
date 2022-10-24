package com.fzj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //创建ModelAndView对象
        ModelAndView modelAndView=new ModelAndView();
        //在对象中添加属性和属性值，对应session级别的变量
        modelAndView.addObject("msg","fzj");
        //指定返回的jsp页面
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
