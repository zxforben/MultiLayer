package com.demo.service;

import com.demo.entity.Customer;

public interface CustomerService {
    public Customer getCustomerById(int customerId);

    boolean addCustomer(Customer record);
}
