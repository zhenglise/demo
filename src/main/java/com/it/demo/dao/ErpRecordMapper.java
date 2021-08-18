package com.it.demo.dao;

import com.it.demo.model.ErpRecord;
import com.it.demo.model.ErpRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ErpRecordMapper {

    int countByExample(ErpRecordExample example);

    int deleteByExample(ErpRecordExample example);

    int deleteByPrimaryKey(Integer erpId);

    int insert(ErpRecord record);

    int insertSelective(ErpRecord record);

    List<ErpRecord> selectByExample(ErpRecordExample example);

    ErpRecord selectByPrimaryKey(Integer erpId);

    int updateByExampleSelective(@Param("record") ErpRecord record, @Param("example") ErpRecordExample example);

    int updateByExample(@Param("record") ErpRecord record, @Param("example") ErpRecordExample example);

    int updateByPrimaryKeySelective(ErpRecord record);

    int updateByPrimaryKey(ErpRecord record);
}