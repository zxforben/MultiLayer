package com.demo.controller;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @Resource
    CustomerService customerService;

    @RequestMapping("getCustomer")
    @ResponseBody
    public Customer getCustomer(HttpServletRequest request) {
        int customerId = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.getCustomerById(customerId);
        return customer;
    }
}