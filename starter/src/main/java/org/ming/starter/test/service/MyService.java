package org.ming.starter.test.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 指定执行业务逻辑的代码
 *
 * @author MingXiangjun
 * @create 2018-08-25 16:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyService {
    String prefix;
    String suffix;

    public String wrap(String hello){
        return prefix + hello + suffix;
    }
}
