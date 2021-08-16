package com.it.demo.dao;

import com.it.demo.model.JiXiao;
import com.it.demo.model.JiXiaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JiXiaoMapper {

    int countByExample(JiXiaoExample example);

    int deleteByExample(JiXiaoExample example);

    int deleteByPrimaryKey(Integer jiXiaoId);

    int insert(JiXiao record);

    int insertSelective(JiXiao record);

    List<JiXiao> selectByExample(JiXiaoExample example);

    JiXiao selectByPrimaryKey(Integer jiXiaoId);

    int updateByExampleSelective(@Param("record") JiXiao record, @Param("example") JiXiaoExample example);

    int updateByExample(@Param("record") JiXiao record, @Param("example") JiXiaoExample example);

    int updateByPrimaryKeySelective(JiXiao record);

    int updateByPrimaryKey(JiXiao record);
}