package com.tsxy.lzy.mapper;

import com.tsxy.lzy.pojo.Everyone;
import com.tsxy.lzy.pojo.EveryoneExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("EveryoneMapper")
public interface EveryoneMapper {
    int countByExample(EveryoneExample example);

    int deleteByExample(EveryoneExample example);

    int deleteByPrimaryKey(String account);

    int insert(Everyone record);

    int insertSelective(Everyone record);

    List<Everyone> selectByExample(EveryoneExample example);

    Everyone selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") Everyone record, @Param("example") EveryoneExample example);

    int updateByExample(@Param("record") Everyone record, @Param("example") EveryoneExample example);

    int updateByPrimaryKeySelective(Everyone record);

    int updateByPrimaryKey(Everyone record);
}