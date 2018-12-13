package com.kp.cloud.cs.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author PZK8WZ
 * @since 20/paź/2018
 */
@Data
@Builder
public class Customer {
    private String customerNo;
    private String name;
}
