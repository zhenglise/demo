package com.it.demo.controller;


import com.it.demo.model.ErpRecord;
import com.it.demo.service.ErpRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    ErpRecordService erpRecordService;

    @RequestMapping(value = "/loginIn" ,method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView loginIn(@RequestParam("username") String username ,
                        @RequestParam("password")String password , HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        mav.addObject("message", "密码或账号为空或错误");
        mav.setViewName("login");

        if("".equals(username) || "".equals(password)){

            return mav;
        }

        ErpRecord erpRecord = new ErpRecord();

        erpRecord = erpRecordService.selectErpRecordByName(username);

        // 判断用户是否存在、判断账号密码是否对
        if(null != erpRecord && username.equals(erpRecord.getUserCode()) && password.equals(erpRecord.getPasswork())){

            // 登陆成功，调整个人详情页面
            mav.addObject("userCode", username);
            mav.addObject("message", "验证成功，跳转页面 helloWorld");
            mav.setViewName("typography");

            // 登陆成功，保存登陆用户名 作为登陆凭证
            HttpSession session = request.getSession();
            session.setAttribute("userCode", username);
            session.setAttribute("moneyQX",erpRecord.getAboutMeun());
        }

        return mav;
    }
}

