package org.example.data_access;

import org.example.Teacher;
import java.util.Iterator;
import java.util.ArrayList;

public class TeacherDAOList implements TeacherDAO{

    private ArrayList<Teacher> teachers = new ArrayList<>();

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        teachers.add(teacher);
        return teacher;
    }

    @Override
    public Teacher findByEmail(String email) {
        Iterator<Teacher> itr = teachers.iterator();
        while(itr.hasNext()){
            Teacher teacher = itr.next();
            if (teacher.getEmail().equals(email)){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Teacher> findByName(String name) {
        Iterator<Teacher> itr = teachers.iterator();
        ArrayList<Teacher> tempArrayList = new ArrayList<>();
        while(itr.hasNext()){
            Teacher teacher = itr.next();
            if (teacher.getName().equals(name)){
                tempArrayList.add(teacher);
            }
        }
        return tempArrayList;
    }

    @Override
    public Teacher findById(int id) {
        Iterator<Teacher> itr = teachers.iterator();
        while(itr.hasNext()){
            Teacher teacher = itr.next();
            if (teacher.getId() == id){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Teacher> findAll() {
        return teachers;
    }

    @Override
    public boolean deleteTeacher(Teacher teacher) {
        if (teachers.contains(teacher)){
            return teachers.remove(teacher);
        }
        return false;
    }
}
