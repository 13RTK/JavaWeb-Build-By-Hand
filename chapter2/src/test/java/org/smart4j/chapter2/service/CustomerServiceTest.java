package org.smart4j.chapter2.service;

import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * CustomerService单元测试
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    @Before
    public void init() {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Test
    public void createCustomer() {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer3");
        fieldMap.put("contact", "Alex");
        fieldMap.put("telephone", "12312412");
        fieldMap.put("email", "alex@gmail.com");

        boolean createResult = customerService.createCustomer(fieldMap);
        assertTrue(createResult);
        assertEquals("Alex", customerService.getCustomer(3).getContact());
    }

    @Test
    public void getCustomerList() {
        List<Customer> customerList = customerService.getCustomerList();

        assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomer() {
        assertEquals("Jack", customerService.getCustomer(1).getContact());
    }


    @Test
    public void updateCustomer() {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "Tami");

        boolean result = customerService.updateCustomer(1, fieldMap);
        assertTrue(result);
        assertEquals("Tami", customerService.getCustomer(1).getName());
    }

    @Test
    public void deleteCustomer() {
        boolean b = customerService.deleteCustomer(1);

        assertTrue(b);
        assertNull(customerService.getCustomer(1));
    }
}