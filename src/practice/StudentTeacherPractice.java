package practice;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Alex", "Doe");

        System.out.println(teacher1.getStudents().size());

        Student student1 = new Student("Mike", "Smith", 25);
        Student student2 = new Student("Jane", "Smith", 30);

        Student student3 = new Student("A", "X", 17);
        Student student4 = new Student("B", "T", 19);
        Student student5 = new Student("C", "Z", 21);


        teacher1.addStudent(student1);
        teacher1.addStudent(student2);

        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        for(Teacher teacher : teachers) {
            if(teacher.fName.equals("Alex")) {
                int total = 0;
                for(Student s : teacher.getStudents()) {total+= s.age;};
                System.out.println(total / teacher.getStudents().size());
            }
        }
    }
}
