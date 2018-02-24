package com.soyoung.battle.ground.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "mybatis")
public class MybatisController {

    Logger logger = LogManager.getLogger(MybatisController.class);

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public String greeting(){

        logger.info(">>>>>>>>>>>>>>entry:");
        Map<String,Object> map = Maps.newHashMap();

        map.put("code",200);
        map.put("msg","ok");

        return JSON.toJSONString(map);
    }
}
