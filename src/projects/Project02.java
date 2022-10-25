package projects;

import java.time.Year;
import java.util.Scanner;
import java.text.MessageFormat;

public class Project02 {
    public static void main(String[] args) {
//        System.out.println("\n------------------------Task 01------------------------\n");
//        task_01();

//        System.out.println("\n
//        ------------------------Task 02------------------------\n");
//        task_02();
//
//        System.out.println("\n------------------------Task 03------------------------\n");
//        task_03();
//
        System.out.println("\n------------------------Task 04------------------------\n");
        task_04();
    }

    public static void task_01() {
        /**
         * -Write a program that asks user to enter their 3 numbers
         * -Then multiply these numbers and print the result in the format:
         * The product of the numbers entered is = {number1}*{number2}*{number3}
         */

        Scanner scanner = new Scanner(System.in);

        String input;
        String[] numbers;
        int multiplieNumbers;

        // Prompt
        System.out.println("Please enter 3 numbers");
        input = scanner.nextLine();

        // Remove empty spaces and store the numbers in an array of strings
        numbers = input.split(" ");

        // Convert numbers to int and multiply them
        multiplieNumbers = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]) * Integer.parseInt(numbers[2]);

        System.out.println("The product of the numbers entered is = " + multiplieNumbers);
    }

    public static void task_02() {
        /**
         * -Write a program that asks user to enter their first name, last name and year of birth.
         * -Then calculate the age by subtracting the year of birth from current year we are in.
         * -Print result in the format: {firstName} {lastName}’s age is = {currentYear} – {yearOfBirth}.
         */

        Scanner scanner = new Scanner(System.in);

        String fName, lName;
        int birthYear, age;

        // Prompt for first name
        System.out.println("What is your first name?");
        fName = scanner.next();

        scanner.nextLine();

        // Prompt for last name
        System.out.println("What is your last name?");
        lName = scanner.next();

        scanner.nextLine();

        // Prompt for birth year
        System.out.println("What is your birth year?");
        birthYear = scanner.nextInt();

        // Calculate age
        age = Year.now().getValue() - birthYear;

        System.out.println(MessageFormat.format("{0} {1}’s age is {2}.", fName, lName, age));
    }

    public static void task_03() {
        /**
         * -Write a program that asks user to enter their full name and weight as kg.
         * -Then calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
         * -Print result in the format: {fullName}’s weight is = {kgWeight * 2.205} lbs.
         */

        Scanner scanner = new Scanner(System.in);

        String fullName;
        double weight, convertKgToLbs;

        // Prompt for full name
        System.out.println("What is your full name?");
        fullName = scanner.nextLine();

        // Prompt for weight
        System.out.println("What is your weight?");
        weight = scanner.nextInt();

        convertKgToLbs = weight * 2.205f;

        System.out.println(MessageFormat.format("{0}’s weight is {1} lbs.", fullName, convertKgToLbs));
    }

    public static void task_04() {
        /**
         * -Write a program that asks 3 students to enter their full name and age
         * -Then print each student’s age with their full names as {fullName}’s age is {age}.
         * -And, calculate the average age for these students and print result as The average age is {averageAge}.
         * -And, find the eldest age and print result as The eldest age is {eldestAge}.
         * -And, find the youngest age and print result as The youngest age is {youngestAge}.
         */

        Scanner scanner = new Scanner(System.in);

        String firstStudentName, secondStudentName, thirdStudentName;
        int firstStudentAge, secondStudentAge, thirdStudentAge;
        int average, maxAge, minAge;

        // Prompt first student for their name and age
        System.out.println("What is your full name?");
        firstStudentName = scanner.nextLine();
        System.out.println("What is your age?");
        firstStudentAge = scanner.nextInt();

        scanner.nextLine();

        // Prompt second student for their name and age
        System.out.println("What is your full name?");
        secondStudentName = scanner.nextLine();
        System.out.println("What is your age?");
        secondStudentAge = scanner.nextInt();

        scanner.nextLine();

        // Prompt third student for their name and age
        System.out.println("What is your full name?");
        thirdStudentName = scanner.nextLine();
        System.out.println("What is your age?");
        thirdStudentAge = scanner.nextInt();

        // Calculate the average age
        average = (firstStudentAge + secondStudentAge + thirdStudentAge) / 3;

        // Get the eldest age
        maxAge = Math.max(Math.max(firstStudentAge, secondStudentAge), thirdStudentAge);

        // Get the youngest age
        minAge = Math.min(Math.min(firstStudentAge, secondStudentAge), thirdStudentAge);

        System.out.println(MessageFormat.format("{0}’s age is {1}.", firstStudentName, firstStudentAge));
        System.out.println(MessageFormat.format("{0}’s age is {1}.", secondStudentName, secondStudentAge));
        System.out.println(MessageFormat.format("{0}’s age is {1}.", thirdStudentName, thirdStudentAge));
        System.out.println("The average age is " + average);
        System.out.println("The eldest age is " + maxAge);
        System.out.println("The youngest age is " + minAge);
    }
}
