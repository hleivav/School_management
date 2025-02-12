package org.example.data_access;

import org.example.Lecture;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class LectureDAOList implements LectureDAO{

    private ArrayList<Lecture> lectures = new ArrayList<>();

    @Override
    public Lecture saveLecture(Lecture lecture) {
        lectures.add(lecture);
        return lecture;
    }

    @Override
    public Lecture findById(int id) {
        Iterator<Lecture> itr = lectures.iterator();
        while (itr.hasNext()){
            Lecture lecture = itr.next();
            if (lecture.getId() == id){
                return lecture;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Lecture> findByName(String name) {
        Iterator<Lecture> itr = lectures.iterator();
        ArrayList<Lecture> tempArrayList = new ArrayList<>();
        while (itr.hasNext()){
            Lecture lecture = itr.next();
            if (lecture.getName().equals(name)){
                lectures.add(lecture);
            }
        }
        return tempArrayList;
    }

    @Override
    public ArrayList<Lecture> findAll() {
        return lectures;
    }

    @Override
    public boolean removeLecture(Lecture lectureToRemove) {
        Iterator<Lecture> itr = lectures.iterator();
        while (itr.hasNext()){
            Lecture lecture = itr.next();
            if(lecture.equals(lectureToRemove)){
                lectures.remove(lecture);
            }
        }
        return false;
    }
}
