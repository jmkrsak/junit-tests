import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student emptyStudent;
    Student studentWithOne;
    Student studentWithMany;

    @Before
    public void setUp(){
        emptyStudent = new Student("john", 123456, new ArrayList<>());

        studentWithOne = new Student("Michael", 7654321, new ArrayList<>());
        studentWithOne.getGrades().add(10);

        studentWithMany = new Student("Tony", 787878, new ArrayList<>());
        studentWithMany.getGrades().add(20);
        studentWithMany.getGrades().add(30);
        studentWithMany.getGrades().add(40);
        studentWithMany.getGrades().add(50);
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyStudent.isEmpty());
        assertFalse(studentWithOne.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, emptyStudent.size());
        assertEquals(1, studentWithOne.size());
        // Testing sizes is tricky, setting boundaries is always a good idea.
        // Test 0, 1 and many but not 2
        assertEquals(4, studentWithMany.size());
    }

    @Test
    public void testAdd(){
        // Making sure the emptyStudent returns true
        assertTrue(emptyStudent.isEmpty());

        // Add any tortilla to make it not empty anymore
        emptyStudent.add("Any tortilla");

        // Making sure the emptyStudent returns false once we add an element to it
        assertFalse(emptyStudent.isEmpty());

        // Making sure the other instances of are not empty since they added items in the setUp method
        assertFalse(studentWithOne.isEmpty());
        assertFalse(studentWithMany.isEmpty());
    }

    @Test
    public void testRemove(){
        // Trying to pop from an empty Student
        emptyStudent.pop();
        // The void method should catch the if statement and the size should be still 0
        assertEquals(0, emptyStudent.size());

        studentWithOne.pop();
        assertEquals(0, studentWithOne.size());

        studentWithMany.pop();
        assertEquals(3, studentWithMany.size());
    }

    @Test
    public void testContains(){
        assertFalse(emptyStudent.contains("blue corn"));
        assertTrue(studentWithOne.contains("yellow corn"));
        assertTrue(studentWithMany.contains("white corn"));
    }

}
