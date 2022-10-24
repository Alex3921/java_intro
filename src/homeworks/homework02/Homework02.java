package homeworks.homework02;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
//        System.out.println("\n------------------------Task 01------------------------\n");
//        task_01();
//
//        System.out.println("\n------------------------Task 02------------------------\n");
//        task_02();
//
//        System.out.println("\n------------------------Task 03------------------------\n");
//        task_03();
//
//        System.out.println("\n------------------------Task 04------------------------\n");
//        task_04();
//
//        System.out.println("\n------------------------Task 05------------------------\n");
//        task_05();
//
//        System.out.println("\n------------------------Task 06------------------------\n");
//        task_06();
//
//        System.out.println("\n------------------------Task 07------------------------\n");
//        task_07();
//
//        System.out.println("\n------------------------Task 08------------------------\n");
//        task_08();
//
//        System.out.println("\n------------------------Task 09------------------------\n");
//        task_09();

//        System.out.println("\n------------------------Task 10------------------------\n");
//        task_10();

        System.out.println("\n------------------------Task 11------------------------\n");
        task_11();
    }

    public static void task_01() {
        /**
         * Requirement
         * -Write a Java program that asks user to enter 2 numbers as int inputs
         * and print the sum of the numbers.
         * -First, print the numbers entered by user with proper messages as
         * shown below
         * -And, then print the sum of the given numbers by user with a proper
         * message as shown below
         *
         * Test Data:
         * 5
         * 10
         *
         * Expected output:
         * The number 1 entered by user is = 5
         * The number 2 entered by user is = 10
         * The sum of number 1 and 2 entered by user is = 15
         *
         */

        Scanner scanner = new Scanner(System.in);

        int first, second;
        String fNum, sNum, output;

        System.out.println("Let's add 2 numbers!");
        System.out.println("Please enter first number: ");
        first = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter second number: ");
        second = scanner.nextInt();

        fNum = "The number 1 entered by user is = " + first;
        sNum = "The number 2 entered by user is = " + second;
        output = "The sum of number 1 and 2 entered by user is = " + (first + second);

        System.out.println(fNum + "\n" + sNum + "\n" + output);
    }

    public static void task_02() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter 2 numbers as int inputs
         * and print the product of the numbers.
         *
         * Test Data:
         * 3
         * 5
         *
         * Expected Output:
         * The product of the given 2 numbers is: 15
         */

        Scanner scanner = new Scanner(System.in);

        int first, second;
        String output;

        System.out.println("Let's multiply 2 numbers!");
        System.out.println("Please enter first number: ");
        first = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter second number: ");
        second = scanner.nextInt();

        output = "The product of the given 2 numbers is: " + (first * second);

        System.out.println(output);
    }

    public static void task_03() {
        /**
         * Requirement
         * -Write a Java program that asks user to enter 2 floating numbers as
         * double inputs and print the sum (addition), multiplication,
         * subtraction, division and remainder of these numbers.
         *
         * Test Data:
         * 24
         * 10
         *
         * Expected Output:
         * The sum of the given numbers is = 34.0
         * The product of the given numbers is = 240.0
         * The subtraction of the given numbers is = 14.0
         * The division of the given numbers is = 2.4
         * The remainder of the given numbers is = 4.0
         */

        Scanner scanner = new Scanner(System.in);

        double first, second;
        String sum, product, subtraction, division, remainder;

        System.out.println("Please enter first floating point number: ");
        first = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Please enter second floating point number: ");
        second = scanner.nextDouble();

        sum = "The sum of the given numbers is = " + (first + second);
        product = "The product of the given numbers is = " + (first * second);
        subtraction = "The subtraction of the given numbers is = " + (first - second);
        division = "The division of the given numbers is = " + (first / second);
        remainder = "The remainder of the given numbers is = " + (first % second);

        System.out.println(sum + "\n" + product + "\n" + subtraction + "\n" + division + "\n" + remainder);
    }

    public static void task_04() {
        /**
         * Requirement:
         * -Write a Java program to print the result of the following operations
         * NOTE: No need for using Scanner for this task
         *
         * Test Data:
         * 1.  -10 + 7 * 5
         * 2.  (72+24) % 24
         * 3.  10 + -3*9 / 9
         * 4.  5 + 18 / 3 * 3 – (6 % 3)
         *
         * Expected Output:
         * 1. 25
         * 2.  0
         * 3.  7
         * 4.  23
         */

        // Test Data
        String first, second, third, fourth;

        first = "1. -10 + 7 * 5";
        second = "2. (72+24) % 24";
        third = "3. 10 + -3*9 / 9";
        fourth = "4. 5 + 18 / 3 * 3 – (6 % 3)";

        System.out.println("Test Data:");
        System.out.println(first + "\n" + second + "\n" + third + "\n" + fourth + "\n");

        // Output
        System.out.println("Output:");

        first = "1. " + (-10 + 7 * 5);
        second = "2. " + ((72+24) % 24);
        third = "3. " + (10 + -3*9 / 9);
        fourth = "4. " + (5 + 18 / 3 * 3 - (6 % 3));

        System.out.println(first + "\n" + second  + "\n" + third + "\n" + fourth);
    }

    public static void task_05() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter 2 numbers as int inputs
         * and print the average of the numbers.
         *
         * Test Data:
         * 7
         * 11
         *
         * Expected Output:
         * The average of the given numbers is: 9
         */

        Scanner scanner = new Scanner(System.in);

        int first, second, average;

        System.out.println("Let's find the average of two numbers!" + "\n");
        System.out.println("Please enter the first number:");
        first = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the second number:");
        second = scanner.nextInt();

        average = (first + second) / 2;

        System.out.println("The average of the given numbers is: " + average);
    }

    public static void task_06() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter 5 numbers as int inputs
         * and print the average of numbers.
         *
         * Test Data:
         * 6
         * 10
         * 12
         * 15
         * 17
         *
         * Expected Output:
         * The average of the given numbers is: 12
         */

        Scanner scanner = new Scanner(System.in);

        int first, second, third, num4, num5, average;

        System.out.println("Let's find the average of five numbers!" + "\n");
        System.out.println("Please enter the first number:");
        first = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the second number:");
        second = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the third number:");
        third = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the fourth number:");
        num4 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the fifth number:");
        num5 = scanner.nextInt();

        average = (first + second + third + num4 + num5) / 5;

        System.out.println("The average of the given numbers is: " + average);
    }

    public static void task_07() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter 3 numbers as int inputs
         * and print the square of each number entered by user.
         * NOTE: Square of number means number multiplied with itself
         *
         * Test Data:
         * 5
         * 6
         * 10
         *
         * Expected Output:
         * The 5 multiplied with 5 is = 25
         * The 6 multiplied with 6 is = 36
         * The 10 multiplied with 10 is = 100
         */

        Scanner scanner = new Scanner(System.in);

        int first, second, third;
        String firstSq, secondSq, thirdSq;

        System.out.println("Let's find the square of three numbers!" + "\n");
        System.out.println("Please enter the first number:");
        first = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the second number:");
        second = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the third number:");
        third = scanner.nextInt();

        firstSq = "The " +first+ " multiplied with " +first+ " is = " + first * first;
        secondSq = "The " +second+ " multiplied with " +second+ " is = " + second * second;
        thirdSq = "The " +third+ " multiplied with " +third+ " is = " + third * third;

        System.out.println(firstSq + "\n" + secondSq + "\n" + thirdSq);
    }

    public static void task_08() {
        /**
         * Requirement:
         * -Write a Java program that asks user to enter the side of a square as
         * input and print square’s perimeter and area
         * NOTE: area of a square = side * side
         *             perimeter of a square = 4 * side
         *
         * Test Data:
         * 7
         *
         * Expected Output:
         * Perimeter of the square = 28
         * Area of the square = 49
         */

        Scanner scanner = new Scanner(System.in);

        int squareSide;
        String squarePerimeter, squareArea;

        System.out.println("Please enter the side of a square:");
        squareSide = scanner.nextInt();

        squarePerimeter = "Perimeter of the square = " + (4 * squareSide);
        squareArea = "Area of the square = " + (squareSide * squareSide);

        System.out.println(squarePerimeter + "\n" + squareArea);
    }

    public static void task_09() {
        /**
         * Requirement:
         * Assume that an average annual rate of salary for a Software Engineer
         * in Test is $90k.
         * Write a Java program to find how much money can a Software
         * Engineer in Test earn in 3 years?
         *
         * NOTE: No need for using Scanner for this task_. (Please hard code
         * values. Print result with a proper message as below
         *
         * Expected Output:
         * A Software Engineer in Test can earn $270000.0  in 3 years.
         */

        double averageEngineerSalary = 90_000;
        int numberOfYears = 3;
        double totalSalary = averageEngineerSalary * numberOfYears;

        System.out.println(String.format("A Software Engineer in Test can earn %s in %s years.",
                totalSalary, numberOfYears));
    }

    public static void task_10() {
        /**
         * Requirement
         * -Write a program that asks user their favorite book, color, and
         * number in separate statements.
         * -Store those data in proper data types
         * -And, then print given data by user ONLY in one print statement but
         * it should be in 3 separate lines as below
         * -Assume user enters below info
         * favBook = Java 101
         * favColor = Blue
         * favNumber = 7
         *
         * Expected output:
         * User’s favorite book is: Java 101
         * User’s favorite color is: Blue
         * User’s favorite number is: 7
         */

        Scanner scanner = new Scanner(System.in);

        String favoriteBook, favoriteColor, favoriteNumber;

        System.out.println("What is your favorite book?");
        favoriteBook = "User’s favorite book is: " + scanner.nextLine();

        System.out.println("What is your favorite color?");
        favoriteColor = "User’s favorite color is: " + scanner.next();

        scanner.nextLine();

        System.out.println("What is your favorite number?");
        favoriteNumber = "User’s favorite number is: " + scanner.nextInt();

        System.out.println(favoriteBook + "\n" + favoriteColor + "\n" + favoriteNumber);
    }

    public static void task_11() {
        /**
         * Requirement
         * -Write a program that asks user to enter their first name, last name, age, email
         * address, phone number, and address in separate statements.
         * -Store these data given from user in proper data types
         * -And, then print the data provided by user as below example
         *
         * NOTE: User will be asked by using Scanner
         * -Assume user enters below info
         * firstName = John
         * lastName = Doe
         * age = 45
         * emailAddress = johndoe@gmail.com
         * phoneNumber = (123) 123 1234
         * address = 123 St Chicago IL 12345
         *
         * Expected output: (it should exactly be same as below paragraph)
         *           User who joined this program is John Doe. John’s age is 45. John’s email
         * address is johndoe@gmail.com, phone number is (123) 123 1234, and address
         * is 123 St Chicago IL 12345.
         */

        Scanner scanner = new Scanner(System.in);

        String fName, lName, email, phone, address;
        String fullName, output;
        int age;

        System.out.println("Please enter your first name:");
        fName = scanner.next();

        scanner.nextLine();

        System.out.println("Please enter your last name:");
        lName = scanner.next();

        scanner.nextLine();

        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter your email address:");
        email = scanner.next();

        scanner.nextLine();

        System.out.println("Please enter your phone number:");
        phone = scanner.nextLine();

        System.out.println("Please enter your home address:");
        address = scanner.nextLine();

        fullName = fName+ " " +lName;
        output = String.format(
                "User who joined this program is %s. %s’s age is %s. %s’s email \n" +
                        "address is %s, phone number is %s, and address \n" +
                        "is %s.",
                fullName, fName, age, fName, email, phone, address);

        System.out.println(output);
    }
}
