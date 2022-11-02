package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Homework07 {
    public static void main(String[] args) {
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

            System.out.println("\n------------------------Task 08------------------------\n");
        task_08();

            System.out.println("\n------------------------Task 09------------------------\n");
        task_09();

            System.out.println("\n------------------------Task 10------------------------\n");
        task_10();
    }

    public static void task_01() {
        /**
         * -Create an ArrayList and store below numbers
         * 10, 23, 67, 23, 78
         *
         * THEN:
         * -Print element at index of 3
         * -Print element at index of 0
         * -Print element at index of 2
         * -Print the entire list
         *
         * Expected Result:
         * 23
         * 10
         * 67
         * [10, 23, 67, 23, 78]
         */
        ArrayList nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(23);
        nums.add(67);
        nums.add(23);
        nums.add(78);

        System.out.println(nums.get(3));
        System.out.println(nums.get(0));
        System.out.println(nums.get(2));
        System.out.println(Arrays.toString(nums.toArray()));
    }

    public static void task_02() {
        /**
         *-Create an ArrayList and store below colors
         * Blue, Brown, Red, White, Black, Purple
         *
         * THEN:
         * -Print element at index of 1
         * -Print element at index of 3
         * -Print element at index of 5
         * -Print the entire list
         *
         * Expected Result:
         * Brown
         * White
         * Purple
         * [Blue, Brown, Red, White, Black, Purple]
         */

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(Arrays.toString(colors.toArray()));
    }

    public static void task_03() {
        /**
         *-Create an ArrayList and store below numbers
         * 23, -34, -56, 0, 89, 100
         * THEN:
         * -Print the entire list
         * -Print the entire list sorted in ascending order
         * Expected Result:
         * [23, -34, -56, 0, 89, 100]
         * [-56, -34, 0, 23, 89, 100]
         */
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(23);
        nums.add(-34);
        nums.add(-56);
        nums.add(0);
        nums.add(89);
        nums.add(100);

        System.out.println(Arrays.toString(nums.toArray()));

        nums.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(nums.toArray()));
    }

    public static void task_04() {
        /**
         *-Create an ArrayList and store below cities
         * Istanbul, Berlin, Madrid, Paris
         * THEN:
         * -Print the entire list
         * -Print the entire list sorted lexicographically
         * Expected Result:
         * [Istanbul, Berlin, Madrid, Paris]
         * [Berlin, Istanbul, Madrid, Paris]
         */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(Arrays.toString(cities.toArray()));

        cities.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(cities.toArray()));
    }

    public static void task_05() {
        /**
         *-Create an ArrayList and store Marvel characters below
         * Spider Man, Iron Man, Black Panter, Deadpool, Captain America
         * THEN:
         * -Print the entire list
         * -Then, check if it contains Wolwerine
         * if it contains Wolwerine, then print true
         * if it does not contain Wolwerine, print false
         * Expected Result:
         * [Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
         * false
         */
        String[] all = {"Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"};
        ArrayList<String> marvel = new ArrayList<String>(Arrays.asList(all));

        System.out.println(Arrays.toString(marvel.toArray()));
        System.out.println("Contains Wolverine: " + marvel.contains("Wolverine"));
    }
    public static void task_06() {
        /**
         *-Create an ArrayList and store Avengers characters below
         * Hulk, Black Widow, Captain America, Iron Man
         * THEN:
         * -Print the entire list sorted lexicographically
         * -Then, check if it contains Hulk and Iron Man
         * if it contains both, then print true
         * if it does not contain both, print false
         * Expected Result:
         * [Black Widow, Captain America, Hulk, Iron Man]
         * true
         */
        String[] all = {"Hulk", "Black Widow", "Captain America", "Iron Man"};
        ArrayList<String> avengers = new ArrayList<String>(Arrays.asList(all));

        avengers.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(avengers.toArray()));
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));
    }

    public static void task_07() {
        /**
         *-Create an ArrayList and store characters below
         * A, x, $, %, 9, *, +, F, G
         * THEN:
         * -Print the entire list
         * -Print each element
         * Expected Result:
         * [A, x, $, %, 9, *, +, F, G]
         * A
         * x
         * $
         * %
         * 9
         * *
         * +
         * F
         * G
         */
        Character[] myChars = {'A', 'x', '$', '%', '9', '*', '+', 'F', 'G'};
        ArrayList<Character> myList = new ArrayList<Character>(Arrays.asList(myChars));

        System.out.println(Arrays.toString(myList.toArray()));
        for(char c : myList) {
            System.out.println(c);
        }
    }

    public static void task_08() {
        /**
         *-Create an ArrayList and store below objects
         * Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
         * THEN:
         * -Print the entire list
         * -Print the entire list sorted lexicographically
         * -Count objects that starts with M or m
         * -Count objects that does not have A or a or E or e
         * Expected Result:
         * [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
         * [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
         * 3
         * 1
         */
        String[] stringList = {"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringList));

        // Print array list
        System.out.println(Arrays.toString(arrayList.toArray()));

        // Sort lexicographically and print array list
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(arrayList.toArray()));

        // Count and print objects that start with M or A or E case-insensitive
        int objStartsWithM = 0;
        int objStartsWithAorE = 0;

        for(String obj : arrayList) {
            if(obj.toLowerCase().startsWith("m")) objStartsWithM++;
            if(!obj.toLowerCase().contains("a") && !obj.toLowerCase().contains("e")) objStartsWithAorE++;
        }

        System.out.println(objStartsWithM);
        System.out.println(objStartsWithAorE);
    }
    public static void task_09() {
        /**
         *-Create an ArrayList and store below kitchen objects
         * Plate, spoon, fork, Knife, cup, Mixer
         * THEN:
         * -Print the entire list
         * -Print how many elements starts with uppercase
         * -Print how many elements starts with lowercase
         * -Print how many elements has P or p
         * -Print how many elements starts or ends with P or p
         * Expected Result:
         * [Plate, spoon, fork, Knife, cup, Mixer]
         * Elements starts with uppercase = 3
         * Elements starts with lowercase = 3
         * Elements having P or p= 3
         * Elements starting or ending with P or p = 2
         */
        String[] stringList = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        ArrayList<String> kitchenObjects = new ArrayList<String>(Arrays.asList(stringList));

        // Print array list
        System.out.println(Arrays.toString(kitchenObjects.toArray()));

        // Count and print number of objects that:
        int startWtihUppercase = 0;
        int startWithLowercase = 0;
        int containP = 0;
        int startOrEndWithP = 0;

        for(String obj : kitchenObjects) {
            if(Character.isUpperCase(obj.charAt(0))) startWtihUppercase++;
            if(Character.isLowerCase(obj.charAt(0))) startWithLowercase++;
            if(obj.toLowerCase().contains("p")) containP++;
            if(obj.toLowerCase().endsWith("p") || obj.toLowerCase().startsWith("p")) startOrEndWithP++;
        }

        System.out.println("Elements starts with uppercase = " + startWtihUppercase);
        System.out.println("Elements starts with lowercase = " + startWithLowercase);
        System.out.println("Elements having P or p = " + containP);
        System.out.println("Elements starting or ending with P or p = " + startOrEndWithP);
    }

    public static void task_10() {
        /**
         *Requirement:
         * -Create an ArrayList and store below numbers
         * 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
         * THEN:
         * -Print the entire list
         * -Print how many element can be divided by 10
         * -Print how many even numbers are greater than 15
         * -Print how many odd numbers are less than 20
         * -Print how many elements are less than 15 or greater than 50
         * Expected Result:
         * [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
         * Elements that can be divided by 10 = 4
         * Elements that are even and greater than 15 = 3
         * Elements that are odd and less than 20 = 4
         * Elements that are less than 15 or greater than 50 = 8
         */
        Integer[] numList = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numList));

        // Print numbers list
        System.out.println(Arrays.toString(nums.toArray()));

        // Count and print elements that:
        int numbersDividedByTen = 0;
        int numbersEvenGreaterThanFifteen = 0;
        int numbersOddLessThanTwenty = 0;
        int numbersLessThanFifteenOrGreaterThanFifty = 0;

        for(int num : nums) {
            if(num % 10 == 0) numbersDividedByTen++;
            if(num % 2 == 0 && num > 15) numbersEvenGreaterThanFifteen++;
            if(num % 2 != 0 && num < 20) numbersOddLessThanTwenty++;
            if(num < 15 || num > 50) numbersLessThanFifteenOrGreaterThanFifty++;
        }

        System.out.println("Elements that can be divided by 10 = " + numbersDividedByTen);
        System.out.println("Elements that are even and greater than 15 = " + numbersEvenGreaterThanFifteen);
        System.out.println("Elements that are odd and less than 20 = " + numbersOddLessThanTwenty);
        System.out.println("Elements that are less than 15 or greater than 50 = " + numbersLessThanFifteenOrGreaterThanFifty);
    }
}


