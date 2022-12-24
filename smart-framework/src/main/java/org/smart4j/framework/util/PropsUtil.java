package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    public static Properties loadProps(String fileName) {
        Properties properties = null;
        InputStream is = null;

        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if (is == null) {
                throw new FileNotFoundException(fileName + " file is not found");
            }

            properties = new Properties();
            properties.load(is);
        } catch (IOException | NullPointerException e) {
            LOGGER.error("load properties file failure", e);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                LOGGER.error("close input stream failure", e);
            }
        }

        return properties;
    }

    public static String getString(Properties properties, String property) {
        return getString(properties, property, "");
    }

    public static String getString(Properties properties, String property, String defaultValue) {
        String value = defaultValue;
        if (properties.containsKey(property)) {
            value = properties.getProperty(property);
        }

        return value;
    }

    public static int getInt(Properties properties, String property) {
        return getInt(properties, property, 0);
    }

    public static int getInt(Properties properties, String property, int defaultValue) {
        int value = defaultValue;

        if (properties.containsKey(property)) {
            value = CastUtil.castInt(properties.getProperty(property));
        }

        return value;
    }

    public static boolean getBoolean(Properties properties, String property) {
        return getBoolean(properties, property, false);
    }

    public static boolean getBoolean(Properties properties, String property, boolean defaultValue) {
        boolean value = defaultValue;
        if (properties.containsKey(property)) {
            value = CastUtil.castBoolean(properties.getProperty(property));
        }

        return value;
    }
}
