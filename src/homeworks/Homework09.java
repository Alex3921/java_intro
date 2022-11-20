package homeworks;

import java.util.*;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("\n------------------------Task 01------------------------\n");
        int[] test1 = {-4, 0, -7, 0, 5, 10, 45, 45};
        System.out.println("Test data 1: " + Arrays.toString(test1));
        System.out.println("Expected output: 0");
        System.out.println("Actual output: " + task_01(test1) + "\n");

        int[] test2 = {-8, 56, 7, 8, 65};
        System.out.println("Test data 2: " + Arrays.toString(test2));
        System.out.println("Expected output: There is no duplicates!");
        System.out.println("Actual output: " + task_01(test2) + "\n");

        int[] test3 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        System.out.println("Test data 3: " + Arrays.toString(test3));
        System.out.println("Expected output: 3");
        System.out.println("Actual output: " + task_01(test3) + "\n");

        System.out.println("\n------------------------Task 02------------------------\n");
        String[] words1 = {"Z", "abc", "z", "123", "#" };
        System.out.println("Test data 1: " + Arrays.toString(words1));
        System.out.println("Expected output: Z");
        System.out.println("Actual output: " + task_02(words1) + "\n");

        String[] words2 = {"xyz", "java", "abc"};
        System.out.println("Test data 2: " + Arrays.toString(words2));
        System.out.println("Expected output: There is no duplicates!");
        System.out.println("Actual output: " + task_02(words2) + "\n");

        String[] words3 = {"a", "b", "B", "XYZ", "123"};
        System.out.println("Test data 3: " + Arrays.toString(words3));
        System.out.println("Expected output: b");
        System.out.println("Actual output: " + task_02(words3) + "\n");

        System.out.println("\n------------------------Task 03------------------------\n");
        int[] nums1 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        System.out.println("Test data 1: " + Arrays.toString(nums1));
        System.out.println("Expected output: 0, -7");
        System.out.println("Actual output:");
        task_03(nums1);

        int[] nums2 = {1, 2, 5, 0, 7};
        System.out.println("Test data 2: " + Arrays.toString(words2));
        System.out.println("Expected output: There is no duplicates!");
        System.out.println("Actual output: ");
        task_03(nums2);


        System.out.println("\n------------------------Task 04------------------------\n");
        String[] words4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        System.out.println("Test data 1: " + Arrays.toString(words4));
        System.out.println("Expected output: A, foo");
        System.out.println("Actual output: ");
        task_04(words4);

        String[] words5 = {"python", "foo", "bar", "java", "123" };
        System.out.println("Test data 2: " + Arrays.toString(words5));
        System.out.println("Expected output: There is no duplicates!");
        System.out.println("Actual output: ");
        task_04(words5);


        System.out.println("\n------------------------Task 05------------------------\n");
        String[] words6 = {"abc", "foo", "bar"};
        System.out.println("Test data 1: " + Arrays.toString(words6));
        System.out.println("Expected output: [bar, foo, abc]");
        System.out.println("Actual output: " + task_05(words6) + "\n");

        String[] words7 = {"java", "python", "ruby"};
        System.out.println("Test data 2: " + Arrays.toString(words7));
        System.out.println("Expected output: There is no duplicates!");
        System.out.println("Actual output: " + task_05(words7) + "\n");


        System.out.println("\n------------------------Task 06------------------------\n");
        String str1 = "Java is fun";
        System.out.println("Test data 1: " + str1);
        System.out.println("Expected output: avaJ si nuf");
        System.out.println("Actual output: " + task_06(str1) + "\n");

        String str2 = "Today is a fun day";
        System.out.println("Test data 2: " + str2);
        System.out.println("Expected output: yadoT si a nuf yad");
        System.out.println("Actual output: " + task_06(str2) + "\n");
    }

    public static String task_01(int[] arr) {
        /**
         * Write a program to find the first duplicated number in an int array
         *  It should print "There is no duplicates" if there are no duplicate
         *  elements.
         *  NOTE: Make your code dynamic that works for any given int array.
         */
        HashMap<Integer, Integer> uniqueNums = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(uniqueNums.containsKey(arr[i])) return String.valueOf(arr[i]);
            uniqueNums.put(arr[i], i);
        }

        return "There is no duplicates!";
    }

    public static String task_02(String[] words) {
        /**
         * Task-2
         *  Requirement:
         *  Write a program to find the first duplicated String in a String array, ignore
         *  cases. It should print "There is no duplicates" if there are no duplicate
         *  elements.
         *  NOTE: Make your code dynamic that works for any given String array.
         */
        HashMap<String, String> uniqueWords = new HashMap<>();

        for (String word : words) {
            if (uniqueWords.containsKey(word.toLowerCase())) return String.valueOf(uniqueWords.get(word.toLowerCase()));
            uniqueWords.put(word.toLowerCase(), word);
        }

        return "There is no duplicates!";
    }
    public static void task_03(int[] arr) {
        /**
         * Task-3
         *  Requirement:
         *  Write a program to find the all duplicates in an int array. It
         *  should print "There is no duplicates" if there are no
         *  duplicate elements.
         *  NOTE: Make your code dynamic that works for any given
         *  int array.
         */
        HashMap<Integer, Integer> uniqueNums = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(uniqueNums.containsKey(arr[i])) {
                duplicates.add(arr[i]);
            }
            else {
                uniqueNums.put(arr[i],i);
            }
        }

        if(duplicates.size() > 0) {
            duplicates.forEach(System.out::println);
        }
        else {
            System.out.println("There is no duplicates!");
        }
    }

    public static void task_04(String[] words) {
        /**
         * Task-4
         *  Requirement:
         *  Write a program to find the all duplicates in a String array,
         *  ignore cases. It should print "There is no duplicates" if
         *  there are no duplicate elements.
         *  NOTE: Make your code dynamic that works for any given
         *  String array.
         */

        HashMap<String, String> uniqueWords = new HashMap<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words) {
            if(uniqueWords.containsKey(word.toLowerCase())) {
                duplicates.add(uniqueWords.get(word.toLowerCase()));
            }
            else {
                uniqueWords.put(word.toLowerCase(), word);
            }
        }

        if(duplicates.size() > 0) {
            duplicates.forEach(System.out::println);
        }
        else {
            System.out.println("There is no duplicates!");
        }
    }

    public static String task_05(String[] arr) {
        /**
         * Task-5
         *  Requirement:
         *  Write a program to reverse elements in an array, then
         *  print array.
         *  NOTE: Make your code dynamic that works for any
         *  given array.
         */
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return Arrays.toString(arr);
    }

    public static String task_06(String str) {
        /**
         * Task-6
         *  Requirement:
         *  Write a program to reverse each word in a given String
         *  NOTE: Make your code dynamic that works for any
         *  given String.
         */
        String[] words = str.split(" ");
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            output.append(new StringBuilder(words[i]).reverse());
            if(i < words.length - 1) output.append(" ");
        }

        return output.toString();
    }
}
