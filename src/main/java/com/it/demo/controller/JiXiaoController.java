package com.it.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class JiXiaoController {

    @RequestMapping(value = "/showJiXiao" ,method = RequestMethod.POST)
    public ModelAndView showJiXiao(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        // 查询返回值使用到的字段，初始化页面没有这个字段会报错，后续解决此问题
        mav.addObject("userList","");

        mav.setViewName("jixiao");

        UserController.loginFilter(mav,request);

        return mav;
    }

}
