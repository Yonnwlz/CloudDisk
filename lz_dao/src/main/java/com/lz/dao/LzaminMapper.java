package com.lz.dao;

import com.lz.model.pojo.Lzamin;
import com.lz.model.pojo.LzaminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface LzaminMapper {
    long countByExample(LzaminExample example);

    int deleteByExample(LzaminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Lzamin record);

    int insertSelective(Lzamin record);

    List<Lzamin> selectByExample(LzaminExample example);

    Lzamin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Lzamin record, @Param("example") LzaminExample example);

    int updateByExample(@Param("record") Lzamin record, @Param("example") LzaminExample example);

    int updateByPrimaryKeySelective(Lzamin record);

    int updateByPrimaryKey(Lzamin record);
}