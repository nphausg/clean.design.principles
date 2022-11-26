/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.solid.ocp.shape;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle:" + (getHeight() * getWidth()));
    }
}
