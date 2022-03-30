package com.company;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat s_d_f = new SimpleDateFormat("dd.MM.yyyy");

        Information user_1 = new Information();

        String name_1 = "Daniel Edmund";
        String email_1 = "dedmund@gmail.com";
        String phone_1 = "+4444444444";
        Date date_of_birth_1 = s_d_f.parse("20.10.1982");
        String genre_1 = "male";
        ArrayList<String> languages_1 = new ArrayList<>(
                Arrays.asList(
                              "English",
                              "French"
                             )
        );
        ArrayList<String> languages_level_1 = new ArrayList<>(
                Arrays.asList(
                              "Experienced",
                              "Beginner"
                             )
        );

        user_1.setName(name_1);
        user_1.setEmail(email_1);
        user_1.setPhone(phone_1);
        user_1.setDate_of_birth(date_of_birth_1);
        user_1.setGenre(genre_1);
        user_1.setLanguages(languages_1);
        user_1.setLanguages_level(languages_level_1);

        System.out.println(user_1.getName());
        System.out.println(user_1.getEmail());
        System.out.println(user_1.getPhone());
        System.out.println(s_d_f.format(user_1.getDate_of_birth()));
        System.out.println(user_1.getGenre());
        System.out.println(user_1.getLanguages());
        System.out.println(user_1.getLanguages_level());

        System.out.print("\n");

        Date date_1 = s_d_f.parse("01.09.2003");
        Date date_2 = s_d_f.parse("01.06.2011");
        Date date_3 = s_d_f.parse("01.08.2007");
        Date date_4 = s_d_f.parse("01.08.2012");

        Education user_2 = new Education("highschool", "Gilbert Classical Academy",
                                         date_1, date_2, 6.75);
        Education user_3 = new Education("college", "MIT",
                                         date_3, date_4, 8.8);

        if(user_2.compareTo(user_3) > 0) {
            System.out.println("Obiectele de tipul 'Education' in ordinea dorita sunt :" + "\n" +
                               "->" + user_3.getLevel() + "\n" + "->" + user_2.getLevel());
        } else {
            System.out.println("Obiectele de tipul 'Education' in ordinea dorita sunt :" + "\n" +
                               "->" + user_2.getLevel() + "\n" + "->" + user_3.getLevel());
        }

        System.out.print("\n");

        try {
            verificare_cronologie_1();
        } catch (InvalidDatesException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\n");

        Date date_7 = s_d_f.parse("01.05.2015");
        Date date_8 = s_d_f.parse("01.06.2016");
        Date date_9 = s_d_f.parse("01.05.2015");
        Date date_10 = s_d_f.parse("01.03.2017");

        Experience user_5 = new Experience("MIT", "Researcher", date_7, date_8);
        Experience user_6 = new Experience("NXP", "SDE", date_9, date_10);

        if(user_5.compareTo(user_6) > 0) {
            System.out.println("Obiectele de tipul 'Experience' in ordinea dorita sunt :" + "\n" +
                    "->" + user_6.getPosition() + "\n" + "->" + user_5.getPosition());
        } else {
            System.out.println("Obiectele de tipul 'Experience' in ordinea dorita sunt :" + "\n" +
                    "->" + user_5.getPosition() + "\n" + "->" + user_6.getPosition());
        }

        System.out.print("\n");

        try {
            verificare_cronologie_2();
        } catch (InvalidDatesException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\n");

        User my_user_1 = new User();
        my_user_1.add(user_2);
        my_user_1.add(user_3);
        double medie = my_user_1.meanGPA();
        System.out.println("Media dintre ciclurile avute este " + medie);

    }

    public static void verificare_cronologie_1() throws ParseException, InvalidDatesException  {

        SimpleDateFormat s_d_f = new SimpleDateFormat("dd.MM.yyyy");

        Date date_5 = s_d_f.parse("01.08.2015");
        Date date_6 = s_d_f.parse("01.08.2015");

        Education user_4 = new Education("masters", "MIT",
                date_5, date_6, 9.35);

        if (user_4.getStart_date().compareTo(user_4.getEnd_date()) > 0) {
            throw new InvalidDatesException("Data de inceput si data de sfarsit sunt incorecte " +
                                            "din punct de vedere cronologic.");
        }
        System.out.println("Data de inceput si data de sfarsit sunt corecte " +
                           "din punct de vedere cronologic.");

    }

    public static void verificare_cronologie_2() throws ParseException, InvalidDatesException  {

        SimpleDateFormat s_d_f = new SimpleDateFormat("dd.MM.yyyy");

        Date date_11 = s_d_f.parse("01.05.2015");
        Date date_12 = s_d_f.parse("01.06.2016");

        Experience user_7 = new Experience("MIT", "Researcher", date_11, date_12);

        if (user_7.getStart_date().compareTo(user_7.getEnd_date()) > 0) {
            throw new InvalidDatesException("Data de inceput si data de sfarsit sunt incorecte " +
                    "din punct de vedere cronologic.");
        }
        System.out.println("Data de inceput si data de sfarsit sunt corecte " +
                "din punct de vedere cronologic.");

    }

}
