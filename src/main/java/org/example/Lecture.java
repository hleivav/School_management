package org.example;

import org.example.Sequencers.LectureSequencer;

public class Lecture {
    //fields
    private int id;
    private String name;
    private int courseId;

    //constructor
    public Lecture(String name, int courseId) {
        this.name = name;
        this.courseId = courseId;
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


    public int getCourseId(){
        return courseId;
    }

    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
}
