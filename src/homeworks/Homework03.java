package homeworks.homework03;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.sun.xml.internal.bind.v2.util.EditDistance;
import methods.ScannerHelper;

import java.text.MessageFormat;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("\n------------------------Task 01------------------------\n");
        task_01();

        System.out.println("\n------------------------Task 02------------------------\n");
        task_02();

        System.out.println("\n------------------------Task 03------------------------\n");
        task_03();

        System.out.println("\n------------------------Task 04------------------------\n");
        task_04();

        System.out.println("\n------------------------Task 05------------------------\n");
        task_05();

        System.out.println("\n------------------------Task 06------------------------\n");
        task_06();

        System.out.println("\n------------------------Task 07------------------------\n");
        task_07();

        System.out.println("\n------------------------Task 08------------------------\n");
        task_08();

        System.out.println("\n------------------------Task 09------------------------\n");
        task_09();

        System.out.println("\n------------------------Task 10------------------------\n");
        task_10();

        System.out.println("\n------------------------Task 11------------------------\n");
        task_11();

        System.out.println("\n------------------------Task 11------------------------\n");
        task_12();

        System.out.println("\n------------------------Task 11------------------------\n");
        task_13();

        System.out.println("\n------------------------Task 11------------------------\n");
        task_14();
//
        System.out.println("\n------------------------Task 11------------------------\n");
        task_15();
    }

    public static void task_01() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter 2 numbers - int values
         * and find the absolute difference between the two numbers by using
         * Math.abs() method
         *
         * Test Data:
         * -5
         * 27
         *
         * Expected Output:
         * The difference between numbers is = 32
         */

        Scanner scanner = new Scanner(System.in);

        int firstNum, secondNum, absoluteVal;

        // Prompt user for first number
        System.out.println("Please enter first number:");
        firstNum = scanner.nextInt();

        // Prompt user for second number
        System.out.println("Please enter second number:");
        secondNum = scanner.nextInt();

        // Calculate absolute value
        absoluteVal = Math.abs(firstNum - secondNum);

        System.out.println("The difference between numbers is = " + absoluteVal);
    }

    public static void task_02() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter 5 numbers - int values
         * and find the Max and Min number by using Math.max() and
         * Math.min() methods
         *
         * Test Data:
         * 3
         * 15
         * 45
         * 20
         * 25
         *
         * Expected Output:
         * Max value = 45
         * Min value = 3
         */

        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, num4, num5, maxNum, minNum;

        System.out.println("Please enter the first number:");
        num1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the second number:");
        num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the third number:");
        num3 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the fourth number:");
        num4 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the fifth number:");
        num5 = scanner.nextInt();

        minNum = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
        maxNum = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));

        System.out.println("Min value = " + minNum);
        System.out.println("Max value = " + maxNum);
    }

    public static void task_03() {
        /**
         * Requirement:
         * -Write a Java program that generates 3 random numbers between 50
         * and 100 both included. Use Math.random()
         * First print the numbers
         * Then, find the sum of these numbers
         *
         * Test Data:
         * 55
         * 67
         * 90
         *
         * Expected Output:
         * Number 1 = 55
         * Number 2 = 67
         * Number 3 = 90
         * The sum of numbers is = 212
         */

        int rand1, rand2, rand3, sum;

        // Formula to get a random number in a range is:
        // Math.random() * (highRange - lowRange + 1) + lowRange
        rand1 = (int) (Math.random() * (100 - 50 + 1)) + 50;
        rand2 = (int) (Math.random() * (100 - 50 + 1)) + 50;
        rand3 = (int) (Math.random() * (100 - 50 + 1)) + 50;
        sum = rand1 + rand2 + rand3;

        System.out.println("Number 1 = " + rand1);
        System.out.println("Number 2 = " + rand2);
        System.out.println("Number 3 = " + rand3);
        System.out.println("The sum of numbers is = " + sum);
    }

    public static void task_04() {
        /**
         * Assume Alex has $125, and Mike has $220.
         * And Alex is going to give $25.5 to Mike.
         * Then,
         * How much money will Alex and Mike will have after that?
         *
         * Requirement:
         * Write a java program to solve the problem given above
         *
         * Expected Output:
         * Alex’s money: $99.5
         * Mike’s money: 245.5
         */

        int moneyAlex = 125;
        int moneyMike = 220;

        System.out.println("Alex's money: $" + ((double) moneyAlex - 25.5));
        System.out.println("Mike's money: $" + ((double) moneyMike + 25.5));
    }

    public static void task_05() {
        /**
         * Assume David is going to save  $390 to buy a bicycle.
         * David can save only $15.60 per day.
         *
         * Requirement:
         * Write a program to find how many days later, David can save $390
         * and buy the bicycle.
         *
         * Expected Output:
         * 25
         */

        int bicyclePrice = 390;
        double dailySavings = 15.60;

        int daysNeededToSave = (int) (bicyclePrice / dailySavings);

        System.out.println(MessageFormat.format("David needs to save ${0} daily for {1} days.", dailySavings, daysNeededToSave));
    }

    public static void task_06() {
        /**
         * Requirement:
         * Convert given Strings below to int data types and find their sum,
         * product, division, subtraction and remainder.
         *
         * NOTE: Scanner is not needed for this task!
         * String s1 = “5”, s2 = “10”;
         *
         * Expected results:
         * -Sum of 5 and 10 is = 15
         * -Product of 5 and 10 is = 50
         * -Division of 5 and 10 is = 0
         * -Subtraction of  5 and 10 is = -5
         * -Remainder of 5 and 10 is = 5
         */

        String s1 = "5", s2 = "10";

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        int product = Integer.parseInt(s1) * Integer.parseInt(s2);
        int division = Integer.parseInt(s1) / Integer.parseInt(s2);
        int subtraction = Integer.parseInt(s1) - Integer.parseInt(s2);
        int remainder = Integer.parseInt(s1) % Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + sum);
        System.out.println("Product of 5 and 10 is = " + product);
        System.out.println("Division of 5 and 10 is = " + division);
        System.out.println("Subtraction of  5 and 10 is = " + subtraction);
        System.out.println("Remainder of 5 and 10 is = " + remainder);
    }

    public static void task_07() {
        /**
         * Requirement:
         * Convert given Strings below to int data types and find the greatest
         * and smallest values and find the average and absolute difference of
         * them.
         *
         * NOTE: Scanner is not needed for this task!
         * String s1 = “200”, s2 = “-50”;
         *
         * Expected results:
         * The greatest value is = 200
         * The smallest value is = -50
         * The average is = 75
         * The absolute difference is = 250
         */

        String s1 = "200", s2 = "-50";

        int greatest = Math.max(Integer.parseInt(s1), Integer.parseInt(s2));
        int smallest = Math.min(Integer.parseInt(s1), Integer.parseInt(s2));
        int average = (Integer.parseInt(s1) + Integer.parseInt(s2)) / 2;
        int absDifference = Math.abs(Integer.parseInt(s1) - Integer.parseInt(s2));

        System.out.println("The greatest value is = " + greatest);
        System.out.println("The smallest value is = " + smallest);
        System.out.println("The average is = " + average);
        System.out.println("The absolute difference is = " + absDifference);
    }

    public static void task_08() {
        /**
         * Requirement:
         * Assume that you have a coin bank, and you save 3 quarters, 1 dime, 2
         * nickels and 1 penny each day.
         *
         * NOTE: Scanner is not needed for this task!
         * -find how many days later you can save $24
         * -find how many days later you can save $168
         * -how much you will save after 5 months (assume a month is 30 days)
         *
         * Expected results:
         * 25 days
         * 175 days
         * $144.0
         */

        float quarter = 0.25f;
        float dime = 0.1f;
        float nickel = 0.05f;
        float penny = 0.01f;

        float dailySavings = 3 * quarter + dime +  2 * nickel + penny;

        System.out.println(MessageFormat.format("You will need {0} days of saving daily ${1} to have $24.",
                ((24 / dailySavings)), dailySavings));
        System.out.println(MessageFormat.format("You will need {0} days of saving daily ${1} to have $24.",
                ((168 / dailySavings)), dailySavings));
        System.out.println(MessageFormat.format("After 5 months of saving daily ${0} you will have ${1}.",
                dailySavings, 5 * 30 * dailySavings));
    }

    public static void task_09() {
        /**
         * Requirement:
         * Jessie is going to save $1,250 to buy a new computer. Jessie is saving
         * $62.5 in a day.
         * Write a Java program that calculates how many days it will take for
         * Jessie to buy the computer.
         *
         * Expected Output:
         * 20
         * NOTE: 20 days is an int result and does not have any floating point.
         * So, it should not be 20.0 which is a double
         */

        int targetSavings = 1_250;
        double dailySavings = 62.5;

        int totalDays = (int) (targetSavings / dailySavings);

        System.out.println("Jessie will need to save for " +totalDays+ " days.");
    }

    public static void task_10() {
        /**
         * Requirement:
         * Dan is going to save $14,265 to buy a new car. Dan is given two
         * option to make monthly payments with no interest rate.
         * Option 1: Equal payments of $475.50 per month
         * Option 2: Equal payments of $951 per month
         * Write a Java program that calculates how many months it will take for
         * Dan to complete all the payments with option 1 and option 2.
         *
         * NOTE: Scanner is not needed for this task!
         * Expected Output:
         * Option 1 will take 30 months
         * Option 2 will take 15 months
         * NOTE: 15 or 30 months are int results and do not have any floating
         * point. So, it should not be 15.0 or 30.0 which are double
         */

        int newCarPrice = 14_265;
        double option1 = 475.50;
        double option2 = 951;

        int daysUntilPayoffOption1 = (int) (newCarPrice / option1);
        int daysUntilPayoffOption2 = (int) (newCarPrice / option2);

        System.out.println("Option 1 will take " +daysUntilPayoffOption1+ " months.");
        System.out.println("Option 2 will take " +daysUntilPayoffOption2+ " months.");
    }

    public static void task_11() {
        /**
         * Requirement:
         * Write a Java program that asks user to enter 2 numbers(number1 and
         * number2) and store those in int variables.
         * Find the result of number1/number2 and store this in a double.
         * Finally print the result
         *
         * Test data:
         * Number1 = 15
         * Number2 = 2
         *
         * Expected Output:
         * 7.5
         * NOTE: 7.5 is a double or float but you are asked to store the result in
         * a double. Make sure that your result is not returning 7 instead of 7.5
         */

        Scanner scanner = new Scanner(System.in);

        int firstNum, secondNum;
        double division;

        System.out.println("Please enter first number:");
        firstNum = scanner.nextInt();

        System.out.println("Please enter second number:");
        secondNum = scanner.nextInt();

        division = (double) firstNum / secondNum;

        System.out.println("Result is: " +division);
    }

    public static void task_12() {
        /**
         * Requirement:
         * Write a Java program that generates 3 random numbers between 0
         * and 100 (0 and 100 are included) and find if all numbers are more
         * than 25
         * Print true if all numbers are greater than 25
         * Print false if any of the number is less than or equal to 25
         */

        int rand1 = (int) (Math.random() * (100 + 1));
        int rand2 = (int) (Math.random() * (100 + 1));
        int rand3 = (int) (Math.random() * (100 + 1));

        boolean greater = rand1 > 2 && rand2 > 25 && rand3 > 25;

        System.out.println("The three random numbers were: " +rand1+ "," +rand2+ "," + rand3);
        System.out.println("All greater than 25?");

        if(greater) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void task_13() {
        /**
         * Requirement:
         * Write a Java program to ask user to enter a number between 1 to 7 (1
         * and 7 are included)
         * Print the day of the week according to given number. First day is
         * MONDAY and last day is SUNDAY
         *
         * Test data 1:
         * Input number: 3
         * Expected Output:
         * The number entered returns WEDNESDAY
         *
         * Test data 2:
         * Input number: 5
         * Expected Output:
         * The number entered returns FRIDAY
         */

        Scanner scanner = new Scanner(System.in);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Please enter a number:");
        System.out.println("The number entered returns " +weekDays[scanner.nextInt()-1]);
    }

    public static void task_14() {
        /**
         * Jennifer is taking a math course . This math course requires students
         * to take 3 exams. At the end, if the average of those exams is more
         * than or equal to 70, then Jennifer will pass the course. However, if
         * the average of those 3 exams is less than 70, then Jennifer will fail.
         *
         * Requirement:
         * Write a Java program that asks Jennifer to enter her exam results and
         * print if she passed or failed for the exam.
         *
         * Example Program 1:
         * Program: Tell me your exam
         * results?
         * User: 20 50 85
         * Program: YOU FAILED!
         *
         * Example Program 2:
         * Program: Tell me your exam
         * results?
         * User: 65 80 90
         * Program: YOU PASSED!
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the results of your exams:");
        String[] examResults = scanner.nextLine().split(" ");

        int exam1 = Integer.parseInt(examResults[0]);
        int exam2 = Integer.parseInt(examResults[1]);
        int exam3 = Integer.parseInt(examResults[2]);

        int average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70) {
            System.out.println("YOU PASSED!");
        } else {
            System.out.println("YOU FAILED!");
        }
    }

    public static void task_15() {
        /**
         * Requirement:
         * Write a Java program that asks user to enter 3 numbers
         * -If all numbers are different, then print “NO MATCH”
         * -If any of those 2 numbers are equal, then print “DOUBLE MATCH”
         * -If all 3 numbers are equal, then print “TRIPLE MATCH”
         *
         * Example Program 1:
         * Program: Enter 3 numbers
         * User: 3 3 3
         * Program: TRIPLE MATCH
         *
         * Example Program 2:
         * Program: Enter 3 numbers
         * User: 5 4 5
         * Program: DOUBLE MATCH
         *
         * Example Program 3:
         * Program: Enter 3 numbers
         * User: 2 5 7
         * Program: NO MATCH
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers:");
        String[] numbers = scanner.nextLine().split(" ");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        int num3 = Integer.parseInt(numbers[2]);

        if(num1 == num2 && num2 == num3) {
            System.out.println("TRIPLE MATCH");
        } else if(num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("DOUBLE MATCH");
        } else {
            System.out.println("NO MATCH");
        }
    }
}
