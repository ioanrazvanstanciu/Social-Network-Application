package com.company;

import java.util.*;

public abstract class Consumer {

    Resume user_resume = new Resume();
    ArrayList<Consumer> user_friends = new ArrayList<>();

    static class Resume {

        private Information user_information = new Information();
        private ArrayList<Education> user_education = new ArrayList<>();
        private ArrayList<Experience> user_experience = new ArrayList<>();

        private Resume(ResumeBuilder builder) {
            this.user_information = builder.user_information;
            this.user_education = builder.user_education;
            this.user_experience = builder.user_experience;
        }

        public Resume() {

        }

        public static class ResumeBuilder {

            private Information user_information;
            private ArrayList<Education> user_education;
            private ArrayList<Experience> user_experience;

            public ResumeBuilder information(Information user_information) {
                if(user_information == null) {
                    user_information = new Information();
                }
                this.user_information = user_information;
                return this;
            }

            public ResumeBuilder education(Education education) {
                if(user_education == null) {
                    user_education = new ArrayList<>();
                }
                user_education.add(education);
                return this;
            }

            public ResumeBuilder experience(Experience experience) {
                if(user_experience == null) {
                    user_experience = new ArrayList<>();
                }
                user_experience.add(experience);
                return this;
            }

            public Resume build() {
                return new Resume(this);
            }

        }

    }

    public void add(Education education) {
        this.user_resume.user_education.add(education);
    }

    public void add(Experience experience) {
        this.user_resume.user_experience.add(experience);
    }

    public void add(Consumer consumer) {
        this.user_friends.add(consumer);
    }

    /*public int getDegreeInFriendship(Consumer consumer) {

    }*/

    public void remove(Consumer consumer) {
        this.user_friends.remove(consumer);
    }

    public Integer getGraduationYear() {
        return this.user_resume.user_education.get(0).getEnd_date().getYear() + 1900;
    }

    public Double meanGPA() {
        int i;
        double sum = 0;
        double average;
        for(i = 0; i < this.user_resume.user_education.size(); i++) {
            sum = sum + this.user_resume.user_education.get(i).getGrade();
        }
        average = sum / this.user_resume.user_education.size();
        return average;
    }

}
