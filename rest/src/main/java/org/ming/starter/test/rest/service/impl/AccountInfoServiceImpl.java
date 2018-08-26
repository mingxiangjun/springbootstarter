package org.ming.starter.test.rest.service.impl;

import org.ming.starter.test.rest.service.AccountInfoService;
import org.ming.starter.test.rest.entity.AccountInfo;
import org.ming.starter.test.rest.mapper.AccountInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author MingXiangjun
 * @create 2018-08-12 9:41
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountInfoServiceImpl implements AccountInfoService {
    @Autowired
    AccountInfoMapper accountInfoMapper;

    public void saveAccountInfo(AccountInfo accountInfo) {
        accountInfoMapper.save(accountInfo);
    }

    public void deleteAccountInfo(String id) {
        accountInfoMapper.deleteById(id);
    }

    public void updateAccountInfo(AccountInfo accountInfo) {
        accountInfoMapper.update(accountInfo);
    }

    public List<AccountInfo> selectByCondition(Map<String, Object> condition) {
        return accountInfoMapper.selectByCondition(condition);
    }

    public AccountInfo selectById(String id) {
        return accountInfoMapper.selectById(id);
    }
}
