package org.smart4j.chapter2.util;

/**
 * 类型转换工具
 */
public final class CastUtil {

    /**
     * 转为String类型
     *
     * @param obj 传入的Object对象实例
     * @return 转换后的String类型
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String类型
     *
     * @param obj 传入的Object对象实例
     * @param defaultValue 对象不存在时作为代替的默认值
     * @return 转换后的String类型
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double类型
     *
     * @param obj 传入的Object对象实例
     * @return 转换后的double类型
     */
    public static double castDouble(Object obj) {
        return CastUtil.castDouble(obj, 0);
    }

    /**
     * 转为double类型
     *
     * @param obj 传入的Object对象实例
     * @param defaultValue 对象不存在时作为代替的默认值
     * @return 转换后的double类型
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;

        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return doubleValue;
    }

    /**
     * 转为long类型
     *
     * @param obj 传入的Object对象实例
     * @return 转换后的long类型
     */
    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0L);
    }

    /**
     * 转为long类型
     *
     * @param obj 传入的Object对象实例
     * @param defaultValue 对象不存在时作为代替的默认值
     * @return 转换后的long类型
     */
    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;

        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return longValue;
    }

    /**
     * 转为int类型
     *
     * @param obj 传入的Object对象实例
     * @return 转换后的int类型
     */
    public static int castInt(Object obj) {
        return CastUtil.castInt(obj);
    }

    /**
     * 转为int类型
     *
     * @param obj 传入的Object对象实例
     * @param defaultValue 对象不存在时作为代替的默认值
     * @return 转换后的int类型
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;

        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return intValue;
    }

    /**
     * 转为boolean类型
     *
     * @param obj 传入的Object对象实例
     * @return 转换后的boolean类型
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转为boolean类型
     *
     * @param obj 传入的Object对象实例
     * @param defaultValue 对象不存在时作为代替的默认值
     * @return 转换后的boolean类型
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;

        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
