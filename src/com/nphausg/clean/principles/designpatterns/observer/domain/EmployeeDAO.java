/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.designpatterns.observer.domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", null, 5000, false);
    Employee emp2 = new Employee("Steve", null, 4500, false);
    Employee emp3 = new Employee("John", null, 7000, false);
    Employee emp4 = new Employee("Pat", null, 6000, false);
    Employee emp5 = new Employee("Joe", null, 8000, false);

    List<Employee> employees;

    public List<Employee> generateEmployees(){

        employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;

    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }
}
