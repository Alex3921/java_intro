package practice;

public class StudentTest {
    public static void main(String[] args) {

        System.out.println(Student.numberOfStudents);
        System.out.println(Student.program);

        Student student1 = new Student("John", "Doe", 45);
        System.out.println(Student.numberOfStudents);

        Student student2 = new Student("Jane", "Doe", 30);
        System.out.println(Student.numberOfStudents);

        student1.study();
        student2.study();

        student1.rest();
        student2.rest();
    }
}
