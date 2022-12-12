package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerService {

    /**
     * 获取客户列表
     *
     * @return 包含所有客户对象对应的列表
     */
    public List<Customer> getCustomerList() {
        // TODO
        return null;
    }

    /**
     * 获取客户
     *
     * @param id 对应的客户ID
     * @return 匹配该ID的客户对象
     */
    public Customer getCustomer(long id) {
        // TODO
        return null;
    }


    /**
     * 根据传入的Map创建客户对象
     *
     * @param fieldMap 传入的所有字段对应的键值对
     * @return 返回创建操作是否成功的结果
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 根据传入的Map更新对应id用户的对应字段值
     *
     * @param id 更改的用户id
     * @param fieldMap 需要修改的字段对应的键值对
     * @return 返回是否操作成功的结果
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        // TODO
        return false;
    }

    /**
     * 删除对应ID的客户
     *
     * @param id 指定的ID
     * @return 返回是否删除成功的结果
     */
    public boolean deleteCustomer(long id) {
        // TODO: 2022/12/12
        return false;
    }
}
