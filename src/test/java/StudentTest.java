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
    }

    @Test
    public void testIfGradesIsInitialized() {
        assertNotNull(studentWithOne.getGrades());
    }

    @Test
    public void testIfGradesCanBeAdded(){
        assertEquals(1, studentWithOne.getGrades().size());
        studentWithOne.getGrades().add(50);
        assertEquals(2, studentWithOne.getGrades().size());
        assertSame(10, studentWithOne.getGrades().get(0));
        assertSame(50, studentWithOne.getGrades().get(1));
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyStudent.getGrades().isEmpty());
        assertFalse(studentWithOne.getGrades().isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, emptyStudent.getGrades().size());
        assertEquals(1, studentWithOne.getGrades().size());
        assertEquals(3, studentWithMany.getGrades().size());
    }

    @Test
    public void testAdd(){
        // Making sure the emptyStudent returns true
        assertTrue(emptyStudent.getGrades().isEmpty());

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
