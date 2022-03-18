/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.solid.ocp;

public class OCPExample {
    public static void main(String[] args) {
        // Open-Closed Principle Demo
        AreaCalculator calculator = new AreaCalculator();
        calculator.calculate(new Rectangle(20, 10));
        calculator.calculate(new Circle(20));
        calculator.calculate(new Triangle(20, 10));
    }
}
