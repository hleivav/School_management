package org.example;

import org.example.data_access.StudentDaoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final ArrayList<String> menuItems = new ArrayList<String>(){{
        add("Create new course");
        add("Create new student");
        add("Find student");
        add("Find courses");
        add("Edit student");
        add("Edit course");
    }};

    public static void showMenu(){
        System.out.println("Make your choice: ");
        int counter = 1;
        for(String element : menuItems){
            System.out.println(counter + " - " + element);
            counter++;
        }
        System.out.println("0 - Exit");
    }

    public static void showSubMenu3(){
        boolean done = false;

        while (!done){
            System.out.println("Make a choice for your search: ");
            System.out.println("1- Search by id.");
            System.out.println("2- Search by name");
            System.out.println("3- Search by email");
            System.out.println("4- Search by address");
            System.out.println("0- Back to main menu");
            Scanner scanner = new Scanner(System.in);
            String userchoise = scanner.nextLine();
            switch (userchoise){
                case "1":
                    System.out.println("Enter the id: ");

            }
        }
    }

    public static boolean checkOptions(String menuOption){
        switch (menuOption){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "0":
                return true;
            default:
                System.out.println("Choose one of the available alternatives");
        }
        return false;
    }
}
