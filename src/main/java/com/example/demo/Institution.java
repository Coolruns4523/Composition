package com.example.demo;

import java.util.ArrayList;

public class Institution {

    //Set up attributes of the student class
    private String name;


    //What's this? An arraylist of courses that the student is taking!

    private ArrayList<Course> courses;

    //Overloaded constructor used.

    public Institution(String name){
        this.name = name;
        this.courses = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takes (Course course)
    {
        this.courses.add(course);
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}
