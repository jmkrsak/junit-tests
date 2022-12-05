import java.util.ArrayList;
import java.util.List;

public class Student {

    private long id;

    private String name;

    private ArrayList<Integer> grades;

    public Student() {

    }

    public Student(String name, long id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(List<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();

    }

}
