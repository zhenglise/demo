package com.it.demo.controller;

import com.it.demo.model.ErpRecord;
import com.it.demo.service.ErpRecordService;
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
import java.util.List;

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
        mav.setViewName("index");

        if("".equals(username) || "".equals(password)){

            return mav;
        }

        List<ErpRecord> listErp = erpRecordService.selectErpRecordByName(username);

        // 判断用户是否存在、判断账号密码是否对
        if(listErp.size() > 0 && username.equals(listErp.get(0).getUserCode()) && password.equals(listErp.get(0).getPasswork())){

            // 登陆成功，调整个人详情页面
            mav.addObject("userCode", username);
            mav.addObject("message", "验证成功，跳转页面 helloWorld");
            mav.setViewName("table");

            // 登陆成功，保存登陆用户名 作为登陆凭证
            HttpSession session = request.getSession();
            session.setAttribute("userCode", username);
            session.setAttribute("moneyQX",listErp.get(0).getAboutMeun());
        }

        return mav;
    }

    /**
     * 目录跳转到账号页面
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/showErpRecord" ,method = RequestMethod.POST)
    public ModelAndView showlogin(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        // 查询返回值使用到的字段，初始化页面没有这个字段会报错，后续解决此问题
        mav.addObject("userList","");

        mav.setViewName("erprecord");

        UserController.loginFilter(mav,request);

        return mav;
    }

    /**
     * 账号查询列表异步查询数据
     *
     * @param userCode
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/selectErpRecordByNameAll" ,method = RequestMethod.POST)
    @ResponseBody
    public void selectErpRecordByNameAll(@RequestParam("userCode") String userCode , HttpServletRequest request, HttpServletResponse response){

        ModelAndView mav = new ModelAndView();

        // 还没登陆退到登陆
        if("Success".equals(UserController.loginFilter(mav, request))){

            // 封装查询条件
            ErpRecord erpRecord = new ErpRecord();
            erpRecord.setUserCode(null == userCode ? "" : userCode.trim());

            List<ErpRecord> listErp = erpRecordService.selectErpRecordByNameAll(userCode);

            JSONArray array = JSONArray.fromObject(listErp);

            try {

                // 异步查询形式，通过输出返回到页面
                response.setCharacterEncoding("utf-8");//响应字符集的编码格式
                response.getWriter().print(array);

            } catch (Exception e) {
                e.printStackTrace();
            }

            // System.out.print("输出：" + array);
        }
    }
}

