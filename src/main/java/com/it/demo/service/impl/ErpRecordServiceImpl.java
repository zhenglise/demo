package com.it.demo.service.impl;

import com.it.demo.dao.ErpRecordMapper;
import com.it.demo.model.ErpRecord;
import com.it.demo.model.ErpRecordExample;
import com.it.demo.service.ErpRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpRecordServiceImpl implements ErpRecordService {

    @Autowired
    ErpRecordMapper erpRecordMapper;

    /**
     * 登陆验证账号密码使用查询
     * @param userCode
     * @return
     */
    @Override
    public List<ErpRecord> selectErpRecordByName(String userCode) {

        ErpRecordExample erpRecordExample = new ErpRecordExample();

        erpRecordExample.createCriteria().andUserCodeEqualTo(userCode);
        List<ErpRecord> list = erpRecordMapper.selectByExample(erpRecordExample);

        return list;
    }

    @Override
    public List<ErpRecord> selectErpRecordByNameAll(String userCode) {

        ErpRecordExample erpRecordExample = new ErpRecordExample();

        erpRecordExample.createCriteria().andUserCodeLike("%" + userCode + "%");
        List<ErpRecord> list = erpRecordMapper.selectByExample(erpRecordExample);

        return list;
    }
}
