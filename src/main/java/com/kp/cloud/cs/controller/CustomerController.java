package com.kp.cloud.cs.controller;

import com.kp.cloud.cs.model.Customer;
import com.kp.cloud.cs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author PZK8WZ
 * @since 13/gru/2018
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> customers() {
        return customerService.findAllCustomers();
    }
}
