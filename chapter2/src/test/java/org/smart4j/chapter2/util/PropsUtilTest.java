package org.smart4j.chapter2.util;

import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class PropsUtilTest {

    @Test
    public void loadProps() {
        Properties properties = PropsUtil.loadProps("config.properties");

        assertEquals("com.mysql.cj.jdbc.Driver", properties.getProperty("jdbc.driver"));
        assertEquals("jdbc:mysql://localhost:3306/java-web", properties.getProperty("jdbc.url"));
        assertEquals("root", properties.getProperty("jdbc.username"));
        assertEquals("123456", properties.getProperty("jdbc.password"));
    }
}