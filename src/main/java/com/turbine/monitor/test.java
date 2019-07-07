package com.turbine.monitor;

import org.springframework.util.StringUtils;

public class test {
    public static void main(String[] args)
    {
       String[] data = StringUtils.commaDelimitedListToStringArray("consumer,feign-consumer");
       System.out.println(data[0]);
       System.out.println(data[1]);
    }
}
