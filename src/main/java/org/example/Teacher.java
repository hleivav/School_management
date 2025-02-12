package org.example;

import org.example.Sequencers.TeacherSequencer;

import java.util.ArrayList;

public class Teacher {
    //fields
    private int id;
    private String name;
    private String email;
    private Course course;

    //constructor
    public Teacher(String name, String email, Course course) {
        this.name = name;
        this.email = email;
        this.id = TeacherSequencer.nextId();
    }

    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
