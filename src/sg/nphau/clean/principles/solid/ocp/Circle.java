/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.solid.ocp;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle:" + (getRadius() * getRadius() * 3.14));
    }
}
