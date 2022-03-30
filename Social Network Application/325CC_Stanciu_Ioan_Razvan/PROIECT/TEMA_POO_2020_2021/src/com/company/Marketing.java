package com.company;

import java.util.ArrayList;

public class Marketing extends Department {

    Employee employee = new Employee();

    public Marketing(ArrayList<Employee> employees, ArrayList<Job> jobs) {
        super(employees, jobs);
    }

    @Override
    public double getTotalSalaryBudget() {
        double tax_1 = 10;
        double tax_2 = 0;
        double tax_3 = 16;
        if(employee.getSalary() > 5000) {
            return employee.getSalary() * (1 - tax_1 / 100);
        }
        if(employee.getSalary() < 3000) {
            return employee.getSalary() * (1 - tax_2 / 100);
        }
        return employee.getSalary() * (1 - tax_3 / 100);
    }

}
