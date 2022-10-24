package com.fzj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FzjController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg","fzjfzjfzjfzj");
        modelAndView.setViewName("fzj");
        return modelAndView;
    }
}
