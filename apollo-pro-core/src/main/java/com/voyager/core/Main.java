package com.voyager.core;

import com.voyager.common.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====程序启动中======>>>>>  apollo-pro-core is starting......");

        System.out.println(StringUtils.isEmptyOrNull(""));
        System.out.println(StringUtils.isEmptyOrNull(null));
        System.out.println(StringUtils.isEmptyOrNull(String.valueOf("null")));
        System.gc();
        System.out.println("=====程序结束======>>>>>  apollo-pro-core is stopping......");
    }
}
