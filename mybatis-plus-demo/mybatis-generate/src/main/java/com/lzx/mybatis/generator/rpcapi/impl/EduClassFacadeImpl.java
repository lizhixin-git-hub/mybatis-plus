package com.lzx.mybatis.generator.rpcapi.impl;

import com.lzx.mybatis.generator.model.EduClass;
import com.lzx.mybatis.generator.model.EduClassExample;
import com.lzx.mybatis.generator.repository.EduClassRepository;
import com.lzx.mybatis.generator.rpcapi.EduClassFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * EduClassFacade实现
 * Created by src on 2020/5/30.
 */
@Service
public class EduClassFacadeImpl implements EduClassFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(EduClassFacadeImpl.class);

    private EduClassRepository repository;

    @Autowired
    public void setRepository(EduClassRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<EduClass> list(int pageNo, int pageSize) {
        LOGGER.debug("获取班级列表数据");
        return repository.selectByExamplePage(new EduClassExample(), pageNo, pageSize);
    }

}