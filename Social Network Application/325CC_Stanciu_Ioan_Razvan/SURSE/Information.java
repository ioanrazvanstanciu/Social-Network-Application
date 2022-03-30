package com.company;

import java.util.*;

public class Information {

    private String name;
    private String email;
    private String phone;
    private Date date_of_birth;
    private String genre;
    private ArrayList<String> languages = new ArrayList<>();
    private ArrayList<String> languages_level = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getLanguages_level() {
        return languages_level;
    }

    public void setLanguages_level(ArrayList<String> languages_level) {
        this.languages_level = languages_level;
    }

}
