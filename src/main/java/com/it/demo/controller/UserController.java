package com.it.demo.controller;


import com.it.demo.model.User;
import com.it.demo.service.UserService;

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
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/showIndex" ,method = RequestMethod.POST)
    public ModelAndView showIndex(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        mav.setViewName("index");

        return mav;
    }

    @RequestMapping(value = "/showlogin" ,method = RequestMethod.POST)
    public ModelAndView showlogin(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        // 退出登陆，清除登陆信息
        HttpSession session = request.getSession();
        session.setAttribute("userCode",null);
        session.setAttribute("moneyQX",null);

        mav.addObject("message", " @_@ ");
        mav.setViewName("index");

        return mav;
    }

    @RequestMapping(value = "/showCalendar" ,method = RequestMethod.POST)
    public ModelAndView showCalendar(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        mav.setViewName("calendar");

        loginFilter(mav,request);

        return mav;
    }

    @RequestMapping(value = "/showTable" ,method = RequestMethod.POST)
    public ModelAndView showTable(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        // 查询返回值使用到的字段，初始化页面没有这个字段会报错，后续解决此问题
        mav.addObject("userList","");

        mav.setViewName("table");

        loginFilter(mav,request);

        return mav;
    }


    @RequestMapping(value = "/selectUserTable" ,method = RequestMethod.POST)
    public ModelAndView selectUserTable(@RequestParam("username") String username ,
                                        @RequestParam("sex")String password ,HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        mav.setViewName("table");

        // 还没登陆退到登陆
        if(!"Success".equals(loginFilter(mav,request))){

            return mav;
        }

        // 查询用户列表信息
        User user = new User();
        user.setUserName(null == username ? "" : username.trim());
        user.setSex(null == password ? "" : password.trim());

        List<User> userList = userService.selectUserListByAll(user);

        // 用户数据返回前台列表
        mav.addObject("userList",userList);

        return mav;
    }

    @RequestMapping(value = "/selectUserAjax" ,method = RequestMethod.POST)
    @ResponseBody
    public void selectUserAjax(@RequestParam("username") String username ,
                               @RequestParam("selectSex")String selectSex ,
                               @RequestParam("selectDepartment")String selectDepartment ,
                               @RequestParam("entryTime01")String entryTime01 ,
                               @RequestParam("entryTime02")String entryTime02 ,
                               @RequestParam("entryBeforeYears01")String entryBeforeYears01 ,
                               @RequestParam("entryBeforeYears02")String entryBeforeYears02 ,
                               @RequestParam("entryBeforeYearsAll01")String entryBeforeYearsAll01 ,
                               @RequestParam("entryBeforeYearsAll02")String entryBeforeYearsAll02 ,
                               @RequestParam("paixu")String paixu ,
                               HttpServletRequest request, HttpServletResponse response){

        ModelAndView mav = new ModelAndView();

        // 还没登陆退到登陆
        if("Success".equals(loginFilter(mav,request))){

            // 封装查询条件
            User user = new User();
            user.setUserName(null == username ? "" : username.trim());
            user.setSex(null == selectSex ? "" : selectSex.trim());
            user.setDepartment(null == selectDepartment ? "" : selectDepartment.trim());
            user.setEntryTime01(null == entryTime01 ? "" : entryTime01.trim());
            user.setEntryTime02(null == entryTime02 ? "" : entryTime02.trim());
            user.setEntryBeforeYears01(null == entryBeforeYears01 ? "" : entryBeforeYears01.trim());
            user.setEntryBeforeYears02(null == entryBeforeYears02 ? "" : entryBeforeYears02.trim());
            user.setEntryBeforeYearsAll01(null == entryBeforeYearsAll01 ? "" : entryBeforeYearsAll01.trim());
            user.setEntryBeforeYearsAll02(null == entryBeforeYearsAll02 ? "" : entryBeforeYearsAll02.trim());
            user.setPaixu(paixu);

            List<User> userList = userService.selectUserListByAll(user);

            // 验证账号权限，没有权限不能看薪资相关
            HttpSession session = request.getSession();
            String moneyQX = null == session.getAttribute("moneyQX") ? "" : session.getAttribute("moneyQX").toString();

            // 转换日期字符串
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (int i = 0; i < userList.size(); i++){

                if(!"Y".equals(moneyQX)){

                    BigDecimal bigDecimal =new BigDecimal(0);

                    userList.get(i).setCurrentSalary(bigDecimal);
                    userList.get(i).setEntrySalary(bigDecimal);
                    userList.get(i).setOntrialSalary(bigDecimal);
                }

                // 格式化入职时间
                userList.get(i).setEntryTime01(sdf.format(userList.get(i).getEntryTime()));
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

    @RequestMapping(value = "/showTypography" ,method = RequestMethod.POST)
    public ModelAndView showTypography(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        mav.setViewName("typography");

        loginFilter(mav,request);

        return mav;
    }

    @RequestMapping(value = "/showIcon" ,method = RequestMethod.POST)
    public ModelAndView showIcon(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();

        mav.setViewName("icon");

        loginFilter(mav,request);

        return mav;
    }

    /**
     * 处理登陆情况判断，可以用spring的AOP实现   静态方法，可以提供给其他类使用
     * @param mav
     * @param request
     * @return
     */
    public static String loginFilter(ModelAndView mav,HttpServletRequest request){

        // 默认失败状态
        HttpSession session = request.getSession();

        // 通过session 获取登陆信息
        String userCode = null == session.getAttribute("userCode") ? "Failure" : session.getAttribute("userCode").toString();

        // 能获取到登陆信息，就存储返回到页面
        if(!"Failure".equals(userCode)){

            mav.addObject("userCode", userCode);
            mav.addObject("message", "请求成功 Success");

            return "Success";

        }else{

            mav.addObject("message", "请求失败 Failure");
            mav.setViewName("login");

            return "Failure";
        }
    }
}
