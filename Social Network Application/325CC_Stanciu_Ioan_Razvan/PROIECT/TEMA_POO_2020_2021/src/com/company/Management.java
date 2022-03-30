package com.company;

import java.util.ArrayList;

public class Management extends Department {

    Employee employee = new Employee();

    public Management(ArrayList<Employee> employees, ArrayList<Job> jobs) {
        super(employees, jobs);
    }

    @Override
    public double getTotalSalaryBudget() {
        double tax = 16;
        return employee.getSalary() * (1 - tax / 100);
    }

}
