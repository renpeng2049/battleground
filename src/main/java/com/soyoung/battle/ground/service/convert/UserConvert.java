package com.soyoung.battle.ground.service.convert;

import com.soyoung.battle.ground.dao.db.UserPo;
import com.soyoung.battle.ground.model.UserInfo;

import javax.jws.soap.SOAPBinding;

public class UserConvert {

    public static UserInfo UserPo2Info(UserPo po){

        if(null == po){
            return null;
        }

        UserInfo userInfo = new UserInfo();
        userInfo.setId(po.getId());
        userInfo.setName(po.getName());
        userInfo.setSex(po.getSex());
        userInfo.setAge(po.getAge());

        return userInfo;
    }
}
