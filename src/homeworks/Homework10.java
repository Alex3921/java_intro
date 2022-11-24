package homeworks;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("\n------------------------countWords------------------------\n");
        String str1 = "      Java is fun       ";
        System.out.println("Test data 1: " + str1);
        System.out.println("Expected output: 3");
        System.out.println("Actual output: " + countWords(str1) + "\n");

        String str2 = "Selenium is the most common UI automation tool.   ";
        System.out.println("Test data 1: " + str2);
        System.out.println("Expected output: 8");
        System.out.println("Actual output: " + countWords(str2) + "\n");

        System.out.println("\n------------------------countA------------------------\n");
        String str3 = "TechGlobal is a QA bootcamp";
        System.out.println("Test data 1: " + str3);
        System.out.println("Expected output: 4");
        System.out.println("Actual output: " + countA(str3) + "\n");

        String str4 = "QA stands for Quality Assurance";
        System.out.println("Test data 1: " + str4);
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + countA(str4) + "\n");

        System.out.println("\n------------------------countPost------------------------\n");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println("Test data 1: " + list1);
        System.out.println("Expected output: 3");
        System.out.println("Actual output: " + countPost(list1) + "\n");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println("Test data 1: " + list2);
        System.out.println("Expected output: 4");
        System.out.println("Actual output: " + countPost(list2) + "\n");

        System.out.println("\n------------------------removeDuplicateNumbers------------------------\n");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println("Test data 1: " + list3);
        System.out.println("Expected output: [10, 20, 35, 60, 70]");
        System.out.println("Actual output: " + removeDuplicateNumbers(list3) + "\n");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println("Test data 1: " + list4);
        System.out.println("Expected output: [1, 2, 5, 3]");
        System.out.println("Actual output: " + removeDuplicateNumbers(list4) + "\n");

        System.out.println("\n------------------------removeDuplicateElements------------------------\n");
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println("Test data 1: " + list5);
        System.out.println("Expected output: [java, C#, ruby, JAVA,  C++]");
        System.out.println("Actual output: " + removeDuplicateElements(list5) + "\n");

        ArrayList<String> list6 = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println("Test data 1: " + list6);
        System.out.println("Expected output: [abc, xyz, 123, ab, ABC]");
        System.out.println("Actual output: " + removeDuplicateElements(list6) + "\n");

        System.out.println("\n------------------------removeExtraSpaces------------------------\n");
        String str5 = "   I   am      learning     Java      ";
        System.out.println("Test data 1: " + str5);
        System.out.println("Expected output: I am learning Java");
        System.out.println("Actual output: " + removeExtraSpaces(str5) + "\n");

        String str6 = "Java  is fun    ";
        System.out.println("Test data 1: " + str6);
        System.out.println("Expected output: Java is fun");
        System.out.println("Actual output: " + removeExtraSpaces(str6) + "\n");

        System.out.println("\n------------------------add------------------------\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Expected output: [9, 3, 2, 7, 5, 10]");
        System.out.println("Actual output: " + Arrays.toString(add(arr1, arr2)) + "\n");

        int[] arr3 = {10, 3, 6, 3, 2};
        int[] arr4 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println("Array 1: " + Arrays.toString(arr3));
        System.out.println("Array 2: " + Arrays.toString(arr4));
        System.out.println("Expected output: [16, 11, 9,  3, 2, 7, 5, 10, 34]");
        System.out.println("Actual output: " + Arrays.toString(add(arr3, arr4)) + "\n");

        System.out.println("\n------------------------findClosestTo10------------------------\n");
        int[] arr5 = {10, -13, 5, 70, 15, 57};
        System.out.println("Array 1: " + Arrays.toString(arr5));
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + findClosestTo10(arr5) + "\n");

        int[] arr6 = {10, -13, 8, 12, 15, -20};
        System.out.println("Array 1: " + Arrays.toString(arr6));
        System.out.println("Expected output: 8");
        System.out.println("Actual output: " + findClosestTo10(arr6) + "\n");
    }

    public static int countWords(String str) {
        /**
         * Requirement:
         * Write a method countWords() that takes a String as an
         * argument, and returns how many words there are in the
         * the given String
         * NOTE: Make your code dynamic that works for any given
         * String
         * NOTE: Be careful about empty String
         * NOTE: Be careful about before and after white spaces
         */
        Pattern pattern = Pattern.compile("(?i)\\w+");
        Matcher matcher = pattern.matcher(str);

        int counter = 0;

        while(matcher.find()) {
            counter++;
        }

        return counter;
    }

    public static int countA(String str) {
        /**
         * Task-2
         * Requirement:
         * Write a method countA() that takes a String as an argument,
         * and returns how many A or a there are in the the given String
         * NOTE: Make your code dynamic that works for any given
         * String
         * NOTE: Be careful about empty String
         * NOTE: Be careful about uppercase and lowercase
         */
        Pattern pattern = Pattern.compile("(?i)[aA]");
        Matcher matcher = pattern.matcher(str);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }


    public static int countPost(ArrayList<Integer> list) {
        /**
         * Task-3
         * Requirement:
         * Write a method countPos() that takes an ArrayList of
         * Integer as an argument, and returns how many elements
         * are positive
         * NOTE: Make your code dynamic that works for any given
         * ArrayList of Integer
         */

        return (int) list.stream().filter(n -> n > 0).count();
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> list) {
        /**
         * Task-4
         * Requirement:
         * Write a method removeDuplicateNumbers() that takes an
         * ArrayList of Integer as an argument, and returns it back
         * with removed duplicates
         * NOTE: Make your code dynamic that works for any given
         * ArrayList of Integer
         */

        return (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
    }

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> list) {
        /**
         * Task-5
         * Requirement:
         * Write a method removeDuplicateElements() that takes an
         * ArrayList of String as an argument, and returns it back with
         * removed duplicates
         * NOTE: Make your code dynamic that works for any given
         * ArrayList of String
         * NOTE: Be careful about lowercase and uppercases, this method
         * is case sensitive
         */
        HashSet<String> uniqueWords = new HashSet<>(list);

        return new ArrayList<>(uniqueWords);
    }

    public static String removeExtraSpaces(String str) {
        /**
         * Task-6
         * Requirement:
         * Write a method removeExtraSpaces() that takes a String as an
         * argument, and returns a String with removed extra spaces
         * NOTE: Make your code dynamic that works for any given
         * String
         * NOTE: Be careful about empty String
         * NOTE: Be careful about before and after white spaces
         */

        return str.replaceAll("\\s+", " ");
    }

    public static int[] add(int[] arr1, int[] arr2) {
        /**
         * Task-7
         * Requirement:
         * Write a method add() that takes 2 int[] arrays as arguments and
         * returns a new array with sum of given arrays elements.
         * NOTE: Make your code dynamic that works for any given arrays
         * NOTE: You will assume that length of arrays are always more than zero
         * NOTE: Be careful about arrays length, if they were equal, it would be
         * an easy task, but they can be different as given in the example above.
         */
        int lenShortest = Math.min(arr1.length, arr2.length);
        int lenLongest = Math.max(arr1.length, arr2.length);
        boolean isArr1LongerThanArr2 = arr1.length > arr2.length;

        int[] output = new int[lenLongest];

        int i = 0;
        while (i < lenShortest) {
            output[i] = Math.addExact(arr1[i], arr2[i]);
            i++;
        }

        if(isArr1LongerThanArr2) {
            while(i < lenLongest) {
                output[i] = arr1[i];
                i++;
            }
        }
        else {
            while(i < lenLongest) {
                output[i] = arr2[i];
                i++;
            }
        }

        return output;
    }

    public static int findClosestTo10(int[] arr) {
        /**
         * Task-8
         * Requirement:
         * Write a method findClosestTo10() that takes an int[] array as an
         * argument, and returns the closest element to 10 from given array
         * NOTE: You will assume that length of array is always more than
         * zero
         * NOTE: Make your code dynamic that works for any given int[]
         * array
         * NOTE: Be careful about element to be 10 (ignore it)
         * NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in
         * this case return smallest which is 8
         */
        int smallestDiff = Integer.MAX_VALUE;
        int closest = Integer.MAX_VALUE;

        for(int n : arr) {
            if(n == 10) continue;

            int diff = Math.abs(10 - n);
            if(diff <= smallestDiff) {
                closest = diff == smallestDiff ? Math.min(n, closest) : n;
                smallestDiff = diff;
            }
        }

        return closest;
    }
}

