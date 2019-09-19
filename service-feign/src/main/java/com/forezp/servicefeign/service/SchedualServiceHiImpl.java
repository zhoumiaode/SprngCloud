package com.forezp.servicefeign.service;

import com.forezp.servicefeign.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiImpl
 * @Description TODO
 * @Author zmd
 * @Date 2019/9/19 9:58
 * Version 1.0
 **/

@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
