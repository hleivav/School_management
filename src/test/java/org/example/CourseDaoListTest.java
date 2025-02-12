package org.example;
import org.example.Course;
import org.example.Student;
import org.example.data_access.CourseDaoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CourseDaoListTest {

    private CourseDaoList courseDaoList;
    private Course course1;
    private Course course2;

    @BeforeEach
    public void setUp() {
        CourseDaoList.clearCourses(); // Rensa listan innan varje test
        courseDaoList = new CourseDaoList();
        course1 = new Course("Math", LocalDate.of(2025, 1, 1), 10);
        course2 = new Course("Science", LocalDate.of(2025, 2, 1), 15);
        courseDaoList.saveCourse(course1);
        courseDaoList.saveCourse(course2);
    }

    @Test
    public void testSaveCourse() {
        Course course = new Course("History", LocalDate.of(2025, 3, 1), 12);
        Course savedCourse = courseDaoList.saveCourse(course);
        assertEquals(course, savedCourse);
        assertEquals(3, courseDaoList.findAll().size());
    }

    @Test
    public void testFindById() {
        Course course = courseDaoList.findById(course1.getId());
        assertNotNull(course);
        assertEquals("Math", course.getCourseName());

        Course nonExistentCourse = courseDaoList.findById(99);
        assertNull(nonExistentCourse);
    }

    @Test
    public void testFindByName() {
        ArrayList<Course> courses = courseDaoList.findByName("Science");
        assertEquals(1, courses.size());
        assertEquals("Science", courses.get(0).getCourseName());

        ArrayList<Course> nonExistentCourses = courseDaoList.findByName("Non Existent");
        assertEquals(0, nonExistentCourses.size());
    }

    @Test
    public void testFindByDate() {
        ArrayList<Course> courses = courseDaoList.findByDate(LocalDate.of(2025, 1, 1));
        assertEquals(1, courses.size());
        assertEquals("Math", courses.get(0).getCourseName());

        ArrayList<Course> nonExistentCourses = courseDaoList.findByDate(LocalDate.of(2024, 1, 1));
        assertEquals(0, nonExistentCourses.size());
    }

    @Test
    public void testFindAll() {
        ArrayList<Course> courses = courseDaoList.findAll();
        assertEquals(2, courses.size());
    }

    @Test
    public void testRemoveCourse() {
        boolean removed = courseDaoList.removeCourse(course1);
        assertTrue(removed);
        assertEquals(1, courseDaoList.findAll().size());

        boolean notRemoved = courseDaoList.removeCourse(course1);
        assertFalse(notRemoved);
        assertEquals(1, courseDaoList.findAll().size());
    }

}
