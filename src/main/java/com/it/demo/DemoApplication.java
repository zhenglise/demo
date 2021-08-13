package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.DispatcherType;

@SpringBootApplication
public class DemoApplication {

    /*@Bean
    public FilterRegistrationBean difloginFilter() {//过滤后台的接口
        FilterRegistrationBean registration = new FilterRegistrationBean();
        LoginFilter loginFilter = new LoginFilter();
        loginFilter.setSysUsersManager(difSysUsersManager());
        registration.setFilter(loginFilter);
        registration.addUrlPatterns("/manager/*,/system/*".split(","));
        registration.addInitParameter("notCheckJsp",
                "/manager/jquery,/manager/kindeditor,/manager/head.js,/manager/script,/login.html,/manager/css,/manager/images," +
                        "/affix,/download,/showImage,/getRandomCode,/userLogin,/login_out");
        registration.addInitParameter("login_url","/manager/home/login.html");
        registration.setDispatcherTypes(DispatcherType.ASYNC,DispatcherType.FORWARD,DispatcherType.INCLUDE,DispatcherType.REQUEST);
        return registration;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
