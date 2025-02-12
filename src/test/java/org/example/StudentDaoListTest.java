package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Student;
import org.example.data_access.StudentDaoList;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDaoListTest {

    private StudentDaoList studentDaoList;
    private Student student1;
    private Student student2;

    @BeforeEach
    public void setUp() {
        StudentDaoList.clearStudents(); // Rensa listan innan varje test
        studentDaoList = new StudentDaoList();
        student1 = new Student("John Doe", "john.doe@example.com", "123 Main St");
        student2 = new Student("Jane Smith", "jane.smith@example.com", "456 Elm St");
        studentDaoList.saveStudent(student1);
        studentDaoList.saveStudent(student2);
    }

    @Test
    public void testSaveStudent() {
        Student student = new Student("Alice Johnson", "alice.johnson@example.com", "789 Pine St");
        Student savedStudent = studentDaoList.saveStudent(student);
        assertEquals(student, savedStudent);
        assertEquals(3, studentDaoList.findAll().size());
    }

    @Test
    public void testFindByEmail() {
        Student student = studentDaoList.findByEmail("john.doe@example.com");
        assertNotNull(student);
        assertEquals("John Doe", student.getName());

        Student nonExistentStudent = studentDaoList.findByEmail("non.existent@example.com");
        assertNull(nonExistentStudent);
    }

    @Test
    public void testFindByName() {
        ArrayList<Student> students = studentDaoList.findByName("Jane Smith");
        assertEquals(1, students.size());
        assertEquals("Jane Smith", students.get(0).getName());

        ArrayList<Student> nonExistentStudents = studentDaoList.findByName("Non Existent");
        assertEquals(0, nonExistentStudents.size());
    }

    @Test
    public void testFindById() {
        Student student = studentDaoList.findById(student1.getId());
        assertNotNull(student);
        assertEquals("John Doe", student.getName());

        Student nonExistentStudent = studentDaoList.findById(99);
        assertNull(nonExistentStudent);
    }

    @Test
    public void testFindAll() {
        ArrayList<Student> students = studentDaoList.findAll();
        assertEquals(2, students.size());
    }

    @Test
    public void testDeleteStudent() {
        boolean deleted = studentDaoList.deleteStudent(student1);
        assertTrue(deleted);
        assertEquals(1, studentDaoList.findAll().size());

        boolean notDeleted = studentDaoList.deleteStudent(student1);
        assertFalse(notDeleted);
        assertEquals(1, studentDaoList.findAll().size());
    }

    }
