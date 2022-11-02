package projects;

import java.util.*;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("\n------------------------Task 01------------------------\n");
        task_01(new int[]{10, 7, 7, 10, -3, 10, -3});

        System.out.println("\n------------------------Task 02------------------------\n");
        task_02(new int[]{10, 7, 7, 10 -3, 10, -3});

        System.out.println("\n------------------------Task 03------------------------\n");
        task_03(new int[]{10, 5, 6, 7, 8, 5, 15, 15});

        System.out.println("\n------------------------Task 04------------------------\n");
        task_04(new int[]{10, 5, 6, 7, 8, 5, 15, 15});

        System.out.println("\n------------------------Task 05------------------------\n");
        task_05(new ArrayList<String>(Arrays.asList("foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz")));

        System.out.println("\n------------------------Task 06------------------------\n");
        task_06(new String[]{"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"});
    }

    public static void task_01(int[] args) {
        /**
         * Write a method that takes an int array that has at least one element. Find
         * the greatest and smallest elements from the array and print them.
         * Complete task using sort() method.
         * Test data:
         * [10, 7, 7, 10, -3, 10, -3]
         * Expected output:
         * Smallest = -3
         * Greatest = 10
         */
        Arrays.sort(args);

        System.out.println("Smallest = " + args[0]);
        System.out.println("Greatest = " + args[args.length - 1]);
    };

    public static void task_02(int[] args) {
        /**
         * Write a method that takes an int array that has at least one element. Find
         * the greatest and smallest elements from the array and print them. DO NOT
         * sort the array and complete task without sorting.
         * Test data:
         *         [10, 7, 7, 10 -3, 10, -3]
         * Expected output:
         * Smallest = -3
         * Greatest = 10
         */
        int left = 0;
        int right = args.length - 1;

        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;

        while(left < right) {
            int currentMax = Math.max(args[left], args[right]);
            int currentMin = Math.min(args[left], args[right]);

            greatest = Math.max(currentMax, greatest);
            smallest = Math.min(currentMin, smallest);

            left++;
            right--;
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    };

    public static void task_03(int[] args) {
        /**
         * Write a method that takes an int array that has at least one element. Find
         * the second greatest and second smallest elements from the array and print
         * them. Complete task using sort() method.
         * Test data:
         *         [10, 5, 6, 7, 8, 5, 15, 15]
         * Expected output:
         * Second Smallest = 6
         * Second Greatest = 10
         */
        Arrays.sort(args);

        System.out.println("Second Smallest = " + args[1]);
        System.out.println("Second Greatest = " + args[args.length - 2]);
    };

    public static void task_04(int[] args) {
        /**
         * Write a method that takes an int array that has at least one element. Find
         * the second greatest and second smallest elements from the array and print
         * them. DO NOT sort the array and complete task without sorting.
         * Test data:
         *         [10, 5, 6, 7, 8, 5, 15, 15]
         * Expected output:
         * Second Smallest = 6
         * Second Greatest = 10
         */

        // Find second greatest
        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for(int i = 0; i < args.length; i++) {
            if(args[i] > greatest) {
                secondGreatest = greatest;
                greatest = args[i];
            } else if(args[i] < greatest && args[i] > secondGreatest) {
                secondGreatest = args[i];
            }
        }

        // Find second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < args.length; i++) {
            if(args[i] < smallest) {
                secondSmallest = smallest;
                smallest = args[i];
            } else if(args[i] > smallest && args[i] < secondSmallest) {
                secondSmallest = args[i];
            }
        }

        System.out.println("Second smallest = " + secondSmallest);
        System.out.println("Second greatest = " + secondGreatest);
    };

    public static void task_05(ArrayList<String> args) {
        /**
         * Write a method that takes a String array. Find all duplicated elements and
         * print them.
         * NOTE: It is case-sensitive!
         * Test data:
         *         ["foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"]
         * Expected output:
         * bar
         */
        ArrayList<String> duplicates = new ArrayList<String>();

        for(int i = 0; i < args.size() - 1; i++) {
            String current = args.get(i);

            for(int j = i+1; j < args.size(); j++) {
                if(current.equals(args.get(j))) {
                    duplicates.add(current);
                };
            }
        }

        System.out.print("Duplicated elements are: ");
        duplicates.forEach(d -> System.out.print(d + " "));
    };

    public static void task_06(String[] args) {
        /**
         * Write a method that takes a String array. Find the most repeated element
         * and print it.
         * Test data:
         *         ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]
         * Expected output:
         * pen
         */
        HashMap<String, Integer> count = new HashMap<>();

        int max = 0;
        String mostRepeated = "";

        for(String s : args) {
            if(count.containsKey(s)) {
                count.put(s, count.get(s)+1);
            } else {
                count.put(s, 1);
            }

            if(max < count.get(s)) {
                max = count.get(s);
                mostRepeated = s;
            }
        }

        System.out.println("Most repeated element is: " + mostRepeated);
    };

}
