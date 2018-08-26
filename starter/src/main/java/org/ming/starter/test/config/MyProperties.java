package org.ming.starter.test.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;

/**
 * 配置文件信息
 *
 * @author MingXiangjun
 * @create 2018-08-25 16:08
 */
@ConfigurationProperties(prefix = "service.starter")
public class MyProperties extends HashMap<String,String>{
}
