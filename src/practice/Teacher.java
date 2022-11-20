package practice;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    public Teacher(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String fName;
    public String lName;
    public List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    @Override
    public String toString() {
        return "practice.Teacher{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}