package com.it.demo.service.impl;

import com.it.demo.dao.UserMapper;
import com.it.demo.model.User;
import com.it.demo.model.UserExample;
import com.it.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        // 转换日期字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Date date = sdf.parse(str);

        // 名字模糊查询
        if(!"".equals(user.getUserName())){

            userCriteria.andUserNameLike("%" + user.getUserName() + "%");
        }

        // 性别精确查询
        if(!"".equals(user.getSex())){

            userCriteria.andSexEqualTo(user.getSex());
        }

        // 部门精确查询
        if(!"".equals(user.getDepartment())){

            userCriteria.andDepartmentEqualTo(user.getDepartment());
        }

        try {

            // 入职时间范围 大于
            if(!"".equals(user.getEntryTime01())){

                Date date1 = new Date(user.getEntryTime01());

                userCriteria.andEntryTimeGreaterThanOrEqualTo(date1);
            }

            // 入职时间范围 小于
            if(!"".equals(user.getEntryTime02())){

                Date date = new Date(user.getEntryTime01());
                userCriteria.andEntryTimeLessThanOrEqualTo(date);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        // 入职前年限  大于
        if(!"".equals(user.getEntryBeforeYears01())){

            // 用于转换数值
            BigDecimal bigDecimal = new BigDecimal(user.getEntryBeforeYears01());

            userCriteria.andEntryBeforeYearsGreaterThan(bigDecimal);
        }

        // 入职前年限  小于
        if(!"".equals(user.getEntryBeforeYears02())){

            BigDecimal bigDecimal = new BigDecimal(user.getEntryBeforeYears02());
            userCriteria.andEntryBeforeYearsLessThan(bigDecimal);
        }

        // 总年限  大于
        if(!"".equals(user.getEntryBeforeYearsAll01())){

            // 用于转换数值
            BigDecimal bigDecimal = new BigDecimal(user.getEntryBeforeYearsAll01());

            userCriteria.andCurrentYearsGreaterThan(bigDecimal);
        }

        // 总年限  小于
        if(!"".equals(user.getEntryBeforeYearsAll02())){

            BigDecimal bigDecimal = new BigDecimal(user.getEntryBeforeYearsAll02());
            userCriteria.andCurrentYearsLessThan(bigDecimal);
        }

        if(!"".equals(user.getPaixu()) && !"all".equals(user.getPaixu())){

            String[] byzhi = user.getPaixu().split("-");

            userExample.setOrderByClause(byzhi[0] + " " + byzhi[1]);
        }

        List<User> userLise = userMapper.selectByExample(userExample);

        return userLise;
    }

    @Override
    public User selectUserListByAId(Integer id) {

        User user = userMapper.selectByPrimaryKey(id);

        return user;
    }

    @Override
    public Integer updateUserListByAId(User user) {

        Integer i = userMapper.updateByPrimaryKeySelective(user);

        return i;
    }
}
