package com.it.demo.dao;

import com.it.demo.model.ErpRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ErpRecordMapper {

    int deleteByPrimaryKey(Integer erpId);

    int insert(ErpRecord record);

    int insertSelective(ErpRecord record);

    ErpRecord selectByPrimaryKey(Integer erpId);

    int updateByPrimaryKeySelective(ErpRecord record);

    int updateByPrimaryKey(ErpRecord record);

    ErpRecord selectErpRecordByName(String userCode);
}