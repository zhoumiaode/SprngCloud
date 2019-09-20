package com.forezp.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @ClassName SecondFilter
 * @Description TODO
 * @Author zmd
 * @Date 2019/9/19 14:33
 * Version 1.0
 **/

@Component
public class SecondFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.print("The first ZuulFilter is pass,and this is the second");
        return null;
    }
}
