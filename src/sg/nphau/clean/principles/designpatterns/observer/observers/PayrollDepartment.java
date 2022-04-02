/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package sg.nphau.clean.principles.designpatterns.observer.observers;

import sg.nphau.clean.principles.designpatterns.observer.domain.Employee;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("PAYROLL department notified...");
        System.out.println(msg + ": " + emp.getName());
    }

}
