package org.example.data_access;

import org.example.Course;
import org.example.Lecture;

import java.time.LocalDate;
import java.util.ArrayList;

public interface LectureDAO {
    Lecture saveLecture(Lecture lecture);
    Lecture findById(int id);
    ArrayList<Lecture> findByName(String name);
    ArrayList<Lecture> findAll();
    boolean removeLecture(Lecture lecture);
}
