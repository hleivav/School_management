package org.example;

import org.example.Sequencers.CourseSequencer;
import org.example.Sequencers.LectureSequencer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    //fields
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Lecture> lectures = new ArrayList<>();

    //constructor
    public Course(String courseName, LocalDate startDate, int weekDuration) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.id = CourseSequencer.nextId();
    }

    //setters & getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Lecture> getLectures(){
        return lectures;
    }

    //methods
    public void register(Student student){
        students.add(student);
    }

    public void unRegister(Student student){
        students.remove(student);
    }

    public void addLecture(Lecture lecture){
        lectures.add(lecture);
    }

    public void removeLecture(Lecture lecture){
        lectures.remove(lecture);
    }
}
