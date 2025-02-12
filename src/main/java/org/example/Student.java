package org.example;

import org.example.Sequencers.StudentIdSequencer;

import java.util.ArrayList;

public class Student {
    //fields
    private int id;
    private String name;
    private String email;
    private String address;
    private final ArrayList<Course> courses = new ArrayList<>();

    //constructor
    public Student(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.id = StudentIdSequencer.nextId();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    //methods
    public void registerInNewCourse(Course newCourse){
        courses.add(newCourse);
    }

    public void unregisterFromCourse(Course courseToUnregister){
        courses.remove(courseToUnregister);
    }
}
