/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.solid.ocp.job;

public class HospitalManagement {

    public void callUpon(Employee employee) {
        employee.performDuties();
    }

    // Nurses
    private void drawBlood() {
        System.out.println("Drawing blood");
    }

    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void cleanPatientArea() {
        System.out.println("cleaning patient area");
    }
    // Doctors
    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }
    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }
}
