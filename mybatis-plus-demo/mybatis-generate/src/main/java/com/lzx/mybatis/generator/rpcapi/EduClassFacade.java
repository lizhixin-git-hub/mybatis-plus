package com.lzx.mybatis.generator.rpcapi;


import com.lzx.mybatis.generator.model.EduClass;

import java.util.List;

/**
 * EduClassFacade接口
 * Created by src on 2020/5/30.
 */
public interface EduClassFacade {

    List<EduClass> list(int pageNo, int pageSize);

}