package org.example.data_access;

import org.example.Student;

import java.util.ArrayList;

public interface StudentDAO {
    Student saveStudent(Student student);
    Student findByEmail(String email);
    ArrayList<Student> findByName(String name);
    Student findById(int id);
    ArrayList<Student>findAll();
    boolean deleteStudent(Student student);
}
