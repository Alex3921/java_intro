package homeworks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n------------------------noSpace------------------------\n");
        String str1 = "\"\"";
        System.out.println("Test data 1: " + str1);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: " + noSpace(str1) + "\n");

        String str2 = "Java";
        System.out.println("Test data 2: " + str2);
        System.out.println("Expected output: Java");
        System.out.println("Actual output: " + noSpace(str2) + "\n");

        String str3 = "    Hello    ";
        System.out.println("Test data 3: " + str3);
        System.out.println("Expected output: Hello");
        System.out.println("Actual output: " + noSpace(str3) + "\n");

        String str4 = " Hello World   ";
        System.out.println("Test data 4: " + str4);
        System.out.println("Expected output: HelloWorld");
        System.out.println("Actual output: " + noSpace(str4) + "\n");

        String str5 = "Tech Global";
        System.out.println("Test data 5: " + str5);
        System.out.println("Expected output: TechGlobal");
        System.out.println("Actual output: " + noSpace(str5) + "\n");

        System.out.println("\n------------------------replaceFirstLast------------------------\n");
        String str6 = "\"\"";
        System.out.println("Test data 1: " + str6);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: " + replaceFirstLast(str6) + "\n");

        String str7 = "A";
        System.out.println("Test data 2: " + str7);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: " + replaceFirstLast(str7) + "\n");

        String str8 = "    A       ";
        System.out.println("Test data 3: " + str8);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: " + replaceFirstLast(str8) + "\n");

        String str9 = "Hello";
        System.out.println("Test data 4: " + str9);
        System.out.println("Expected output: oellH");
        System.out.println("Actual output: " + replaceFirstLast(str9) + "\n");

        String str10 = "Tech Global";
        System.out.println("Test data 5: " + str10);
        System.out.println("Expected output: lech GlobaT");
        System.out.println("Actual output: " + replaceFirstLast(str10) + "\n");

        System.out.println("\n------------------------hasVowel------------------------\n");
        String str11 = "\"\"";
        System.out.println("Test data 1: " + str11);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasVowel(str11) + "\n");

        String str12 = "JAVA";
        System.out.println("Test data 2: " + str12);
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + hasVowel(str12) + "\n");

        String str13 = "1234";
        System.out.println("Test data 3: " + str13);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasVowel(str13) + "\n");

        String str14 = "ABC";
        System.out.println("Test data 4: " + str14);
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + hasVowel(str14) + "\n");

        System.out.println("\n------------------------checkAge------------------------\n");
        int age1 = 1800;
        System.out.println("Test data 1: " + age1);
        System.out.println("Expected output: AGE IS NOT VALID");
        System.out.println("Actual output: " + checkAge(age1) + "\n");

        int age2 = 2010;
        System.out.println("Test data 2: " + age2);
        System.out.println("Expected output: AGE IS NOT ALLOWED");
        System.out.println("Actual output: " + checkAge(age2) + "\n");

        int age3 = 2006;
        System.out.println("Test data 3: " + age3);
        System.out.println("Expected output: AGE IS ALLOWED");
        System.out.println("Actual output: " + checkAge(age3) + "\n");

        int age4 = 2050;
        System.out.println("Test data 4: " + age4);
        System.out.println("Expected output: AGE IS NOT VALID");
        System.out.println("Actual output: " + checkAge(age4) + "\n");

        int age5 = 1920;
        System.out.println("Test data 5: " + age5);
        System.out.println("Expected output: AGE IS NOT VALID");
        System.out.println("Actual output: " + checkAge(age5) + "\n");


        System.out.println("\n------------------------averageOfEdges------------------------\n");
        System.out.println("Test data 1: " + 0 + " " + 0 + " " + 6);
        System.out.println("Expected output: 3");
        System.out.println("Actual output: " + averageOfEdges(0,0,6) + "\n");

        System.out.println("Test data 2: " + -2 + " " + -2 + " " + 10);
        System.out.println("Expected output: 4");
        System.out.println("Actual output: " + averageOfEdges(-2,-2,10) + "\n");

        System.out.println("Test data 3: " + -3 + " " + 15 + " " + -3);
        System.out.println("Expected output: 6");
        System.out.println("Actual output: " + averageOfEdges(-3,15,-3) + "\n");

        System.out.println("Test data 4: " + 10 + " " + 13 + " " + 20);
        System.out.println("Expected output: 15");
        System.out.println("Actual output: " + averageOfEdges(10,13,20) + "\n");

        System.out.println("\n------------------------removeExtraSpaces------------------------\n");
        String[] noA1 = {"java", "hello", "123", "xyz"};
        System.out.println("Test data 1: " + Arrays.toString(noA1));
        System.out.println("Expected output: [java, hello, 123, xyz]");
        System.out.println("Actual output: " + Arrays.toString(noA(noA1)) + "\n");

        String[] noA2 = {"appium", "123", "ABC", "java"};
        System.out.println("Test data 2: " + Arrays.toString(noA2));
        System.out.println("Expected output: [###, 123, ###, java]");
        System.out.println("Actual output: " + Arrays.toString(noA(noA2)) + "\n");

        String[] noA3 = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println("Test data 3: " + Arrays.toString(noA3));
        System.out.println("Expected output: [###, ###, ###, ###,###]");
        System.out.println("Actual output: " + Arrays.toString(noA(noA3)) + "\n");


        System.out.println("\n------------------------no3or5------------------------\n");
        int[] arr1 = {7, 4, 11, 23, 17};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Expected output: [7, 4, 11, 23, 17]");
        System.out.println("Actual output: " + Arrays.toString(no3or5(arr1)) + "\n");

        int[] arr2 = {3, 4, 5, 6};
        System.out.println("Array 1: " + Arrays.toString(arr2));
        System.out.println("Expected output: [100, 4, 99, 100]");
        System.out.println("Actual output: " + Arrays.toString(no3or5(arr2)) + "\n");

        int[] arr3 = {10, 11, 12, 13, 14, 15};
        System.out.println("Array 1: " + Arrays.toString(arr3));
        System.out.println("Expected output: [99, 11, 100, 13, 14, 101]");
        System.out.println("Actual output: " + Arrays.toString(no3or5(arr3)) + "\n");

        System.out.println("\n------------------------countPrimes------------------------\n");
        int[] arr4 = {-10, -3, 0, 1};
        System.out.println("Array 1: " + 0);
        System.out.println("Expected output: 0");
        System.out.println("Actual output: " + countPrimes(arr4) + "\n");

        int[] arr5 = {7, 4, 11, 23, 17};
        System.out.println("Array 1: " + Arrays.toString(arr5));
        System.out.println("Expected output: 4");
        System.out.println("Actual output: " + countPrimes(arr5) + "\n");

        int[] arr6 = {41, 53, 19, 47, 67};
        System.out.println("Array 1: " + Arrays.toString(arr6));
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + countPrimes(arr6) + "\n");

    }

    public static String noSpace(String str) {
        /**
         Requirement:
         * -Create a method called noSpace()
         * -This method will take one String argument and it will
         * return a new String with all spaces removed from the
         * original String
         */
        return str.replaceAll(" ", "");
    }

    public static String replaceFirstLast(String str) {
        /**
         * Task-2
         * Requirement:
         * -Create a method called replaceFirstLast()
         * -This method will take one String argument and it will return a new
         * String with first and last characters replaced
         * NOTE: if the length is less than 2, then return empty String
         * NOTE: Ignore all before and after spaces (get actual String only)
         */
        if(str.trim().length() < 2) return "";

        String first = str.substring(0,1);
        String last = str.substring(str.length() - 1);
        return last + str.substring(1,str.length() - 1) + first;
    }

    public static boolean hasVowel(String str) {
        /**
         * Task-3
         * Requirement:
         * -Create a method called hasVowel()
         * -This method will take one String argument and it will return a
         * boolean checking if String has any vowel or not
         * NOTE: Vowels are = a, e, o, u, I
         * NOTE: Ignore cases
         */
        List<String> vowels = new ArrayList<>(Arrays.asList("a","e","i","o","u"));

        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.substring(i, i+1).toLowerCase())) return true;
        }

        return false;
    }

    public static String checkAge(int yearOfBirth) {
        /**
         * Task-4
         * Requirement:
         * -Create a method called checkAge()
         * -This method will take an int yearOfBirth as  argument and it will print
         * message below based on the entry
         * If the age is less than 16, then print "AGE IS NOT ALLOWED"
         * If the age is 16 or more, then print "AGE IS ALLOWED"
         * If the age is more than 100 or a future year entered, print "AGE IS NOT
         * VALID"
         * NOTE: Calculate the age taking base year as current year in a dynamic
         * way. You can use Date class.
         */
        LocalDate currentYear = LocalDate.now();
        int age = Math.abs(currentYear.getYear() - yearOfBirth);
        if(age > 100 || yearOfBirth > currentYear.getYear()) {
            return "AGE IS NOT VALID";
        } else if(age < 16) {
            return "AGE IS NOT ALLOWED";
        }

        return "AGE IS ALLOWED";
    }

    public static int averageOfEdges(int num1, int num2, int num3) {
        /**
         * Task-5
         * Requirement:
         * -Create a method called averageOfEdges()
         * -This method will take three int arguments and it will return
         * average of min and max numbers
         */

        int min = Math.min(num1, Math.min(num2, num3));
        int max = Math.max(num1, Math.max(num2, num3));

        return (min + max) / 2;
    }

    public static String[] noA(String[] str) {
        /**
         * Task-6
         * Requirement:
         * -Create a method called noA()
         * -This method will take a String array argument and it
         * will return a new array with all elements starting with A
         * or a replaced with "###"
         * NOTE: Assume length will always be more than zero
         * NOTE: Ignore cases
         */
        for (int i = 0; i < str.length; i++) {
            if(str[i].startsWith("a") || str[i].startsWith("A")) {
                str[i] = "###";
            }
        }

        return str;
    }

    public static int[] no3or5(int[] arr) {
        /**
         * Task-7
         * Requirement:
         * -Create a method called no3or5()
         * -This method will take an int array argument and it will
         * return a new array with some elements replaced as below
         * If element can be divided by 5, replace it with 99
         * If element can be divided by 3, replace it with 100
         * If element can be divided by both 3 and 5, replace it with
         * 101
         * NOTE: Assume length will always be more than zero
         */

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                arr[i] = 101;
            } else if(arr[i] % 5 == 0) {
                arr[i] = 99;
            } else if(arr[i] % 3 == 0) {
                arr[i] = 100;
            }
        }

        return arr;
    }

    public static int countPrimes(int[] arr) {
        /**
         * Task-8
         * Requirement:
         * -Create a method called countPrimes()
         * -This method will take an int array argument and it will return
         * how many elements in the array are prime numbers
         * NOTE: Prime number is a number that can be divided only by 1
         * and itself
         * NOTE: Negative numbers cannot be prime
         * Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
         * NOTE: Smallest prime number is 2
         */
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(countPrimesHelper(arr[i])) count++;
        }

        return count;
    }

    static boolean countPrimesHelper(int n) {

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
}
