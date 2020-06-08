package com.tsxy.lzy.mapper;

import com.tsxy.lzy.pojo.Tv;
import com.tsxy.lzy.pojo.TvExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component("TvMapper")
public interface TvMapper {
    int countByExample(TvExample example);

    int deleteByExample(TvExample example);

    int deleteByPrimaryKey(Integer tvid);

    int insert(Tv record);

    int insertSelective(Tv record);

    List<Tv> selectByExample(TvExample example);

    Tv selectByPrimaryKey(Integer tvid);

    int updateByExampleSelective(@Param("record") Tv record, @Param("example") TvExample example);

    int updateByExample(@Param("record") Tv record, @Param("example") TvExample example);

    int updateByPrimaryKeySelective(Tv record);

    int updateByPrimaryKey(Tv record);
}