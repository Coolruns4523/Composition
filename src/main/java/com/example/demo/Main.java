package com.example.demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Set variables

        Course course;
        Institution institution;
        ArrayList<Institution> institutions = new ArrayList<>();

        //Set course

        Course algebra = new Course("Algebra","204","110");
        Course calculus = new Course("Calculus","405","208");
        Course english = new Course("English","324","130");
        Course film = new Course("Film","212","311");

        //Set institution

        Institution TowsonUniversity = new Institution("TU");
        institutions.add(TowsonUniversity);
        Institution UniversityOfMaryland = new Institution("UMD");
        institutions.add(UniversityOfMaryland);
        Institution UniversityOfMarylandBaltimoreCounty = new Institution("UMBC");
        institutions.add(UniversityOfMarylandBaltimoreCounty);
        Institution MontgomeryCollege = new Institution("MC");
        institutions.add(MontgomeryCollege);

        TowsonUniversity.takes(calculus);
        TowsonUniversity.takes(film);
        UniversityOfMaryland.takes(algebra);
        UniversityOfMaryland.takes(calculus);
        UniversityOfMarylandBaltimoreCounty.takes(english);
        UniversityOfMarylandBaltimoreCounty.takes(film);
        MontgomeryCollege.takes(algebra);
        MontgomeryCollege.takes(english);


        for(Institution eachInstitute:institutions)
        {
            System.out.println(eachInstitute.getName()+" "+"'s courses:");
            for (Course eachCourse:eachInstitute.getCourses())
            {
                System.out.println("\t"+eachCourse.getCourseTitle()+" "+eachCourse.getCourseNumber()+" in room "
                        +eachCourse.getRoomNumber());
            }
        }



    }

}
