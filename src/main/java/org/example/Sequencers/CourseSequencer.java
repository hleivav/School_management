package org.example.Sequencers;

public class CourseSequencer {
    private static int currentId;

    public static int nextId(){
        return currentId++;
    }

    public static int getCurrentId(){
        return currentId;
    }

    public static void setCurrentId(int newId){
        currentId = newId;
    }
}
