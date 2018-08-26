package org.ming.starter.test.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 参数校验切面类
 * @author MingXiangjun
 * @create 2018-08-25 22:34
 */
@Log4j2
@Aspect
public class ParmCheckAspect {
    @Before("execution(* org.ming.starter..*ServiceImpl.*(..))")
    public void paramCheck(){
        log.info("**********************check Parameter************************");
    }
}
