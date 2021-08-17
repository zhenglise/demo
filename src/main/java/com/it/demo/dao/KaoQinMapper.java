package com.it.demo.dao;

import com.it.demo.model.KaoQin;
import com.it.demo.model.KaoQinExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface KaoQinMapper {

    int countByExample(KaoQinExample example);

    int deleteByExample(KaoQinExample example);

    int deleteByPrimaryKey(Integer kaoQinId);

    int insert(KaoQin record);

    int insertSelective(KaoQin record);

    List<KaoQin> selectByExample(KaoQinExample example);

    KaoQin selectByPrimaryKey(Integer kaoQinId);

    int updateByExampleSelective(@Param("record") KaoQin record, @Param("example") KaoQinExample example);

    int updateByExample(@Param("record") KaoQin record, @Param("example") KaoQinExample example);

    int updateByPrimaryKeySelective(KaoQin record);

    int updateByPrimaryKey(KaoQin record);

    // 特殊自己写的方法，更新用户部门 职位
    int updateByPrimaryTime(KaoQin record);
}