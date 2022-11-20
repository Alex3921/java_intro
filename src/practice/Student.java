package practice;

public class Student {
    public Student() {}

    // Create a constructor that takes 2 args

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        numberOfStudents++;
    }


    // Define public instance variables of practice.Student class as below

    public static int numberOfStudents = 0;

    public static final String program = "Software Engineer in Test Program";

    public String firstName;
    public String lastName;
    public int age;

    public void study() {
        System.out.println(firstName + " studies!");
    }

    public void rest() {
        System.out.println(firstName + " " + lastName + " rests!");
    }

    public static void addStudent() {
        numberOfStudents++;
    }

    @Override
    public String toString() {
        return "practice.Student{" +
                "program='" + program + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
