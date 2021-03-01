package com.lzx.mybatis.generator.repository;


import com.lzx.mybatis.generator.mapper.EduClassMapperExt;
import com.lzx.mybatis.generator.mapper.base.BaseMapper;
import com.lzx.mybatis.generator.model.EduClass;
import com.lzx.mybatis.generator.model.EduClassExample;
import com.lzx.mybatis.generator.repository.base.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EduClassRepository
 * Created by src on 2020/5/30.
 */
@Repository
public class EduClassRepository extends BaseRepository<EduClass, EduClassExample> {

    private EduClassMapperExt mapper;

    @Autowired
    public void setMapper(EduClassMapperExt mapper) {
        this.mapper = mapper;
    }

    @Override
    public BaseMapper<EduClass, EduClassExample> getMapper() {
        return mapper;
    }

    public List<EduClass> selectByExamplePage(EduClassExample example, Integer pageNo, Integer pageSize) {
        if (pageNo == null) pageNo = 0;
        if (pageSize == null) pageSize = 20;
        example.setOffset(pageNo * pageSize);
        example.setLimit(pageSize);
        return selectByExample(example);
    }

}




