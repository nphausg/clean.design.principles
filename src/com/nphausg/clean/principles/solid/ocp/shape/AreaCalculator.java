/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.solid.ocp.shape;

public class AreaCalculator {
    public AreaCalculator() {
    }

    public void calculate(Shape shape) {
        shape.calculateArea();
    }
}
