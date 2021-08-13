package com.it.demo.service.impl;


import com.it.demo.dao.UserMapper;
import com.it.demo.model.User;
import com.it.demo.model.UserExample;
import com.it.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.util.calendar.BaseCalendar;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserListByAll(User user) {

        // 封装查询条件
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();



        if(!"".equals(user.getUserName())){

            userCriteria.andUserNameLike(user.getUserName());
        }

        if(!"".equals(user.getSex())){

            userCriteria.andSexEqualTo(user.getSex());
        }

        if(!"".equals(user.getDepartment())){

            userCriteria.andDepartmentEqualTo(user.getDepartment());
        }

        if(!"".equals(user.getEntryTime01())){

            userCriteria.andSexEqualTo(user.getEntryTime01());
        }

        List<User> userLise = userMapper.selectByExample(userExample);

        return userLise;
    }
}
