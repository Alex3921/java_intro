package homeworks;
import java.util.Scanner;

import static com.sun.org.apache.xpath.internal.compiler.Token.contains;


public class Homework04 {
    public static void main(String[] args) {
        System.out.println("\n------------------------Task 01------------------------\n");
        task_01();

        System.out.println("\n------------------------Task 02------------------------\n");
        task_02();

        System.out.println("\n------------------------Task 03------------------------\n");
        task_03();

        System.out.println("\n------------------------Task 04------------------------\n");
        task_04();
    }

    public static <string> void task_01() {
        /**
         * Write a program that asks user to enter their names
         * 1. Print out the length of name
         * 2. Find the first character in the name and print it
         * 3. Find the last character in the name and print it
         * 4. Find the first 3 characters in the name and print them
         * 5. Find the last 3 characters in the name and print them
         * 6.      Check if name starts with character A (or a) or not and print messages below
         * If name starts with A or a, print “You are in the club!”
         * If name does not start with A or a, print “Sorry, you are not in the club”
         *
         * Test Data:
         * David
         * Expected Output:
         * The length of the name is = 5
         * The first character in the name is = D
         * The last character in the name is = d
         * The first 3 characters in the name are = Dav
         * The last 3 characters in the name are = vid
         * Sorry, you are not in the club
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        int nameLength = name.length();
        char firstCharacter = name.charAt(0);
        char lastCharacter = name.charAt(nameLength - 1);
        String firstThreeCharacters = name.substring(0,3);
        String lastThreeCharacters = name.substring(nameLength - 3);
        boolean nameStartsWithA = name.toLowerCase().startsWith("a");

        System.out.println("Name length: " +name.length());
        System.out.println("Find inside name:");
        System.out.println("\t-> first character: " +firstCharacter);
        System.out.println("\t-> last character: " +lastCharacter);
        System.out.println("\t-> first three characters: " +firstThreeCharacters);
        System.out.println("\t-> last three characters: " +lastThreeCharacters);
        if(nameStartsWithA) {
            System.out.println("You are in the club!");
        } else {
            System.out.println("Sorry, you are not in the club!");
        }
    }

    public static void task_02() {
        /**
         * Requirement:
         * Write a program that asks user to enter their full address
         * Check if city is Chicago (ignore cases) in the address
         * If city is Chicago, then print “You are in the club”
         * If city is Des Plaines, then print “You are welcome to join to the club”
         * If city is any other city, then print “Sorry, you will never be in the club”
         *
         * Test Data 1:
         * 2860 S River Rd, Des Plaines, IL 60018
         * Expected Output 1:
         * You are welcome to join the club
         *
         * Test Data 2:
         * 3535 Abc St, Chicago, IL 12345
         * Expected Output 2:
         * You are in the club
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full address:");
        String address = scanner.nextLine().toLowerCase();

        if(address.contains("chicago")) {
            System.out.println("You are in the club!");
        } else if(address.contains("des plaines")) {
            System.out.println("You are welcome to join to the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }
    }

    public static void task_03() {
        /**
         * Requirement:
         * Write a program that asks user to enter their fav colors, at least 4 colors
         * Check If those colors contains “red” and “green”
         * If “green” is listed in favorite colors, then print “Green is in the list”
         * If “red” is listed in favorite colors, then print “Red is in the list”
         * If both “green” and “red” are listed in favorite colors, then print “Green and red
         * are in the list”
         * If both “green” and “red” are not listed in favorite colors, then print “Green and
         * red are not in the list”
         *
         * Test Data 1:
         * blue, purple, yellow, gray, brown
         * Expected Output 1:
         * Green and red are not in the list
         *
         * Test Data 2:
         * Green, RED, blue, piNK
         * Expected Output 2:
         * Green and red are in the list
         *
         * Test Data 3:
         * GREen, orange, YELLOW, pink
         * Expected Output 3:
         * Green is in the list
         *
         * Test Data 4:
         * Yellow, REd, bluE, pink, black
         * Expected Output 4:
         * Red is in the list
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter four colors:");
        String fourColorList = scanner.nextLine().toLowerCase();

        boolean listHasRed = fourColorList.contains("red");
        boolean listHasGreen = fourColorList.contains("green");

        if(listHasRed && listHasGreen) {
            System.out.println("Green and red are in the list");
        } else if(listHasRed) {
            System.out.println("Red is in the list");
        } else if(listHasGreen) {
            System.out.println("Green is in the list");
        } else {
            System.out.println("Green and red are not in the list");
        }
    }

    public static void task_04() {
        /**
         * Requirement:
         * Assume that you are given below String
         * String str = “   Java is FUN   ”;
         * Create 3 new Strings and assign each word from str to those new Strings
         * Finally print the results as below
         *
         * Expected output:
         * The first word in the str is = java
         * The second word in the str is = is
         * The third word in the str is = fun
         *
         * NOTES:
         * Make sure that you eliminate white spaces at the beginning and at the end of
         * words in the str.
         * Make sure that you converted all words to be in lower case in your results
         */

        String givenString = "   Java is FUN   ".trim().toLowerCase();

        String firstWord = givenString.substring(0, givenString.indexOf(" "));
        String secondWord = givenString.substring(givenString.indexOf(" ") + 1, givenString.lastIndexOf(" "));
        String thirdWord = givenString.substring(givenString.lastIndexOf(" ") + 1);

        System.out.println("The first word in the str is = " +firstWord);
        System.out.println("The second word in the str is = " +secondWord);
        System.out.println("The third word in the str is = " +thirdWord);
    }
}
