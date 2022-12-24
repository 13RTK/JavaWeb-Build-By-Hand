package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;

import java.util.Map;

/**
 * @author alex
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 获取 long 类型的参数
     *
     * @param name 对应的参数名称
     * @return 返回参数名称对应的 long 类型的值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * @return 返回所有的参数映射
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
