package com.company;

import java.util.*;

public abstract class Department {

    protected ArrayList<Employee> employees = new ArrayList<>();
    protected ArrayList<Job> jobs = new ArrayList<>();

    public Department(ArrayList<Employee> employees, ArrayList<Job> jobs) {
        this.employees = employees;
        this.jobs = jobs;
    }

    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void remove(Employee employee) {
        this.employees.remove(employee);
    }

    public void add(Job job) {
        this.jobs.add(job);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

}
