import java.util.ArrayList;

public class Student {

    private long id;

    private String name;

    private ArrayList<Integer> grades;

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

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}
