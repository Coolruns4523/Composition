package com.example.demo;

public class Course {

    //Course is set up with title and room number
    private String courseTitle;
    private String courseNumber;
    private String roomNumber;


    //Overloaded constructor used. Did not add the default constructor for the Web.
    public Course(String courseTitle, String courseNumber, String roomNumber){
        this.courseTitle = courseTitle;
        this.courseNumber = courseNumber;
        this.roomNumber = roomNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }



}
