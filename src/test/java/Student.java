import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;

        grades = new ArrayList<>();
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

}
