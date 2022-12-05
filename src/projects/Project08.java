package projects;

import java.util.*;

public class Project08 {
    public static void main(String[] args) {
        System.out.println("\n------------------------findClosestDistance------------------------\n");
        int[] arr1 = {4};
        System.out.println("Test data 1: " + Arrays.toString(arr1));
        System.out.println("Expected output: -1");
        System.out.println("Actual output: " + findClosestDistance(arr1) + "\n");

        int[] arr2 = {10, -5, 20, 50, 100};
        System.out.println("Test data 2: " + Arrays.toString(arr2));
        System.out.println("Expected output: 10");
        System.out.println("Actual output: " + findClosestDistance(arr2) + "\n");

        System.out.println("\n------------------------findSingleNumber------------------------\n");
        int[] arr3 = {2};
        System.out.println("Test data 1: " + Arrays.toString(arr3));
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + findSingleNumber(arr3) + "\n");

        int[] arr4 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println("Test data 2: " + Arrays.toString(arr4));
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findSingleNumber(arr4) + "\n");

        System.out.println("\n------------------------findFirstUniqueCharacter------------------------\n");
        String str1 = "Hello";
        System.out.println("Test data 1: " + str1);
        System.out.println("Expected output: H");
        System.out.println("Actual output: " + findFirstUniqueCharacter(str1) + "\n");

        String str2 = "abc abc d";
        System.out.println("Test data 2: " + str2);
        System.out.println("Expected output: d");
        System.out.println("Actual output: " + findFirstUniqueCharacter(str2) + "\n");

        String str3 = "abab";
        System.out.println("Test data 2: " + str3);
        System.out.println("Expected output: \' \'");
        System.out.println("Actual output: " + findFirstUniqueCharacter(str3) + "\n");

        System.out.println("\n------------------------findMissingNumber------------------------\n");
        int[] arr5 = {2,4};
        System.out.println("Test data 1: " + Arrays.toString(arr5));
        System.out.println("Expected output: 3");
        System.out.println("Actual output: " + findMissingNumber(arr5) + "\n");

        int[] arr6 = {2,3,1,5};
        System.out.println("Test data 2: " + Arrays.toString(arr6));
        System.out.println("Expected output: 4");
        System.out.println("Actual output: " + findMissingNumber(arr6) + "\n");

        int[] arr7 = {4, 7, 8, 6};
        System.out.println("Test data 2: " + Arrays.toString(arr7));
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + findMissingNumber(arr7) + "\n");

    }

    public static int findClosestDistance(int[] arr) {
        /**
         * TASK-1 - findClosestDistance() method
         * •Write a method that takes a int[] array as an argument and returns the
         * closest difference between the numbers
         * •This method will return an int which is the closest difference between 2
         * elements in the array
         * •NOTE: if array does not have at least 2 elements, then return -1.
         */
        if(arr.length < 2) return -1;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            if(Math.abs(arr[i] - arr[i+1]) < minDiff) {
                minDiff = Math.abs(arr[i] - arr[i+1]);
            }
        }

        return minDiff;
    }

    public static int findSingleNumber(int[] arr) {
        /**
         TASK-2 – findSingleNumber() method
         Write a method that takes a int[] array as an argument and returns the
         element occurs only once.
         You will be given a non-empty array in which all the elements appears
         twice except for one.
         */
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.remove(arr[i]);
            } else {
                map.put(arr[i],arr[i]);
            }
        }

        return (int) map.values().toArray()[0];
    }

    public static char findFirstUniqueCharacter(String str) {
        /**
         TASK-3 - findFirstUniqueCharacter() method
         Write a method that takes a non-empty String as an argument and
         returns the first unique character in the String.
         This method returns a char.
         If there is no unique character in the String, then return space by default.
         This task is case-sensitive.
         */
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (count.get(str.charAt(i)) == 1)
                return str.charAt(i);
        }

        return ' ';
    }

    public static int findMissingNumber(int[] arr) {
        /**
         TASK-4 – findMissingNumber() method
         Write a method that takes a int[] array as an argument and returns the
         missing element.
         You will be given an array length of 2 at least.
         Array elements will be representing a sequence of numbers that increases
         by 1.
         */
        Arrays.sort(arr);

        int start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(start+1 != arr[i]) {
                return start + 1;
            } else {
                start = arr[i];
            }
        }

        return -1;
    }
}