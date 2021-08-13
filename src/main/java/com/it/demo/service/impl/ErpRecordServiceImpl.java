package com.it.demo.service.impl;

import com.it.demo.dao.ErpRecordMapper;
import com.it.demo.model.ErpRecord;
import com.it.demo.service.ErpRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErpRecordServiceImpl implements ErpRecordService {

    @Autowired
    ErpRecordMapper erpRecordMapper;

    @Override
    public ErpRecord selectErpRecordByName(String userCode) {

        ErpRecord erpRecord = new ErpRecord();

        erpRecord = erpRecordMapper.selectErpRecordByName(userCode);

        return erpRecord;
    }
}
