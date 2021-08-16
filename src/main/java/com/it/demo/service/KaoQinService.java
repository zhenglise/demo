package com.it.demo.service;

import com.it.demo.model.KaoQin;
import com.it.demo.model.KaoQinDetails;

import java.util.List;

public interface KaoQinService {

    // 员工考勤统计
    public List<KaoQin> selectUserListByAll(KaoQin kaoQin);

    // 员工考勤记录
    public List<KaoQinDetails> selectUserListByAll(KaoQinDetails kaoQinDetails);
}
