package org.example.data_access;

import org.example.Course;

import java.time.LocalDate;
import java.util.ArrayList;

public interface CourseDAO {
    Course saveCourse(Course course);
    Course findById(int id);
    ArrayList<Course> findByName(String name);
    ArrayList<Course> findByDate(LocalDate date);
    ArrayList<Course>findAll();
    boolean removeCourse(Course course);
}
