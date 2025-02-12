package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Basic Programming", LocalDate.of(2025,3,1), 8);
        Course course2 = new Course("Data Analysis", LocalDate.of(2025, 4,15), 6);
        Course course3 = new Course("Photography", LocalDate.of(2025,1,7), 5);

        Lecture lecture1 = new Lecture("Basic Syntax and Variables", course1.getId());
        Lecture lecture2 = new Lecture("Control Structures", course1.getId());
        Lecture lecture3 = new Lecture("Methods and Functions", course1.getId());
        Lecture lecture4 = new Lecture("Object Oriented Programming", course1.getId());
        Lecture lecture5 = new Lecture("Classes and Objects", course1.getId());
        Lecture lecture6 = new Lecture("Inheritance and Polymorphism", course1.getId());
        Lecture lecture7 = new Lecture("Error Handling and Exceptions", course1.getId());
        Lecture lecture8 = new Lecture("Built-in Libraries and APIs", course1.getId());
        Lecture lecture9 = new Lecture("Introduction to Python and Environment Setup", course2.getId());
        Lecture lecture10 = new Lecture("Data Import and Export", course2.getId());
        Lecture lecture11 = new Lecture("Data Cleaning and Preprocessing", course2.getId());
        Lecture lecture12 = new Lecture("Exploratory Data Analysis (EDA)", course2.getId());
        Lecture lecture13 = new Lecture("Data Visualization with Matplotlib and Seaborn", course2.getId());
        Lecture lecture14 = new Lecture("Basic Statistics and Hypothesis Testing", course2.getId());
        Lecture lecture15 = new Lecture("Introduction to Camera Functions", course3.getId());
        Lecture lecture16 = new Lecture("Basic Composition and Lighting", course3.getId());
        Lecture lecture17 = new Lecture("Portrait Photography", course3.getId());
        Lecture lecture18 = new Lecture("Landscape Photography", course3.getId());
        Lecture lecture19 = new Lecture("Post-Processing and Editing with Adobe Lightroom", course3.getId());



        Student student1 = new Student("Sara Svensson", "sara.svensson@lexikon.se", "Kungsgatan 54");
        Student student2 = new Student("Erik Johansson", "erik.johansson@lexikon.se", "Riddargatan 32");
        Student student3 = new Student("Emma Karlsson", "emma.karlsson@lexikon.se", "Vasagatan 12");
        Student student4 = new Student("Johan Karlsson", "johan.karlsson@lexikon.se", "Drottninggatan 45");
        Student student5 = new Student("Klara Johansson", "klara.johansson@lexikon.se", "Sveavägen 88");
        Student student6 = new Student("Anders Svensson", "anders.svensson@lexikon.se", "Östermalmstorg 10");
        Student student7 = new Student("Sofia Lindberg", "sofia.lindberg@lexikon.se", "Birger Jarlsgatan 23");
        Student student8 = new Student("Niklas Eriksson", "niklas.eriksson@lexikon.se", "Norrmalmstorg 5");
        Student student9 = new Student("Elin Nilsson", "elin.nilsson@lexikon.se", "Kungsholmen 7");
        Student student10 = new Student("Ola Lindberg", "ola.lindberg@lexikon.se", "Hötorget 3");
        Student student11 = new Student("Olivia Andersson", "olivia.andersson@lexikon.se", "Kungsgatan 33");
        Student student12 = new Student("Emil Andersson", "emil.andersson@lexikon.se", "Drottninggatan 22");
        Student student13 = new Student("Frida Johansson", "frida.johansson@lexikon.se", "Sveavägen 55");
        Student student14 = new Student("Gustav Nilsson", "gustav.nilsson@lexikon.se", "Vasagatan 15");
        Student student15 = new Student("Vera Persson", "vera.persson@lexikon.se", "Östermalmstorg 18");
        Student student16 = new Student("Fredrik Persson", "fredrik.persson@lexikon.se", "Birger Jarlsgatan 35");
        Student student17 = new Student("Anna Eriksson", "anna.eriksson@lexikon.se", "Norrmalmstorg 9");
        Student student18 = new Student("Viktor Johansson", "viktor.johansson@lexikon.se", "Hötorget 11");
        Student student19 = new Student("Matilda Larsson", "matilda.larsson@lexikon.se", "Kungsholmen 14");
        Student student20 = new Student("Magnus Larsson", "magnus.larsson@lexikon.se", "Sveavägen 77");
        Student student21 = new Student("Ingrid Gustafsson", "ingrid.gustafsson@lexikon.se", "Drottninggatan 48");
        Student student22 = new Student("Josefin Karlsson", "josefin.karlsson@lexikon.se", "Vasagatan 9");
        Student student23 = new Student("Sebastian Karlsson", "sebastian.karlsson@lexikon.se", "Östermalmstorg 21");
        Student student24 = new Student("Vera Eriksson", "vera.eriksson@lexikon.se", "Birger Jarlsgatan 50");
        Student student25 = new Student("Hugo Eriksson", "hugo.eriksson@lexikon.se", "Norrmalmstorg 17");
        Student student26 = new Student("Agnes Nilsson", "agnes.nilsson@lexikon.se", "Hötorget 8");
        Student student27 = new Student("Filip Nilsson", "filip.nilsson@lexikon.se", "Kungsholmen 20");
        Student student28 = new Student("Sara Lindberg", "sara.lindberg@lexikon.se", "Sveavägen 60");
        Student student29 = new Student("Albin Lindberg", "albin.lindberg@lexikon.se", "Drottninggatan 55");
        Student student30 = new Student("Emilia Persson", "emilia.persson@lexikon.se", "Östermalmstorg 25");
        Student student31 = new Student("Linus Persson", "linus.persson@lexikon.se", "Birger Jarlsgatan 60");
        Student student32 = new Student("Alice Johansson", "alice.johansson@lexikon.se", "Norrmalmstorg 22");
        Student student33 = new Student("Emil Larsson", "emil.larsson@lexikon.se", "Hötorget 19");
        Student student34 = new Student("Vera Larsson", "vera.larsson@lexikon.se", "Fikonplan 21");

        Teacher teacher1 = new Teacher("Rune Persson", "rune.persson@lexikon.se", course1);
        Teacher teacher2 = new Teacher("Linda Fox", "linda.fox@lexikon.se", course2);
        Teacher teacher3 = new Teacher("Silvio Moretti", "silvio.moretti@lexikon.se", course3);

                System.out.println("Hello, World!");
    }
}