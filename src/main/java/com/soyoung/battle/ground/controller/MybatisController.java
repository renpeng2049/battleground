package com.soyoung.battle.ground.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.soyoung.battle.ground.model.UserInfo;
import com.soyoung.battle.ground.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "mybatis")
public class MybatisController {

    Logger logger = LogManager.getLogger(MybatisController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public String greeting(){

        Integer id = 1;
        UserInfo userInfo = userService.getUserById(id);
        logger.info("查询用户信息 userInfo:{}",JSON.toJSONString(userInfo));

        Map<String,Object> map = Maps.newHashMap();

        map.put("code",200);
        map.put("msg","ok");
        map.put("data",userInfo);


        return JSON.toJSONString(map);
    }
}
