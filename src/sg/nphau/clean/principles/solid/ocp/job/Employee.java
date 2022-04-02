/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package sg.nphau.clean.principles.solid.ocp.job;

public abstract class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    abstract void performDuties();

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department="
                + department + ", working=" + working + "]";
    }
}
