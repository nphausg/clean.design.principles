/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package sg.nphau.clean.principles.designpatterns.factory;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("started simple engine of car...");
    }
}
