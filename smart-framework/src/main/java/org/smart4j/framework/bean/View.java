package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alex
 */
public class View {
    /**
     * 视图路径
     */
    private String path;

    /**
     * 视图模型中的数据映射
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
