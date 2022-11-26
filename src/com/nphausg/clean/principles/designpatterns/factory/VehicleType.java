/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.designpatterns.factory;

public enum VehicleType {

    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    },
    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    },
    ELECTRIC {
        public Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();
}

