package com.it.demo.service;

import com.it.demo.model.ErpRecord;

import java.util.List;

public interface ErpRecordService {

    /**
     * 精确查询，登陆使用
     * @param userCode
     * @return
     */
    public List<ErpRecord> selectErpRecordByName(String userCode);

    /**
     * 模糊查询，列表查询使用
     * @param userCode
     * @return
     */
    public List<ErpRecord> selectErpRecordByNameAll(String userCode);
}
