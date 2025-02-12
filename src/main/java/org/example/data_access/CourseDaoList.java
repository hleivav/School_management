package org.example.data_access;

import org.example.Course;
import org.example.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class CourseDaoList implements CourseDAO{

    private final static ArrayList<Course> courses = new ArrayList<>();

    @Override
    public Course saveCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course findById(int id) {
        Iterator<Course> itr = courses.iterator();
        while (itr.hasNext()){
            Course course = itr.next();
            if (course.getId() == id){
                return course;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Course> findByName(String name) {
        Iterator<Course> itr = courses.iterator();
        ArrayList<Course> tempArrayList = new ArrayList<>();
        while (itr.hasNext()){
            Course course = itr.next();
            if (course.getCourseName().equals(name)){
                tempArrayList.add(course);
            }
        }
        return tempArrayList;
    }

    @Override
    public ArrayList<Course> findByDate(LocalDate date) {
        Iterator<Course> itr = courses.iterator();
        ArrayList<Course> tempArrayList = new ArrayList<>();
        while (itr.hasNext()){
            Course course = itr.next();
            if (course.getStartDate().isEqual(date)){
                tempArrayList.add(course);
            }
        }
        return tempArrayList;
    }

    @Override
    public ArrayList<Course> findAll() {
        return courses;
    }

    @Override
    public boolean removeCourse(Course courseToRemove) {
        Iterator<Course> itr = courses.iterator();
        while (itr.hasNext()){
            Course course = itr.next();
            if (course.equals(courseToRemove)){
                return courses.remove(course);
            }
        }
        return false;
    }
}
