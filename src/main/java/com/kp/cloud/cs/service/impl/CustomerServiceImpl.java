package com.kp.cloud.cs.service.impl;

import com.kp.cloud.cs.model.Customer;
import com.kp.cloud.cs.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PZK8WZ
 * @since 13/gru/2018
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Value("${customer-service.message:Failed to load property}")
    private String message;
    
    @Override
    public List<Customer> findAllCustomers() {
        return new ArrayList<>(
                Arrays.asList(
                        Customer.builder().customerNo("10").name("Great customer 1").message(message).build(),
                        Customer.builder().customerNo("11").name("Green Hills").message(message).build(),
                        Customer.builder().customerNo("12").name("Open Source Community").message(message).build(),
                        Customer.builder().customerNo("13").name("ZaiX").message(message).build()
                )
        );
    }
}
