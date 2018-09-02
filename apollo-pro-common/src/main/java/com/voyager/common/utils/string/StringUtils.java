package com.voyager.common.utils.string;

/**
 * String工具类
 */
public class StringUtils {

    /**
     * 判断字符串是否为null 、""、"null"
     * @param str
     * @return
     */
    public static boolean isEmptyOrNull(String str) {
        if(str == null || str.equals("") || str.equals("null")) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否不为null、""、"null"
     * @param str
     * @return
     */
    public static boolean isNotEmptyAndNull (String str) {
        return isEmptyOrNull(str) ? false : true;
    }
}
