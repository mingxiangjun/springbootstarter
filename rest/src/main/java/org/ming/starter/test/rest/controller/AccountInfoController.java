package org.ming.starter.test.rest.controller;

import net.sf.json.JSONObject;
import org.ming.starter.test.rest.common.util.ResultJsonUtil;
import org.ming.starter.test.rest.entity.AccountInfo;
import org.ming.starter.test.rest.service.AccountInfoService;
import org.ming.starter.test.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户账号信息Controller
 * @author MingXiangjun
 * @create 2018-08-25 15:22
 */
@RestController
@RequestMapping(value = "/account")
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;
    @Autowired
    private MyService myService;

    @RequestMapping(value = "/save")
    public String saveAccountInfo(AccountInfo accountInfo){
        accountInfoService.saveAccountInfo(accountInfo);
        return ResultJsonUtil.success("操作成功").toJson();
    }
    @RequestMapping(value = "/selectById")
    public String test(@RequestParam(value = "id") String id){
        AccountInfo accountInfo = accountInfoService.selectById(id);
        return myService.wrap(JSONObject.fromObject(accountInfo).toString());
    }
}
