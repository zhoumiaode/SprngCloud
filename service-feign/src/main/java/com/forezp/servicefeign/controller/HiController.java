package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.interfaces.SchedualServiceHi;
import javafx.scene.chart.ScatterChart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HiController
 * @Description TODO
 * @Author zmd
 * @Date 2019/9/18 14:40
 * Version 1.0
 **/
@RestController
public class HiController {

    @Resource
    public SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
