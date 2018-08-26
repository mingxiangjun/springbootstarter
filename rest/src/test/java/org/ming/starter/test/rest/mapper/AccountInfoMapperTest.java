package org.ming.starter.test.rest.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ming.starter.test.rest.RestApplication;
import org.ming.starter.test.rest.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
public class AccountInfoMapperTest {
    @Autowired
    AccountInfoMapper accountInfoMapper;

    @Test
    public void save() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void selectByCondition() throws Exception {
    }

    @Test
    public void selectById() throws Exception {
        AccountInfo accountInfo = accountInfoMapper.selectById("000004c08ddf42a180a72af93572a636");
        log.info("selectId result is{}",accountInfo.toString());
    }

}