package com.company;

import java.util.*;

public class Company {

    private String name;
    private Manager manager;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Recruiter> recruiters = new ArrayList<>();

    public Company(String name, Manager manager, ArrayList<Department> departments, ArrayList<Recruiter> recruiters) {
        this.name = name;
        this.manager = manager;
        this.departments = departments;
        this.recruiters = recruiters;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public ArrayList<Recruiter> getRecruiters() {
        return recruiters;
    }

    public void add(Department department) {
        this.departments.add(department);
    }

    public void add(Recruiter recruiter) {
        this.recruiters.add(recruiter);
    }

    /*public void add(Employee employee, Department department) {

    }*/

    /*public void remove(Employee employee) {

    }*/

    public void remove(Department department) {
        this.departments.remove(department);
    }

    public void remove(Recruiter recruiter) {
        this.recruiters.remove(recruiter);
    }

    /*public void move(Department source, Department destination) {

    }*/

    /*public void move(Employee employee, Department newDepartment) {

    }*/

    public boolean contains(Department department) {
        return this.departments.contains(department);
    }

    /*public boolean contains(Employee employee) {

    }*/

    public boolean contains(Recruiter recruiter) {
        return this.recruiters.contains(recruiter);
    }

    /*public Recruiter getRecruiter(User user) {

    }*/

    /*public ArrayList<Job> getJobs() {

    }*/

}
