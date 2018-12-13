package com.kp.cloud.cs.service;

import com.kp.cloud.cs.model.Customer;

import java.util.List;

/**
 * @author PZK8WZ
 * @since 13/gru/2018
 */
public interface CustomerService {
    List<Customer> findAllCustomers();
}
