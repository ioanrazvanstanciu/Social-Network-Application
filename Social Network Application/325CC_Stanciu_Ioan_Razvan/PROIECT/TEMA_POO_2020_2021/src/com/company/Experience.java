package com.company;

import java.util.*;
import java.lang.Comparable;

public class Experience implements Comparable<Experience> {

    private String company;
    private String position;
    private Date start_date;
    private Date end_date;

    public Experience(String company, String position, Date start_date, Date end_date) {
        this.company = company;
        this.position = position;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }


    @Override
    public int compareTo(Experience o) {
        if (this.end_date.compareTo(o.end_date) > 0) {
            return -1;
        } else if (this.end_date.compareTo(o.end_date) < 0) {
            return 1;
        } else {
            if (this.company.compareTo(o.company) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}
