package com.yfgz.es.controller;

import com.yfgz.es.bean.LogToEs;
import com.yfgz.es.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.yfgz.es.utils.Result;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;


@RestController
@RequestMapping(value = "/es")
public class EsController {

    @Autowired
    private ElasticsearchService elasticsearchService;

    @RequestMapping(value = "/addDocumentLog", method = RequestMethod.POST)
    public Result addDocumentLog(@RequestBody LogToEs obj) {
        return elasticsearchService.addDocumentLog(obj);
    }

}
