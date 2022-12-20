package org.smart4j.framework.util;

import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具
 */
public final class CollectionUtil {
    /**
     * 判断集合是否为空
     *
     * @param collection 判断的集合对象
     * @return 判断的结果
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtil.isEmpty(collection);
    }

    /**
     * 判断集合是否不为空
     *
     * @param collection 判断的集合对象
     * @return 判断的结果
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断映射是否为空
     *
     * @param map 判断的映射对象
     * @return 判断的结果
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断集合是否不为空
     *
     * @param map 判断的集合对象
     * @return 判断的结果
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }
}
