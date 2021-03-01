package com.lzx.mybatis.generator.controller;

import com.lzx.mybatis.generator.model.EduClass;
import com.lzx.mybatis.generator.rpcapi.EduClassFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private EduClassFacade eduClassFacade;

    @Autowired
    public void setEduClassFacade(EduClassFacade eduClassFacade) {
        this.eduClassFacade = eduClassFacade;
    }

    @RequestMapping("/list/{pageNo}/{pageSize}")
    public List<EduClass> list(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize) {
        return eduClassFacade.list(pageNo, pageSize);
    }

}
