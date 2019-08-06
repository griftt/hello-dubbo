package com;

import com.griftt.HelloApiService;
import org.springframework.stereotype.Service;


public class HelloApiServiceImpl implements HelloApiService {
    public String hello(String hi) {

        return "你好啊！！！ "+hi;
    }
}
