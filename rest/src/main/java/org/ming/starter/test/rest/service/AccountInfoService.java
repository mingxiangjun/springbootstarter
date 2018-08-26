package org.ming.starter.test.rest.service;


import org.ming.starter.test.rest.entity.AccountInfo;

import java.util.List;
import java.util.Map;

/**
 * 用户账号信息服务类
 *
 * @author MingXiangjun
 * @create 2018-08-12 9:04
 **/
public interface AccountInfoService {
    void saveAccountInfo(AccountInfo accountInfo);
    void deleteAccountInfo(String id);
    void updateAccountInfo(AccountInfo accountInfo);
    List<AccountInfo> selectByCondition(Map<String, Object> condition);
    AccountInfo selectById(String id);
}
