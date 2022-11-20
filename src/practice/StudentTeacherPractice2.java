package practice;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "Smith");

        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Smith", 25);
        Student student4 = new Student("Robert", "Smith", 50);


        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;

        for(Student s : teacher.getStudents()) {
            if(s.age < minAge) {
                minAge = s.age;
            } else if(s.age > maxAge) {
                maxAge = s.age;
            }
        }

        System.out.println(maxAge - minAge);
    }
}
