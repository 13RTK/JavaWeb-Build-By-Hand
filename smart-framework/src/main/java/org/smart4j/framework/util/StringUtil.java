package org.smart4j.framework.util;

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
            str.trim();
        }

        return StringUtil.isEmpty(str);
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
}
