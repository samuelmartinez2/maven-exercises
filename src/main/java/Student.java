import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    ArrayList<Integer> grades;

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

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public void addGrade(int grade) {
        this. grades.add(grade);
    }
    public double getGradesAverage() {
        double
    }




}
