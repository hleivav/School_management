package org.example.data_access;

import org.example.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDaoList implements StudentDAO{

    private final static ArrayList<Student> students = new ArrayList<>();

    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmail(String email) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            Student student = itr.next();
            if (student.getEmail().equals(email)){
                return student;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findByName(String name) {
        Iterator<Student> itr = students.iterator();
        ArrayList<Student> tempArrayList = new ArrayList<>();
        while (itr.hasNext()){
            Student student = itr.next();
            if (student.getName().equals(name)){
                tempArrayList.add(student);
            }
        }
        return tempArrayList;
    }

    @Override
    public Student findById(int id) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            Student student = itr.next();
            if (student.getId()==id){
                return student;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findAll() {
        return students;
    }

    @Override
    public boolean deleteStudent(Student studentToRemove) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            Student student = itr.next();
            if (student.equals(studentToRemove)){
                return students.remove(studentToRemove);
            }
        }
        return false;
    }
}
