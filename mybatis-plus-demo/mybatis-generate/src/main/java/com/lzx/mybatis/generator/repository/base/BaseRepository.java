package com.lzx.mybatis.generator.repository.base;

import java.util.List;

import com.lzx.mybatis.generator.mapper.base.BaseMapper;

public abstract class BaseRepository<Record, Example> {

    public long countByExample(Example example) {
        return getMapper().countByExample(example);
    }

    public int deleteByExample(Example example) {
        return getMapper().deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    public int insert(Record domain) {
        return getMapper().insert(domain);
    }

    public int insertSelective(Record domain) {
        return getMapper().insertSelective(domain);
    }

    public List<Record> selectByExample(Example example) {
        return getMapper().selectByExample(example);
    }

    public Record selectByPrimaryKey(Integer id) {
        return getMapper().selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(Record domain, Example example) {
        return getMapper().updateByExampleSelective(domain, example);
    }

    public int updateByExample(Record domain, Example example) {
        return getMapper().updateByExample(domain, example);
    }

    public int updateByPrimaryKeySelective(Record record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Record record) {
        return getMapper().updateByPrimaryKey(record);
    }

    public abstract BaseMapper<Record, Example> getMapper();

}
