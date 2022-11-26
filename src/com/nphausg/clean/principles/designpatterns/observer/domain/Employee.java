/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.designpatterns.observer.domain;

import java.util.Date;

public class Employee {

    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean working = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;
        employeeID = ++COUNTER;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.employeeID;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", hireDate=" + hireDate
                + ", salary=" + salary + ", employeeID=" + employeeID + ", isfired=" + working + "]";
    }
}
