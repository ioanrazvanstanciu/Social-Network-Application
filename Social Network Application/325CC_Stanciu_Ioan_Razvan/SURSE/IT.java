package com.company;

import java.util.ArrayList;

public class IT extends Department {

    Employee employee = new Employee();

    public IT(ArrayList<Employee> employees, ArrayList<Job> jobs) {
        super(employees, jobs);
    }

    @Override
    public double getTotalSalaryBudget() {
        double tax = 0;
        return employee.getSalary() * (1 - tax / 100);
    }

}
