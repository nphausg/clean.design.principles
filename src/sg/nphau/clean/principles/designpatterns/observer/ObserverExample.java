/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package sg.nphau.clean.principles.designpatterns.observer;

import sg.nphau.clean.principles.designpatterns.observer.observers.HRDepartment;
import sg.nphau.clean.principles.designpatterns.observer.observers.IObserver;
import sg.nphau.clean.principles.designpatterns.observer.observers.PayrollDepartment;
import sg.nphau.clean.principles.designpatterns.observer.subjects.EmployeeManagementSystem;

public class ObserverExample {
    public static void main(String[] args) {

        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

//		 Employee bob = new Employee("Bob", new Date(), 35000, true);
//		 ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(5, "Imtiaz");
        // ems.modifyEmployeeName(2, "Imtiaz");
    }
}
