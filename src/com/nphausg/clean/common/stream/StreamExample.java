/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.common.stream;

import java.util.ArrayList;
import java.util.Optional;

class Customer {
    int age;

    public int getAge() {
        return age;
    }
}

public class StreamExample {

    private ArrayList<Customer> customers = new ArrayList<>();

    boolean isAllCustomersAgeGreaterThan18() {
        return customers.stream().allMatch(customer -> customer.getAge() > 18);
    }
    void findAnyCustomersGreaterThan30(){
        Optional<Customer> result = customers.stream().parallel().filter(customer -> customer.getAge() >= 30).findAny();
        System.out.println(result.get().toString());
    }
}
