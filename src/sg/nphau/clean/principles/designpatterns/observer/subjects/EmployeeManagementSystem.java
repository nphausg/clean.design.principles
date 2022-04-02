/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package sg.nphau.clean.principles.designpatterns.observer.subjects;

import sg.nphau.clean.principles.designpatterns.observer.domain.Employee;
import sg.nphau.clean.principles.designpatterns.observer.domain.EmployeeDAO;
import sg.nphau.clean.principles.designpatterns.observer.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the subject that should be able to notify the list of observers that
 * care for employee changes.
 */
public class EmployeeManagementSystem implements ISubject {

    private Employee emp;
    private String msg = null;
    private List<IObserver> observers;
    private List<Employee> employees;
    private EmployeeDAO employeeDAO;

    public EmployeeManagementSystem() {
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;
        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                this.emp = emp;
                this.msg = "Employee Name Changed";
                notify = true;
            }
        }
        if (notify)
            notifyObservers();
    }

    public void hireNewEmployee(Employee emp) {
        this.emp = emp;
        this.msg = "New Hire";
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserver addMe) {
        // the observers added to this list are interested in getting notified.
        observers.add(addMe);
    }

    @Override
    public void removeObserver(IObserver removeMe) {
        int removeIndex = observers.indexOf(removeMe);
        observers.remove(removeIndex);
    }


    public void notifyObservers() {
        for (IObserver department : observers) {
            department.callMe(emp, msg);
        }
    }
}
