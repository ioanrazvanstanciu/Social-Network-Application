package com.company;

import java.util.*;
import java.lang.Comparable;

public class Education implements Comparable<Education> {

    private String level;
    private String name;
    private Date start_date;
    private Date end_date;
    private double grade;

    public Education(String level, String name, Date start_date, Date end_date, double grade) {
        this.level = level;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.grade = grade;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Education o) {
        if (this.end_date.compareTo(o.end_date) > 0) {
            return -1;
        } else if (this.end_date.compareTo(o.end_date) < 0) {
            return 1;
        } else {
            if (this.grade > o.grade) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}
