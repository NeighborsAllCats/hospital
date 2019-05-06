package com.phs.hospital.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.phs.hospital.core.common.entity.APIResult;
import com.phs.hospital.core.dal.domain.PhsUser;
import com.phs.hospital.core.dal.manager.PhsUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phs_user")
public class PhsUserController {
    @Autowired
    PhsUserManager phsUserManager;

    /**
     * 1、查询所有 URl：http://localhost:8077/phs_user/findAll
     *
     * @return
     */
//    @RequestMapping("/findAll")
//    @GetMapping
//    public APIResult<String> findAll() {
//        JSONObject json = new JSONObject();
//        String infos=phsUserManager.findAll().toString();
//        json.put("status",infos);
//        return APIResult.ok(json.toJSONString());
//    }

    /*
    2.增加一条记录URl：http://localhost:8077/phs_user/insertUser?user_id=11&user_password=11
    @param user
    @return
    */
//    @RequestMapping("/insertUser")
//    public void insertUser(PhsUser user) {
//        phsUserManager.insertUser(user);
//    }

    /*
    3.更新一条记录URl：http://localhost:8077/phs_user/updateUser?
    @param user
    @return
    */
//    @RequestMapping("/updateUser")
//    public void updateUser(PhsUser user) {
//        phsUserManager.updateUser(user);
//    }

    /*
    4.删除一条数据userPermission为0 URl：http://localhost:8077/phs_user/deleteUser?
    @param user
    @return
    */
//    @RequestMapping("/deleteUser")
//    public void deleteUser(PhsUser user) {
//        phsUserManager.deleteUser(user);
//    }

    /*
    4.登录认证(不包括userPermission为0）URl：http://localhost:8077/phs_user/checkLogin?
    @return  true/false
    */
//    @RequestMapping("/checkLogin")
//    public boolean checkLogin(PhsUser user) {return phsUserManager.checkLogin(user); }
}
