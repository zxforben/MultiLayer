package com.demo.service.impl;

import com.demo.dao.CustomerMapper;
import com.demo.entity.Customer;
import com.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerById(int customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public boolean addCustomer(Customer record) {
        boolean result = false;
        try {
            customerMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
