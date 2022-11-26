/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.solid.ocp;

import com.nphausg.clean.principles.solid.ocp.job.Doctor;
import com.nphausg.clean.principles.solid.ocp.job.Employee;
import com.nphausg.clean.principles.solid.ocp.job.HospitalManagement;
import com.nphausg.clean.principles.solid.ocp.job.Nurse;
import com.nphausg.clean.principles.solid.ocp.shape.AreaCalculator;
import com.nphausg.clean.principles.solid.ocp.shape.Circle;
import com.nphausg.clean.principles.solid.ocp.shape.Rectangle;
import com.nphausg.clean.principles.solid.ocp.shape.Triangle;

public class OCPExample {
    public static void main(String[] args) {
        // Open-Closed Principle Demo With Shape
        AreaCalculator calculator = new AreaCalculator();
        calculator.calculate(new Rectangle(20, 10));
        calculator.calculate(new Circle(20));
        calculator.calculate(new Triangle(20, 10));


        // Emergency Room Process
        HospitalManagement erDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);
        erDirector.callUpon(peggy);
        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        erDirector.callUpon(suzan);
    }
}
