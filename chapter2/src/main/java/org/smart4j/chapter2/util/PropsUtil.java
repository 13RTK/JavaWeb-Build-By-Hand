package org.smart4j.chapter2.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件加载工具
 */
public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载配置文件，并返回加载该配置文件的Properties实例
     *
     * @param fileName 配置文件的路径
     * @return 返回加载了配置文件的Properties实例
     */
    public static Properties loadProps(String fileName) {
        Properties props = null;
        InputStream is = null;

        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if (is == null) {
                throw new FileNotFoundException(fileName + " file is not found");
            }

            props = new Properties();
            props.load(is);
        } catch (IOException e) {
            LOGGER.error("load properties file failure", e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure", e);
                }
            }
        }

        return props;
    }

}
