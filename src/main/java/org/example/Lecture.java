package org.example;

import org.example.Sequencers.LectureSequencer;

public class Lecture {
    //fields
    private int id;
    private String name;
    private String email;

    //constructor
    public Lecture(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = LectureSequencer.nextId();
    }

    //setters & getters


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
}
