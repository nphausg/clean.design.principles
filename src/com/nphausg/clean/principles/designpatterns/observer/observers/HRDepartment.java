/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.designpatterns.observer.observers;

import com.nphausg.clean.principles.designpatterns.observer.domain.Employee;

public class HRDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("HR department notified...");
        System.out.println(msg + ": " + emp.getName());
    }

}
