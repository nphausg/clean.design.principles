/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.designpatterns.factory;

public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle();
    }
}
