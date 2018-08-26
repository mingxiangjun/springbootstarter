package org.ming.starter.test.autoconfig;

import lombok.extern.log4j.Log4j2;
import org.ming.starter.test.aspect.ParmCheckAspect;
import org.ming.starter.test.config.MyProperties;
import org.ming.starter.test.service.MyService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author MingXiangjun
 * @create 2018-08-25 16:05
 */
@Log4j2
@Configuration
@ConditionalOnClass(MyService.class)
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoconfigure {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "service.starter",value = "enable",havingValue = "true")
    MyService myService(MyProperties myProperties){
        log.info("=============>>>>init my starter<<<<<<=================");
        return new MyService(myProperties.get("prefix"),myProperties.get("suffix"));
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "service.starter",value = "enable",havingValue = "true")
    public ParmCheckAspect parmCheckAspect(){
        log.info("=============>>>>init ParameterCheckAspect<<<<<<=================");
        return new ParmCheckAspect();
    }
}
