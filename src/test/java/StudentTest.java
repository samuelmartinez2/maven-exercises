import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setup() {
        this.student = new Student(1, "Joe Bottom");

    }

    @Test
    public void testStudentConstructor() {
        assertEquals(1, student.getId());
        assertEquals("joe bottom", student.getName());
        assertTrue(student.getGrades().isEmpty());

    }
    @Test
    public void  testGetIdMethod() {
        assertEquals(1,student.getId());
        Student newStudent = new Student(24,"Bob Builder");
        assertEquals(24, newStudent.getId());

    }

    @Test
    public void testGetNameMethod() {
        assertEquals("joe bottom", student.getName());
        Student student2 = new Student(2, "jose january");
        assertEquals("jose january", student2.getName());
    }

    @Test
    public void testaddGradeMethod() {
        student.addGrade(88);
        assertEquals(1,student.getGrade().size());
        student.addGrade(94);
        assertEquals(2, student.getGrades().size());
    }

    @Test
    public void testGetGradesMethod() {
        assertTrue(student.getGrades().isEmpty());
        List<Integer> gradesToAdd = new ArrayList<>(Arrays.asList(100,99,94));
        for (int grade : gradessToAdd) {
            student.addGrades(grade);
        }
        for (int i=0; i<student.getGrades().size(); i++) {
            assertEquals(student.getGrades().get(i) == gradesToAdd(i));

        }



    }


}
