package com.company;

import java.util.*;

public class DepartmentFactory {

    public static Department factory(String type, ArrayList<Employee> employees, ArrayList<Job> jobs) {
        switch(type) {
            case "IT":
                return new IT(employees, jobs);
            case "Management":
                return new Management(employees, jobs);
            case "Marketing":
                return new Marketing(employees, jobs);
            case "Finance":
                return new Finance(employees, jobs);
        }
        return null;
    }

}
