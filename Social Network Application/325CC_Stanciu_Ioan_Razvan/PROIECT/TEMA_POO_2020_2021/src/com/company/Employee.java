package com.company;

import java.util.*;

public class Employee extends Consumer {

    private String company_name;
    private double salary;

    public Employee() {

    }

    public Employee(String company_name, double salary) {
        this.company_name = company_name;
        this.salary = salary;
    }

    public String getCompany_name() {
        return company_name;
    }

    public double getSalary() {
        return salary;
    }

}
