package com.it.demo.service.impl;

import com.it.demo.dao.KaoQinDetailsMapper;
import com.it.demo.dao.KaoQinMapper;
import com.it.demo.model.KaoQin;
import com.it.demo.model.KaoQinDetails;
import com.it.demo.model.KaoQinDetailsExample;
import com.it.demo.model.KaoQinExample;
import com.it.demo.service.KaoQinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class KaoQinServiceImpl implements KaoQinService {

    @Autowired
    KaoQinDetailsMapper kaoQinDetailsMapper;

    @Autowired
    KaoQinMapper kaoQinMapper;

    @Override
    public List<KaoQin> selectUserListByAll(KaoQin kaoQin) {

        KaoQinExample kaoQinExample = new KaoQinExample();
        KaoQinExample.Criteria kaoQinCriteria = kaoQinExample.createCriteria();

        return null;
    }

    @Override
    public List<KaoQinDetails> selectUserListByAll(KaoQinDetails kaoQinDetails) {

        KaoQinDetailsExample kaoQinDetailsExample = new KaoQinDetailsExample();
        KaoQinDetailsExample.Criteria kaoQinDetailsCriteria = kaoQinDetailsExample.createCriteria();

        if(!"".equals(kaoQinDetails.getUserName())){

            kaoQinDetailsCriteria.andUserNameLike("%" + kaoQinDetails.getUserName() + "%");
        }

        Calendar cal = Calendar.getInstance();

        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        // 查询绩效必须按月份查询，月份空就当前月份数据
        if(!"".equals(kaoQinDetails.getRiqiDateString())){

            String[] riqiList = kaoQinDetails.getRiqiDateString().split("/");

            //设置年份
            cal.set(Calendar.YEAR,Integer.parseInt(riqiList[2]));
            //设置月份
            cal.set(Calendar.MONTH, Integer.parseInt(riqiList[0])-1);
            //获取某月最大天数
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            //设置日历中月份的最大天数
            cal.set(Calendar.DAY_OF_MONTH, lastDay);

            String lastDayOfMonth = sdf.format(cal.getTime());

            String tt = riqiList[2] + "/" + riqiList[0] + "/01 00:00:00";

            Date date1 = new Date(tt);
            Date date2 = new Date(lastDayOfMonth + " 23:59:59");

            kaoQinDetailsCriteria.andRiqiDateBetween(date1,date2);

        }else{

            Date date = new Date();
            String date_new = sdf.format(date);

            String[] riqiList = date_new.split("/");

            //设置年份
            cal.set(Calendar.YEAR,Integer.parseInt(riqiList[0]));
            //设置月份
            cal.set(Calendar.MONTH, Integer.parseInt(riqiList[1])-1);
            //获取某月最大天数
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            //设置日历中月份的最大天数
            cal.set(Calendar.DAY_OF_MONTH, lastDay);

            String lastDayOfMonth = sdf.format(cal.getTime());

            kaoQinDetailsCriteria.andRiqiDateBetween(new Date(riqiList[0] + "/" + riqiList[1] + "/01 00:00:00"),new Date(lastDayOfMonth + " 23:59:59"));
        }

        List<KaoQinDetails> KaoQinDetailsList = kaoQinDetailsMapper.selectByExample(kaoQinDetailsExample);

        return KaoQinDetailsList;
    }
}
