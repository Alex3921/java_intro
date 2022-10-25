package projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project03 {
    public static void main(String[] args){
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
    }

    public static void task_01() {
        /**
         * -Assume that you are given below Strings
         * String s1 = “24”, s2 = “5”;
         * -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
         * The sum of 24 and 5 = 29
         * The subtraction of 24 and 5 = 19
         * The division of 24 and 5 = 4.8
         * The multiplication of 24 and 5  = 120
         * The remainder of 24 and 5 = 4
         */

        String s1 = "24", s2 = "5";

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        int subtraction = Integer.parseInt(s1) - Integer.parseInt(s2);
        double division = (double) Integer.parseInt(s1) / Integer.parseInt(s2);
        int multiplication = Integer.parseInt(s1) * Integer.parseInt(s2);
        int remainder = Integer.parseInt(s1) % Integer.parseInt(s2);

        System.out.println("The sum of 24 and 5 is = " + sum);
        System.out.println("The Subtraction of  24 and 5 is = " + subtraction);
        System.out.println("The division of 24 and 5 is = " + division);
        System.out.println("The multiplication of 24 and 5 is = " + multiplication);
        System.out.println("The remainder of 24 and 5 is = " + remainder);
    }

    static boolean isPrime(int n) {

        // If a number is less than or equal to 1 it can't be prime
        if (n <= 1)
            return false;

        // Check for the only positive number that is prime
        else if (n == 2)
            return true;

        // An even number can't be prime
        else if (n % 2 == 0)
            return false;

        // If an odd number can be factored into two factors a * b, then it is not a prime number;
        // At least one of the factors has to be less than the sqrt of the number;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }

        // If we haven't found a factor for the number in the previous step
        // we can conclude that we've found a prime;
        return true;
    }
    public static void task_02() {
        /**
         * -Write a program that generates a random number between 1 to 35 (1 and 35 are included)
         * -Find if the given number is a Prime Number
         * -If random number generated is a prime one, then print “THE NUMBER IS A PRIME NUMBER”.
         * -Otherwise, print “THE NUMBER IS NOT A PRIME NUMBER”
         *
         * Prim number is a number that can be divided only by itself and 1. It cannot be divided by any other
         * number. The smallest prime number is 2 and 2 is the only even prime number.
         * So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
         *
         * Test data 1:
         * Random number = 11
         * Expected result 1:
         * 11 IS A PRIME NUMBER
         *
         * Test data 2:
         * Random number = 15
         * Expected result 2:
         */

        int random = (int) (Math.random() * 35) + 1;

        // Using switch statement
        System.out.println("-> Found using a switch statement:");
        switch(random) {
            case(2):
            case(3):
            case(5):
            case(7):
            case(11):
            case(13):
            case(17):
            case(19):
            case(23):
            case(29):
            case(31):
                System.out.println(random+ " IS A PRIME NUMBER");
            default:
                System.out.println(random+ " IS NOT A PRIME NUMBER");

        }


        // Using a helper method
        System.out.println("-> Found using a helper method:");
        boolean isPrime = isPrime(random);

        if(isPrime) {
            System.out.println(random+ " IS A PRIME NUMBER");
        } else {
            System.out.println(random+ " IS NOT A PRIME NUMBER");
        }
    }

    public static void task_03() {
        /**
         * -Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are included)
         * -Find and print each number in an ascending order
         * -Ascending order is ordering from lowest to greatest
         *
         * NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this task.
         *
         * Test data: Assume below numbers are generated
         * Random number 1 = 43
         * Random number 2 = 7
         * Random number 3 = 30
         *
         * Expected result:
         * Lowest number is = 7
         * Middle number is = 30
         * Greatest number is = 43
         */

        Random random = new Random();

        int random1 = random.nextInt(50) + 1;
        int random2 = random.nextInt(50) + 1;
        int random3 = random.nextInt(50) + 1;

        int smallest = Math.min(random1, Math.min(random2, random3));
        int greatest = Math.max(random1, Math.max(random2, random3));
        int middle = (random1 + random2 + random3) - (smallest + greatest);

        System.out.println("Lowest number is = " +smallest);
        System.out.println("Middle number is = " +middle);
        System.out.println("Greatest number is = " +greatest);
    }

    public static void task_04() {
        /**
         * -Assume you are given a single character. (It will be hard-coded)
         * -First, check if given char is a letter but not digit or special character.
         * -If the given char is not a letter, then print “Invalid character detected!!!”.
         * -If it is a letter, then find out if it is an uppercase or a lowercase letter.
         * -If the letter is uppercase, then print “The letter is uppercase”, else print “The letter is lowercase”.
         *
         * NOTE: You need to use ASCII table and casting for this task
         *
         * Test data 1: Assume you are given 5
         * char c = ‘5’;
         * Expected result 1:
         * Invalid character detected!!!
         *
         * Test data 2: Assume you are given a
         * char c = ‘a’;
         * Expected result 2:
         * The letter is lowercase
         *
         * Test data 3: Assume you are given R
         * char c = ‘R’;
         * Expected result 3:
         * The letter is uppercase
         */

        char[] characters = {'a', 'A', '5'};

        for (char character : characters) {
            if (character >= 65 && character <= 122) {
                if (character <= 90) {
                    System.out.println("The letter is uppercase!");
                } else {
                    System.out.println("The letter is lowercase!");
                }
            } else {
                System.out.println("Invalid character detected!!!");
            }
        }
    }

    public static void task_05() {
        /**
         * -Assume you are given a single character. (It will be hard-coded)
         * -First, check if given char is a letter but not digit or special character.
         * -If it is not a letter, then print “Invalid character detected!!!”.
         * -If it is a letter, then find out whether it is a vowel or a consonant.
         * -If the letter is vowel, then print “The letter is vowel”, else print “The letter is consonant”.
         * -Vowel letters: a, e, i o, u, A, E, I, O, U
         * NOTE: You need to use ASCII table and casting for this example
         *
         * Test data 1: Assume you are given #
         * char c = ‘#’;
         * Expected result 1:
         * Invalid character detected!!!
         *
         * Test data 2: Assume you are given E
         * char c = ‘e’;
         * Expected result 2:
         * The letter is vowel
         *
         * Test data 3: Assume you are given R
         * char c = ‘R’;
         * Expected result 3:
         * The letter is  consonant
         */

        char[] characters = {'#', 'e', 'R'};

        for (int character : characters) {
            if (character >= 65 && character <= 122) {
                switch (character) {
                    case(97):
                    case(101):
                    case(105):
                    case(111):
                    case(117):
                        System.out.println("The letter is a vowel!");
                        break;
                    default:
                        System.out.println("The letter is consonant!");
                }
            } else {
                System.out.println("Invalid character detected!!!");
            }
        }
    }

    public static void task_06() {
        /**
         * -Assume you are given a single character. (It will be hard-coded)
         * -First, check if the given char is a special character but not a digit or not a letter.
         * -If it is not a special character, then print “Invalid character detected!!!”.
         * -If it is a special character, then print “Special character is = {givenCharacter}”.
         *
         * NOTE: You need to use ASCII table and casting for this example
         *
         * Test data 1: Assume you are given 8
         * char c = ‘8’;
         * Expected result 1:
         * Invalid character detected!!!
         *
         * Test data 2: Assume you are given *
         * char c = ‘*’;
         * Expected result 2:
         * Special character is = *
         */

        char[] characters = {'8', '*'};

        for (int character : characters) {
            if (character >= 48 && character <= 57 || character >= 65 && character <= 122) {
                System.out.println("Invalid character detected!!!");
            } else {
                System.out.println("Special character is = " +(char) character);
            }
        }
    }

    public static void task_07() {
        /**
         * -Assume you are given a single character. (It will be hard-coded)
         * -If given char is a letter, then print “Character is a letter”
         * -If given char is a digit, then print “Character is a digit”
         * -Otherwise, print “Character is a special character”
         *
         * Test data 1: Assume you are given g
         * char c = ‘g’;
         * Expected result 1:
         * Character is a letter
         *
         * Test data 2: Assume you are given 5
         * char c = ‘5’;
         * Expected result 2:
         * Character is a digit
         *
         * Test data 3: Assume you are given 5
         * char c = ‘@’;
         * Expected result 3:
         * Character is a special character
         */

        char[] characters = {'g', '5', '@'};

        for (int character : characters) {
            if (character >= 65 && character <= 122) {
                System.out.println("Character is a letter");
            } else if(character >= 48 && character <= 57) {
                System.out.println("Character is a digit");
            } else {
                System.out.println("Character is a special character");
            }
        }
    }
}
