package org.example.data_access;

import org.example.Student;
import org.example.Teacher;

import java.util.ArrayList;

public interface TeacherDAO {
    Teacher saveTeacher(Teacher teacher);
    Teacher findByEmail(String email);
    ArrayList<Teacher> findByName(String name);
    Teacher findById(int id);
    ArrayList<Teacher>findAll();
    boolean deleteTeacher(Teacher teacher);
}
