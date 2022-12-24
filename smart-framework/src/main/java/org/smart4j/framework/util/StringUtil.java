package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具
 */
public final class StringUtil {

    /**
     * 判断输入的字符串在处理前后空格后是否为空
     *
     * @param str 输入的字符串
     * @return 判断的结果
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }

        return StringUtils.isEmpty(str);
    }

    /**
     * 判断输入的字符串在处理前后空格后是否不为空
     *
     * @param str 输入的字符串
     * @return 判断的结果
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * @param str 戴处理的字符串
     * @param separator 分割参数的分割符
     * @return 返回分割后的字符串数组
     */
    public static String[] splitString(String str, String separator) {
        return StringUtils.splitByWholeSeparator(str, separator);
    }
}
