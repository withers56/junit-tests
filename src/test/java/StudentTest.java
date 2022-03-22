import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    public String name;
    private long id;
    private ArrayList<Integer> grades;

    @Before
    public void setup() {
        name = "will";
        id = 6;
        grades = new ArrayList<>();
        grades.add(99);
        grades.add(90);
    }

    @Test
    public void testIfGettingId() {
        assertEquals(6, getId());
    }

    @Test
    public void testIfGettingName(){
        assertEquals("will", getName());
    }

    @Test
    public void testIfAverageIsCorrect() {
        double average = (double) (99 + 90) / 2;

        assertEquals(average, getGradeAverage(), 2);
    }

    @Test
    public void testIfListEquals() {
        ArrayList<Integer> testGrades = new ArrayList<>();
        testGrades.add(99);
        testGrades.add(90);

        for (int i = 0; i < testGrades.size(); i++) {
            assertEquals(testGrades.get(i), grades.get(i));
        }
    }




    public void addGrade(int grade) {
        getGrades().add(grade);
    }

    public double getGradeAverage() {
        long total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return (double)(total / grades.size());
    }

    //accessor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
