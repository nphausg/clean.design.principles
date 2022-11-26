/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.solid.ocp.job;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }

    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void drawBlood() {
        System.out.println("drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("cleaning Patient Area");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }
}