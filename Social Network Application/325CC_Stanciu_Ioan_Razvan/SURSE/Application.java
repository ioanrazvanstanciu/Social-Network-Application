package com.company;

import java.util.*;

public class Application {

    private static Application application = null;
    private ArrayList<Company> companies;
    private ArrayList<User> users;

    private Application() {
        companies = new ArrayList<>();
        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    /*public Company getCompany(String name) {

    }*/

    public void add(Company company) {
        this.companies.add(company);
    }

    public void add(User user) {
        this.users.add(user);
    }

    public boolean remove(Company company) {
        return this.companies.remove(company);
    }

    public boolean remove(User user) {
        return this.users.remove(user);
    }

    /*public ArrayList<Job> getJobs(List<String> companies) {

    }*/

    public static Application getInstance() {
        if(application == null) {
            application = new Application();
        }
        return application;
    }

}
