package com.it.demo.controller;

import com.it.demo.model.KaoQinDetails;
import com.it.demo.model.User;
import com.it.demo.service.KaoQinService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class KaoQinController {

    @Autowired
    KaoQinService kaoQinService;

    @RequestMapping(value = "/showKaoQin" ,method = RequestMethod.POST)
    public ModelAndView showKaoQin(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        // 查询返回值使用到的字段，初始化页面没有这个字段会报错，后续解决此问题
        mav.addObject("userList","");

        mav.setViewName("kaoqin");

        UserController.loginFilter(mav,request);

        return mav;
    }

    @RequestMapping(value = "/selectUserKaoQinDetails" ,method = RequestMethod.POST)
    @ResponseBody
    public void selectUserKaoQinDetails(@RequestParam("usernameDetails") String usernameDetails ,
                               @RequestParam("kaoQinDetailsMonth")String kaoQinDetailsMonth ,
                               HttpServletRequest request, HttpServletResponse response) {

        ModelAndView mav = new ModelAndView();

        // 还没登陆退到登陆
        if("Success".equals(UserController.loginFilter(mav,request))){

            // 封装查询条件
            KaoQinDetails kaoQinDetails = new KaoQinDetails();
            kaoQinDetails.setUserName(null == usernameDetails ? "" : usernameDetails.trim());
            kaoQinDetails.setRiqiDateString(null == kaoQinDetailsMonth ? "" : kaoQinDetailsMonth.trim());

            List<KaoQinDetails> userList = kaoQinService.selectUserListByAll(kaoQinDetails);

            // 转换日期字符串
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (int i = 0; i < userList.size(); i++){

                // 格式化时间
                userList.get(i).setRiqiDateString(sdf.format(userList.get(i).getRiqiDate()));
            }

            JSONArray array = JSONArray.fromObject(userList);

            try {

                // 异步查询形式，通过输出返回到页面
                response.setCharacterEncoding("utf-8");//响应字符集的编码格式
                response.getWriter().print(array);

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.print("输出：" + array);

        }

    }
}
