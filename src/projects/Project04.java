package projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
//        System.out.println("\n------------------------Task 01------------------------\n");
//        task_01();

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
//
//        System.out.println("\n------------------------Task 10------------------------\n");
//        task_10();
//
        System.out.println("\n------------------------Task 10------------------------\n");
        task_11();
    }

    public static void task_01() {
        /**
         * Write a program that asks user to enter a String, and swaps first and last 4 characters of this
         * String and print the modified String
         *
         * Test data:
         * TechGlobal
         * Expected output:
         * obalGlTech
         *
         * NOTE: Write a program that handles any String
         * NOTE: First check if the length of String is at least 8, if the String’s length is less than 8, then
         * print message “This String does not have 8 characters”
         */
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            if(userInput.length() == 0) {
                System.out.println("Please enter a String");
            } else {
                System.out.println("This String does not have 8 characters!\n");
                System.out.println("Please enter another String");
            }
            userInput = scanner.nextLine();
        } while (userInput.length() < 8);

        String firstFour = userInput.substring(0,4);
        String lastFour = userInput.substring(userInput.length()-4);

        System.out.println(lastFour + userInput.substring(4,userInput.length()-4) + firstFour);
    }
    public static void task_02() {
        /**
         * Write a program that asks user to enter a sentence, and swaps first and last words of this
         * sentence and print the modified sentence
         *
         * Test data:
         * Selenium is an automation tool
         * Expected output:
         * tool is an automation Selenium
         *
         * NOTE: Write a program that handles any sentence
         * NOTE: First check if the sentence has at least 2 words, if the sentence has only one or no word,
         * then print message “This sentence does not have 2 or more words to swap”
         */
        Scanner scanner = new Scanner(System.in);
        String[] userInput = {};

        do{
            if(userInput.length == 0) {
                System.out.println("Please enter a sentence:");
            } else {
                System.out.println("This sentence does not have 2 or more words to swap.\n");
                System.out.println("Please enter another sentence:");
            }
            userInput = scanner.nextLine().split(" ");

        } while(userInput.length < 2);

       String firstWord = userInput[0];
       String lastWord = userInput[userInput.length - 1];
       String joined = String.join(" ", Arrays.copyOfRange(userInput, 1, userInput.length-1));

        System.out.println(lastWord + " " + joined + " " + firstWord);
    }

    public static void task_03() {
        /**
         * Assume that you are given some Strings as below, and you want to replace bad words with
         * good words.
         * String str1 = “These books are so stupid”;
         * String str2 = “I like idiot behaviors”;
         * String str3 = “I had some stupid t-shirts in the past and also some idiot look shoes”;
         * Write a Java program that checks any given String and replace bad words like “stupid” and
         * “idiot” with “nice” keyword
         *
         * Expected output:
         * These books are so nice
         * I like nice behaviors
         * I had some nice t-shirts in the past and also some nice look shoes
         * NOTE: Write a program that handles any String
         */

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        String firstBadWord = "stupid";
        String secondBadWord = "idiot";
        String niceWord = "nice";

        String[] testSentence = {str1, str2, str3};
        String[] formattedSentence = new String[3];

        for(int i = 0; i < testSentence.length; i++) {
            String currentSentence = testSentence[i];
            boolean containsFirstBadWord = currentSentence.toLowerCase().contains(firstBadWord);
            boolean containsSecondBadWord = currentSentence.toLowerCase().contains(secondBadWord);

            if(containsFirstBadWord || containsSecondBadWord) {
                if(containsFirstBadWord) {
                    currentSentence = currentSentence.replace(firstBadWord, niceWord);
                }
                if(containsSecondBadWord) {
                    currentSentence = currentSentence.replace(secondBadWord, niceWord);
                }
            }
            formattedSentence[i] = currentSentence;
        }

        for(String sentence : formattedSentence) {
            System.out.println(sentence);
        }
    }

    public static void task_04() {
        /**
         * Write a program that asks user to enter their name.
         * First check if length of name is more than 2 and is even or odd
         * If length of name is less than 2, then print “Invalid input!!!”
         * If length of name is odd, then print middle character from the name
         * If length of name is even, then print middle 2 characters from the name
         *
         * Test data:
         * J
         * Expected output:
         * Invalid input!!!
         *
         * Test data:
         * Lionel
         * Expected output:
         * on
         *
         * Test data:
         * James
         * Expected output:
         * m
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        if(userName.length() < 2) {
            System.out.println("Invalid input!!!");
        }else if(userName.length() % 2 == 0) {
            System.out.println(userName.substring(userName.length()/2 - 1, userName.length()/2+1));
        } else {
            System.out.println(userName.charAt(userName.length()/2));
        }
    }

    public static void task_05() {
        /**
         * Write a program that asks user to enter a country.
         * First check if length of country is more than 5. If not, then print “Invalid input!!!”
         * If length of country is more than 5, then print country name without first 2 and last 2 characters
         *
         * Test data:
         * Peru
         * Expected output:
         * Invalid input!!!
         *
         * Test data:
         * Brazil
         * Expected output:
         * az
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of a country:");
        String country = scanner.nextLine();

        if(country.length() <= 5) {
            System.out.println("Invalid input!!!");
        } else {
            System.out.println(country.substring(2, country.length() - 2));
        }
    }

    public static void task_06() {
        /**
         * Write a program that asks user to enter their full address.
         * Replace all letter ‘a’ or ‘A’ with ‘*’
         * Replace all letter ‘e’ or ‘E’ with ‘#’
         * Replace all letter ‘i’ or ‘I’ with ‘+’
         * Replace all letter ‘u’ or ‘U’ with ‘$’
         * Replace all letter ‘o’ or ‘O’ with ‘@’
         * Then, print result after replacements
         *
         * Test data:
         * 2860 S River Rd Suite 350, Des Plaines IL 60018
         * Expected output:
         * 2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full address:");
        String userInput = scanner.nextLine();

        int counter = 0;
        StringBuilder output = new StringBuilder();

        while(counter < userInput.length()) {
            char character = userInput.charAt(counter);
            if(character == 'a' || character == 'A') {
                output.append('*');
            } else if(character == 'e' || character == 'E') {
                output.append('#');
            } else if(character == 'i' || character == 'I') {
                output.append('+');
            } else if(character == 'o' || character == 'O') {
                output.append('@');
            } else if(character == 'u' || character == 'U') {
                output.append('$');
            } else {
                output.append(character);
            }
            counter++;
        }

        System.out.println("E: 2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018");
        System.out.println("R: " + output);
    }

    public static void task_07() {
        /**
         * Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included),
         * Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending
         * order.
         *
         * Test data:
         * int randomNumber1 = 12;
         * int randomNumber1 = 4;
         *
         * Expected output:
         * 4 – 6 – 7 – 8 – 9 – 11 – 12
         */
        int rand1 = new Random().nextInt(25);
        int rand2 = new Random().nextInt(25);

        String output = "";
        for (int i = Math.min(rand1, rand2); i <= Math.max(rand1, rand2); i++) {
            if (i % 5 != 0) output += i + " - ";
        }

        if (output.endsWith(" - ")) output = output.substring(0, output.lastIndexOf(" - "));
        if(output.length() == 0) output = "No available numbers!";

        System.out.println("First random number is: " + rand1);
        System.out.println("Second random number is: " + rand2);
        System.out.println(output);
    }

    public static void task_08() {
        /**
         * Write a program that asks user to enter a sentence as a String, and count how many words that
         * sentence has, and print it with given below message.
         * NOTE: Write a program that handles any String
         * NOTE: First check if the given sentence has 2 words at least. If not, then just print “This
         * sentence does not have multiple words”.
         *
         * Test data 1:
         * Java is fun
         * Expected output 1:
         * This sentence has 3 words.
         *
         * Test data 2:
         * Hello World
         * Expected output 2:
         * This sentence has 2 words.
         *
         * Test data 3:
         * Hi
         * Expected output 3:
         * This sentence does not have multiple words.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String[] userInput = {};

        do{
            if(userInput.length != 0) {
                System.out.println("This sentence does not have multiple words.\n");
                System.out.println("Please enter another sentence:");
            }
            userInput = scanner.nextLine().split(" ");
        }while(userInput.length < 2);

        System.out.println(String.format("This sentence has %s words.", userInput.length));
    }
    public static void task_09() {
        /**
         * Write a program that asks user to enter a positive number.
         * Print all the number starting from 1 to given number. But, print “Foo” for the numbers divided
         * by 2, “Bar” for the numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.
         *
         * Test data:
         * 6
         * Expected output:
         * 1
         * Foo
         * Bar
         * Foo
         * 5
         * FooBar
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int userInput = scanner.nextInt();

        for(int i = 1; i <= userInput; i++) {
            if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("FooBar");
            } else if(i % 2 == 0) {
                System.out.println("Foo");
            } else if(i % 3 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void task_10() {
        /**
         * Write a program that asks user to enter a word, and check if it is palindrome or not.
         * Palindrome: It is a word that is read the same backward as forward
         * • EX/ kayak, civic, madam
         * NOTE: Write a program that handles any String
         * NOTE: First check if the given String has at least 1 character, if the String does not have at least
         * one character, then print message “This word does not have 1 or more characters”
         *
         * Test data 1:
         * T
         * Expected output 1:
         * This word is palindrome
         *
         * Test data 2:
         * civic
         * Expected output 2:
         * This word is palindrome
         *
         * Test data 3:
         * Madam
         * Expected output 3:
         * This word is not palindrome
         *
         * Test data 4:
         * Hello
         * Expected output 4:
         * This word is not palindrome
         *
         * Test data 5:
         * Expected output 5:
         * This word does not have 1 or more characters
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String userInput = scanner.nextLine();

        if(userInput.isEmpty()) {
            System.out.println("This word does not have 1 or more characters!");
        }

        int front = 0;
        int back = userInput.length()-1;

        while(front < back) {
            if(userInput.charAt(front) != userInput.charAt(back)) {
                break;
            }
            front++;
            back--;
        }

        if(userInput.length() > 0) {
            if (back - front > 1) {
                System.out.println("This word is not palindrome.");
            } else {
                System.out.println("This word is a palindrome.");
            }
        }
    }

    public static void task_11() {
        /**
         * Write a program that asks user to enter a sentence as a String and count how many a or A
         * letters that sentence has and print it with given below message.
         * NOTE: Write a program that handles any String
         * NOTE: First check if the given sentence has 1 character at least. If not, then just print “This
         * sentence does not have any characters”.
         *
         * Test data 1:
         * Expected output 1:
         * This sentence does not have any characters.
         *
         * Test data 2:
         * Apple is one of the largest IT companies.
         * Expected output 2:
         * This sentence has 3 a or A letters.
         *
         * Test data 3:
         * I like banana and pineapple.
         * Expected output 3:
         * This sentence has 5 a or A letters.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String userInput = scanner.nextLine();
        int totalCount = 0;

        if(userInput.length() > 0) {
            for(int i = 0; i < userInput.length(); i++) {
                if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'A') totalCount++;
            }
        } else {
            System.out.println("This sentence does not have any characters");
        }

        System.out.println(String.format("This sentence has %s a or A letters.", totalCount));
    }
}
