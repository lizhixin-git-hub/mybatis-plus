package com.lzx.mybatis.generator.mapper.base;

import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface BaseMapper<D, E> {

    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(Integer id);

    int insert(D domain);

    int insertSelective(D domain);

    List<D> selectByExample(E example);

    D selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") D domain, @Param("example") E example);

    int updateByExample(@Param("record") D domain, @Param("example") E example);

    int updateByPrimaryKeySelective(D record);

    int updateByPrimaryKey(D record);

}
