package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {
//        Requirement:
//        -Create a method called fizzBuzz1()
//                -This method will take an int argument, and it will print
//        numbers starting from 1 to given argument. BUT, it will print
//        “Fizz” for the numbers divided by 3, “Buzz” for the numbers
//        divided by 5, and “FizzBuzz” for the numbers divided both by 3
//        and 5.
//        Test Data 1: 3
//Expected Result 1:
//1
//2
//Fizz
//Test Data 2: 5
//Expected Result 2:
//1
//2
//Fizz
//4
//Buzz
//Test Data 3: 18
//Expected Result 3:
//1
//2
//Fizz
//4
//Buzz
//Fizz
//7
//8
//Fizz
//Buzz
//11
//Fizz
//13
//14
//FizzBuzz
//16
//17
//        Task-2
//        Requirement:
//        -Create a method called fizzBuzz2()
//                -This method will take an int argument, and it will return
//                a String. BUT it will return “Fizz” if the given number is
//        divided by 3, “Buzz” if the number is divided by 5, and
//“FizzBuzz” if the number is divided both by 3 and 5.
//        Otherwise, it will return number itself.
//                Test Data 1: 0
//        Expected Result 1: FizzBuzz
//        Test Data 2: 1
//        Expected Result 2: 1
//        Test Data 3: 3
//        Expected Result 3: Fizz
//        Test Data 4: 5
//        Expected Result 4: Buzz
//        Test Data 5: 15
//        Expected Result 5: FizzBuzz
//        Task-3
//        Requirement:
//        -Create a method called findSumNumbers()
//                -This method will take a String argument and it will return
//                an int which is the sum of all numbers presented in the String.
//        NOTE: If there are no numbers represented in the String,
//        return 0.
//        Test Data 1: “abc$”
//        Expected Result 1: 0
//        Test Data 2: “a1b4c  6#”
//        Expected Result 2: 11
//        Test Data 3: “ab110c045d”
//        Expected Result 3: 155
//        Test Data 4: “525”
//        Expected Result 4: 525
//        Task-4
//        Requirement:
//        -Create a method called findBiggestNumber()
//                -This method will take a String argument and it will
//        return an int which is the number presented in the
//        String.
//                NOTE: If there are no numbers represented in the String,
//        return 0.
//        Test Data 1: “abc$”
//        Expected Result 1: 0
//        Test Data 2: “a1b4c  6#”
//        Expected Result 2: 6
//        Test Data 3: “ab110c045d”
//        Expected Result 3: 110
//        Test Data 4: “525”
//        Expected Result 4: 525
//        Task-5
//        Requirement:
//        -Create a method called
//        countSequenceOfCharacters()
//                -This method will take a String argument and it will
//        return a String which is the count of repeated
//        characters in a sequence in the String.
//                NOTE: If given String is empty, then return empty String.
//                NOTE: It is case sensitive!!!
//                Test Data 1: “”
//        Expected Result 1: “”
//        Test Data 2: “abc”
//        Expected Result 2: “1a1b1c”
//        Test Data 3: “abbcca”
//        Expected Result 3: “1a2b2ca”
//        Test Data 4: “aaAAa”
//        Expected Result 4: “2a2A1a”

        System.out.println("\n------------------------fizzBuzz1------------------------\n");

        // Test case 1
        int fizzBuzz1Test1 = 3;
        System.out.println("Test data 1: " + fizzBuzz1Test1);
        System.out.println("Expected output: 1 2 Fizz");
        System.out.println("Actual output: " + fizzBuzz1(fizzBuzz1Test1) + "\n");

        // Test case 2
        int fizzBuzz1Test2 = 5;
        System.out.println("Test data 2: " + fizzBuzz1Test2);
        System.out.println("Expected output: 1 2 Fizz 4 Buzz");
        System.out.println("Actual output: " + fizzBuzz1(fizzBuzz1Test2) + "\n");

        // Test case 3
        int fizzBuzz1Test3 = 18;
        System.out.println("Test data 3: " + fizzBuzz1Test3);
        System.out.println("Expected output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz");
        System.out.println("Actual output: " + fizzBuzz1(fizzBuzz1Test3) + "\n");

        System.out.println("\n------------------------fizzBuzz2------------------------\n");

        // Test case 1
        int fizzBuzz2Test1 = 0;
        System.out.println("Test data 1: " + fizzBuzz2Test1);
        System.out.println("Expected output: FizzBuzz");
        System.out.println("Actual output: " + fizzBuzz2(fizzBuzz2Test1));
        System.out.println();

        // Test case 2
        int fizzBuzz2Test2 = 1;
        System.out.println("Test data 2: " + fizzBuzz2Test2);
        System.out.println("Expected output: 1");
        System.out.println("Actual output: " + fizzBuzz2(fizzBuzz2Test2));
        System.out.println();

        // Test case 3
        int fizzBuzz2Test3 = 3;
        System.out.println("Test data 3: " + fizzBuzz2Test3);
        System.out.println("Expected output: Fizz");
        System.out.println("Actual output: " + fizzBuzz2(fizzBuzz2Test3));
        System.out.println();

        // Test case 4
        int fizzBuzz2Test4 = 5;
        System.out.println("Test data 4: " + fizzBuzz2Test4);
        System.out.println("Expected output: Buzz");
        System.out.println("Actual output: " + fizzBuzz2(fizzBuzz2Test4));
        System.out.println();

        // Test case 5
        int fizzBuzz2Test5 = 15;
        System.out.println("Test data 5: " + fizzBuzz2Test5);
        System.out.println("Expected output: FizzBuzz");
        System.out.println("Actual output: " + fizzBuzz2(fizzBuzz2Test5));
        System.out.println();

        System.out.println("\n------------------------findSumNumbers------------------------\n");

// Test case 1
        String findSumNumbersTest1 = "abc$";
        System.out.println("Test data 1: " + findSumNumbersTest1);
        System.out.println("Expected output: 0");
        System.out.println("Actual output: " + findSumNumbers(findSumNumbersTest1));
        System.out.println();

// Test case 2
        String findSumNumbersTest2 = "a1b4c  6#";
        System.out.println("Test data 2: " + findSumNumbersTest2);
        System.out.println("Expected output: 11");
        System.out.println("Actual output: " + findSumNumbers(findSumNumbersTest2));
        System.out.println();

// Test case 3
        String findSumNumbersTest3 = "ab110c045d";
        System.out.println("Test data 3: " + findSumNumbersTest3);
        System.out.println("Expected output: 155");
        System.out.println("Actual output: " + findSumNumbers(findSumNumbersTest3));
        System.out.println();

// Test case 4
        String findSumNumbersTest4 = "525";
        System.out.println("Test data 4: " + findSumNumbersTest4);
        System.out.println("Expected output: 525");
        System.out.println("Actual output: " + findSumNumbers(findSumNumbersTest4));
        System.out.println();

        System.out.println("\n------------------------findBiggestNumber------------------------\n");

// Test case 1
        String findBiggestNumberTest1 = "abc$";
        System.out.println("Test data 1: " + findBiggestNumberTest1);
        System.out.println("Expected output: 0");
        System.out.println("Actual output: " + findBiggestNumber(findBiggestNumberTest1));
        System.out.println();

// Test case 2
        String findBiggestNumberTest2 = "a1b4c  6#";
        System.out.println("Test data 2: " + findBiggestNumberTest2);
        System.out.println("Expected output: 6");
        System.out.println("Actual output: " + findBiggestNumber(findBiggestNumberTest2));
        System.out.println();

// Test case 3
        String findBiggestNumberTest3 = "ab110c045d";
        System.out.println("Test data 3: " + findBiggestNumberTest3);
        System.out.println("Expected output: 110");
        System.out.println("Actual output: " + findBiggestNumber(findBiggestNumberTest3));
        System.out.println();

// Test case 4
        String findBiggestNumberTest4 = "525";
        System.out.println("Test data 4: " + findBiggestNumberTest4);
        System.out.println("Expected output: 525");
        System.out.println("Actual output: " + findBiggestNumber(findBiggestNumberTest4));
        System.out.println();

        System.out.println("\n------------------------countSequenceOfCharacters------------------------\n");

// Test case 1
        String countSequenceOfCharactersTest1 = "";
        System.out.println("Test data 1: " + countSequenceOfCharactersTest1);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: \"" + countSequenceOfCharacters(countSequenceOfCharactersTest1) + "\"");
        System.out.println();

// Test case 2
        String countSequenceOfCharactersTest2 = "abc";
        System.out.println("Test data 2: " + countSequenceOfCharactersTest2);
        System.out.println("Expected output: \"1a1b1c\"");
        System.out.println("Actual output: \"" + countSequenceOfCharacters(countSequenceOfCharactersTest2) + "\"");
        System.out.println();

// Test case 3
        String countSequenceOfCharactersTest3 = "abbcca";
        System.out.println("Test data 3: " + countSequenceOfCharactersTest3);
        System.out.println("Expected output: \"1a2b2c1a\"");
        System.out.println("Actual output: \"" + countSequenceOfCharacters(countSequenceOfCharactersTest3) + "\"");
        System.out.println();

// Test case 4
        String countSequenceOfCharactersTest4 = "aaAAa";
        System.out.println("Test data 4: " + countSequenceOfCharactersTest4);
        System.out.println("Expected output: \"2a2A1a\"");
        System.out.println("Actual output: \"" + countSequenceOfCharacters(countSequenceOfCharactersTest4) + "\"");
        System.out.println();

    }

    public static String fizzBuzz1(int n) {
        /**
         -Create a method called fizzBuzz1()
         -This method will take an int argument, and it will print
         numbers starting from 1 to given argument. BUT, it will print
         “Fizz” for the numbers divided by 3, “Buzz” for the numbers
         divided by 5, and “FizzBuzz” for the numbers divided both by 3
         and 5.
         */
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.append("FizzBuzz");
            } else if (i % 3 == 0) {
                output.append("Fizz");
            } else if (i % 5 == 0) {
                output.append("Buzz");
            } else {
                output.append(String.valueOf(i));
            }

            if(i != n) output.append(" ");
        }
        return output.toString();
    }

    public static String fizzBuzz2(int n) {
        /**
         Task-2
         Requirement:
         -Create a method called fizzBuzz2()
         -This method will take an int argument, and it will return
         a String. BUT it will return “Fizz” if the given number is
         divided by 3, “Buzz” if the number is divided by 5, and
         “FizzBuzz” if the number is divided both by 3 and 5.
         Otherwise, it will return number itself.
         */
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }

    }

    public static int findSumNumbers(String str) {
        /**
         Requirement:
         -Create a method called findSumNumbers()
         -This method will take a String argument and it will return
         an int which is the sum of all numbers presented in the String.
         NOTE: If there are no numbers represented in the String,
         */
        int sum = 0;
        int currentNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        sum += currentNumber;
        return sum;
    }

    public static int findBiggestNumber(String str) {
        /**
         Requirement:
         -Create a method called findBiggestNumber()
         -This method will take a String argument and it will
         return an int which is the number presented in the
         String.
         NOTE: If there are no numbers represented in the String,
         */
        int biggestNumber = 0;
        int currentNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(str.charAt(i));
                if (currentNumber > biggestNumber) {
                    biggestNumber = currentNumber;
                }
            } else {
                currentNumber = 0;
            }
        }
        return biggestNumber;
    }

    public static String countSequenceOfCharacters(String str) {
        /**
         Requirement:
         -Create a method called
         countSequenceOfCharacters()
         -This method will take a String argument and it will
         return a String which is the count of repeated
         characters in a sequence in the String.
         NOTE: If given String is empty, then return empty String.
         NOTE: It is case sensitive!!!
         */
        if(str.length() == 0) return "";

        String result = "";
        char currentChar = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                result += count + "" + currentChar;
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        result += count + "" + currentChar;
        return result;
    }

}
