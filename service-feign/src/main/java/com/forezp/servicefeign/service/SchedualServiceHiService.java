package com.forezp.servicefeign.service;

import com.forezp.servicefeign.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiService
 * @Description TODO
 * @Author zmd
 * @Date 2019/9/18 15:57
 * Version 1.0
 **/

@Component
public class SchedualServiceHiService  implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+" ,The Service don't get response";
    }
}
