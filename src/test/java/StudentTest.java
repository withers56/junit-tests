import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testIfGettingId() {
        Student s1 = new Student("will", 6);
        assertEquals(6, s1.getId());
    }

    @Test
    public void testIfGettingName(){
        Student s1 = new Student("will", 6);
        assertEquals("will", s1.getName());
    }

    @Test
    public void testIfAverageIsCorrect() {
        double average = (double) (99 + 90) / 2;

        Student s1 = new Student("will", 6);
        s1.addGrade(99);
        s1.addGrade(90);

        assertEquals(average, s1.getGradeAverage(), 2);
    }

    @Test
    public void testIfListEquals() {
        ArrayList<Integer> testGrades = new ArrayList<>();
        testGrades.add(99);
        testGrades.add(90);

        Student s1 = new Student("will", 6);
        s1.addGrade(99);
        s1.addGrade(90);

//        for (int i = 0; i < testGrades.size(); i++) {
//            assertEquals(testGrades.get(i), s1.getGrades().get(i));
//        }
        assertEquals(testGrades, s1.getGrades());
    }
}
