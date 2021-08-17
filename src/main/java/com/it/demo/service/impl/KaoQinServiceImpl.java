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
import java.util.ArrayList;
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


        // 模糊查询员工名称
        if(!"".equals(kaoQin.getUserName())){

            kaoQinCriteria.andUserNameLike("%" + kaoQin.getUserName() + "%");
        }

        // 部门精确查询
        if(!"".equals(kaoQin.getDepartment())){

            kaoQinCriteria.andDepartmentEqualTo(kaoQin.getDepartment());
        }

        Calendar cal = Calendar.getInstance();

        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        // 查询考勤必须按月份查询，月份空就当前月份数据
        if(!"".equals(kaoQin.getKaoQinMonth01())){

            String[] riqiList = kaoQin.getKaoQinMonth01().split("/");

            //设置年份
            cal.set(Calendar.YEAR,Integer.parseInt(riqiList[2]));
            //设置月份
            cal.set(Calendar.MONTH, Integer.parseInt(riqiList[0])-1);
            //获取某月最大天数
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            //设置日历中月份的最大天数
            cal.set(Calendar.DAY_OF_MONTH, lastDay);

            String lastDayOfMonth = sdf.format(cal.getTime());

            kaoQinCriteria.andKaoQinMonthBetween(new Date(riqiList[2] + "/" + riqiList[0] + "/01 00:00:00"), new Date(lastDayOfMonth + " 23:59:59"));

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

            kaoQinCriteria.andKaoQinMonthBetween(new Date(riqiList[0] + "/" + riqiList[1] + "/01 00:00:00"),new Date(lastDayOfMonth + " 23:59:59"));
        }

        // 排序
        if(!"".equals(kaoQin.getPaixu()) && !"all".equals(kaoQin.getPaixu())){

            String[] byzhi = kaoQin.getPaixu().split("-");

            kaoQinExample.setOrderByClause(byzhi[0] + " " + byzhi[1]);
        }

        List<KaoQin> kaoQinList = kaoQinMapper.selectByExample(kaoQinExample);

        return kaoQinList;
    }

    @Override
    public List<KaoQinDetails> selectUserListByAll(KaoQinDetails kaoQinDetails) {

        KaoQinDetailsExample kaoQinDetailsExample = new KaoQinDetailsExample();
        KaoQinDetailsExample.Criteria kaoQinDetailsCriteria = kaoQinDetailsExample.createCriteria();

        // 模糊查询员工名称
        if(!"".equals(kaoQinDetails.getUserName())){

            kaoQinDetailsCriteria.andUserNameLike("%" + kaoQinDetails.getUserName() + "%");
        }

        Calendar cal = Calendar.getInstance();

        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        // 查询考勤必须按月份查询，月份空就当前月份数据
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

            kaoQinDetailsCriteria.andRiqiDateBetween(new Date(riqiList[2] + "/" + riqiList[0] + "/01 00:00:00"), new Date(lastDayOfMonth + " 23:59:59"));

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

    @Override
    public String insertKaoQinByTime(KaoQinDetails kaoQinDetails) {

        // 第一步 -----------拼接出时间范围，提供给下面删除与查询插入使用------------- strat
        Calendar cal = Calendar.getInstance();

        // 开始时间与结束时间范围值字段
        Date startTime;
        Date endTime;
        Date monthTime;

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        // 如果有填日期就使用填的日期范围处理，如果没有填就按当前时间处理
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

            startTime = new Date(riqiList[2] + "/" + riqiList[0] + "/01 00:00:00");
            endTime = new Date(lastDayOfMonth + " 23:59:59");
            monthTime = new Date(riqiList[2] + "/" + riqiList[0] + "/08 00:00:00");

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

            startTime = new Date(riqiList[0] + "/" + riqiList[1] + "/01 00:00:00");
            endTime = new Date(lastDayOfMonth + " 23:59:59");
            monthTime = new Date(riqiList[0] + "/" + riqiList[1] + "/08 00:00:00");
        }

        // 第一步-----------拼接出时间范围，提供给下面删除与查询插入使用--------- end


        // 第二步---------------通过时间先删除已经存在月份的数据-------------- strat
        KaoQinExample kaoQinExample = new KaoQinExample();
        KaoQinExample.Criteria kaoQinCriteria = kaoQinExample.createCriteria();

        // 删除时间范围
        kaoQinCriteria.andKaoQinMonthBetween(startTime,endTime);

        kaoQinMapper.deleteByExample(kaoQinExample);
        // 第二步---------------通过时间先删除已经存在月份的数据-------------- end



        // 第三步---------------查询考勤详情，统计生成数据 ------------------ strat
        KaoQinDetailsExample kaoQinDetailsExample = new KaoQinDetailsExample();
        KaoQinDetailsExample.Criteria kaoQinDetailsCriteria = kaoQinDetailsExample.createCriteria();

        kaoQinDetailsCriteria.andRiqiDateBetween(startTime,endTime);
        kaoQinDetailsExample.setOrderByClause("user_name desc");

        // 查询出指定时间范围的考勤详情数据
        List<KaoQinDetails> KaoQinDetailsList = kaoQinDetailsMapper.selectByExample(kaoQinDetailsExample);

        List<KaoQin> kaoQinList = new ArrayList<KaoQin>();
        KaoQin kaoQin = new KaoQin();
        String userName = "";

        Integer qiqian = 0; // 7点前
        Integer qihou = 0;  // 7点后
        Integer bahou = 0;  // 8点后
        Integer jiuhou = 0; // 9点后
        Integer shihou = 0; // 10点后
        Integer serhou = 0; // 12点后
        Integer jer = 0;    // 9-12点后

        for (int i = 0; i < KaoQinDetailsList.size(); i++){

            KaoQinDetails kaoQinDetails_new = KaoQinDetailsList.get(i);

            // 如果上班时间与下班时间与状态都为空，那么跳过此数据统计
            if(("".equals(kaoQinDetails_new.getZaoTime()) || null == kaoQinDetails_new.getZaoTime())
                    && ("".equals(kaoQinDetails_new.getZaoStart()) || null == kaoQinDetails_new.getZaoStart())
                    && ("".equals(kaoQinDetails_new.getWanTime()) || null == kaoQinDetails_new.getWanTime())
                    && ("".equals(kaoQinDetails_new.getWanStart()) || null == kaoQinDetails_new.getWanStart())){

                continue;
            }

            // 如果名字还是相同，继续累加
            if(userName.equals(kaoQinDetails_new.getUserName())){

                // 判断下班时间是否为空，如果为空按正常下班统计 18点下班
                if(null != kaoQinDetails_new.getWanTime() && !"".equals(kaoQinDetails_new.getWanTime())){

                    // 截取时间字符转换成 数值，做判断
                    Integer shiTime = Integer.parseInt(kaoQinDetails_new.getWanTime().substring(0,2));

                    if(shiTime > 11 && shiTime < 19){

                        qiqian = qiqian + 1;

                    }else if(shiTime >= 19 && shiTime < 20){

                        qihou = qihou + 1;

                    }else if(shiTime >= 20 && shiTime < 21){

                        bahou = bahou + 1;

                    }else if(shiTime >= 21 && shiTime < 22){

                        jiuhou = jiuhou + 1;

                    }else if(shiTime >= 22 && shiTime < 23){

                        shihou = shihou + 1;

                    }else if(shiTime < 11){

                        serhou = serhou + 1;
                    }
                }else{

                    qiqian = qiqian + 1;
                }

            }else{

                // 第一次的不放，上面判断不同一个用户后，先保存上个用户的信息集
                if(i != 0 && !"".equals(userName)){

                    kaoQin.setUserName(userName);
                    kaoQin.setSevenBefore(qiqian);
                    kaoQin.setSevenAfter(qihou);
                    kaoQin.setEightAfter(bahou);
                    kaoQin.setNineAfter(jiuhou);
                    kaoQin.setTenAfter(shihou);
                    kaoQin.setTwelveAfter(serhou);
                    kaoQin.setNineTwelveAfter(jiuhou + shihou + serhou);

                    kaoQin.setAttendanceDate(qiqian + qihou + bahou + jiuhou + shihou + serhou);
                    kaoQin.setKaoQinMonth(monthTime);

                    kaoQinList.add(kaoQin);
                }

                kaoQin = new KaoQin();

                // 下一个人员的数据从新统计，初始化次数
                qiqian = 0; // 7点前
                qihou = 0;  // 7点后
                bahou = 0;  // 8点后
                jiuhou = 0; // 9点后
                shihou = 0; // 10点后
                serhou = 0; // 12点后
                jer = 0;    // 9-12点后

                // 判断下班时间是否为空，如果为空按正常下班统计 18点下班
                if(null != kaoQinDetails_new.getWanTime() && !"".equals(kaoQinDetails_new.getWanTime())){

                    // 截取时间字符转换成 数值，做判断
                    Integer shiTime = Integer.parseInt(kaoQinDetails_new.getWanTime().substring(0,2));

                    if(shiTime > 11 && shiTime < 19){

                        qiqian = qiqian + 1;

                    }else if(shiTime >= 19 && shiTime < 20){

                        qihou = qihou + 1;

                    }else if(shiTime >= 20 && shiTime < 21){

                        bahou = bahou + 1;

                    }else if(shiTime >= 21 && shiTime < 22){

                        jiuhou = jiuhou + 1;

                    }else if(shiTime >= 22 && shiTime < 23){

                        shihou = shihou + 1;

                    }else if(shiTime < 11){

                        serhou = serhou + 1;
                    }
                }else{

                    qiqian = qiqian + 1;
                }

                // 处理最后，用于下个循环判断是否同一个用户名称
                userName = kaoQinDetails_new.getUserName();
            }
        }

        // 处理循环最后一次的数据集合统计
        kaoQin.setUserName(userName);

        kaoQin.setSevenBefore(qiqian);
        kaoQin.setSevenAfter(qihou);
        kaoQin.setEightAfter(bahou);
        kaoQin.setNineAfter(jiuhou);
        kaoQin.setTenAfter(shihou);
        kaoQin.setTwelveAfter(serhou);
        kaoQin.setNineTwelveAfter(jiuhou + shihou + serhou);

        kaoQin.setAttendanceDate(qiqian + qihou + bahou + jiuhou + shihou + serhou);
        kaoQin.setKaoQinMonth(monthTime);

        kaoQinList.add(kaoQin);

        // 第三步---------------查询考勤详情，统计生成数据 ------------------ end


        // 第四步---------------批量插入--------------------- strat
        for(int i = 0;i < kaoQinList.size(); i++){

            /**
             * 特别说明，SQL语句不能循环操作，要么一次查询或一次插入，插入如果过多可以分批
             * 必须要自己写批量插入方法，当前偷懒了，使用Mapper提供的插入方法了
             *
             */
            kaoQinMapper.insertSelective(kaoQinList.get(i));
        }
        // 第四步---------------批量插入--------------------- strat

        kaoQin = new KaoQin();

        kaoQin.setKaoQinMonth(startTime);
        kaoQin.setKaoQinMonth1(endTime);

        kaoQinMapper.updateByPrimaryTime(kaoQin);

        return "生成成功！！";
    }
}
