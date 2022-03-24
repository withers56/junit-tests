import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CohortTest {
    private Cohort cohort;
    private Student student2;
    private Student student1;

    @Before
    public void setup(){
        cohort = new Cohort();
        student1 = new Student(1, "will");
        student1.addGrade(100);
        student2 = new Student(2, "joe");
        student2.addGrade(90);

    }

    @Test
    public void TestIfCanAddStudent() {
        assertTrue(cohort.getStudents().isEmpty());
        cohort.addStudent(student1);
        assertFalse(cohort.getStudents().isEmpty());
    }

    @Test
    public void TestIfCanGetList() {
        cohort.addStudent(student1);
        assertEquals("will", cohort.getStudents().get(0).getName());
    }

    @Test
    public void TestIfCanGetAverage() {
        cohort.addStudent(student1);
        cohort.addStudent(student2);

        assertEquals(95.0, cohort.getCohortAverage(), 1);
    }
}
