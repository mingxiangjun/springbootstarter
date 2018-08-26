package org.ming.starter.test.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户账号实体类
 * @author MingXiangjun
 * @create 2018-08-12 9:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    /**
     * 主键Id
     */
    String id;
    /**
     * 用户名
     */
    String userName;
    /**
     * 电子邮箱
     */
    String email;
    /**
     * 密码
     */
    String password;
    /**
     * 安全问题答案
     */
    String securityAns;
    /**
     * 安全问题
     */
    String securityQues;
    /**
     * 创建时间
     */
    Date createTime;
    /**
     * 加盐值
     */
    String salt;
}
