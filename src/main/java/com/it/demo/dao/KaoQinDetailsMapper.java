package com.it.demo.dao;

import com.it.demo.model.KaoQinDetails;
import com.it.demo.model.KaoQinDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface KaoQinDetailsMapper {

    int countByExample(KaoQinDetailsExample example);

    int deleteByExample(KaoQinDetailsExample example);

    int deleteByPrimaryKey(Integer kaoQinDetailsId);

    int insert(KaoQinDetails record);

    int insertSelective(KaoQinDetails record);

    List<KaoQinDetails> selectByExample(KaoQinDetailsExample example);

    KaoQinDetails selectByPrimaryKey(Integer kaoQinDetailsId);

    int updateByExampleSelective(@Param("record") KaoQinDetails record, @Param("example") KaoQinDetailsExample example);

    int updateByExample(@Param("record") KaoQinDetails record, @Param("example") KaoQinDetailsExample example);

    int updateByPrimaryKeySelective(KaoQinDetails record);

    int updateByPrimaryKey(KaoQinDetails record);
}