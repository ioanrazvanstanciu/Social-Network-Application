package com.company;

import java.util.*;

public class User extends Consumer {

    private ArrayList<String> interested_companies = new ArrayList<>();

    public User() {

    }

    public User(ArrayList<String> interested_companies) {
        this.interested_companies = interested_companies;
    }

    public ArrayList<String> getInterested_companies() {
        return interested_companies;
    }

    /*public Employee convert() {

    }*/

    /*public Double getTotalScore() {

    }*/

}
