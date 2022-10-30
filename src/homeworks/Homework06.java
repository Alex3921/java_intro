package homeworks;

import java.util.Arrays;

public class Homework06 {
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

        System.out.println("\n------------------------Task 10------------------------\n");
        task_11();
    }

    public static void task_01() {
        /**
         * -Create an int array having size of 10
         * -Assign 23 to index of 2
         * -Assign 12 to index of 4
         * -Assign 34 to index of 7
         * -Assign 7 to index of 9
         * -Assign 15 to index of 6
         * -Assign 89 to index of 0
         *
         * THEN:
         * -Print element at index of 3
         * -Print element at index of 0
         * -Print element at index of 9
         * -Print the entire array
         * Expected Result:
         * 0
         * 89
         * 7
         * [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
         */

        int[] myArray = new int[10];
        String[] assignValuesAtIndex = {"Assign 23 to index of 2",
                        "Assign 12 to index of 4",
                        "Assign 34 to index of 7",
                        "Assign 7 to index of 9",
                        "Assign 15 to index of 6",
                        "Assign 89 to index of 0"};

        for(String statement : assignValuesAtIndex) {
            // Split the sentence by empty space
            String[] taskStatement = statement.split(" ");

            // Grab and convert to integer the value to be saved
            int val = Integer.parseInt(taskStatement[1]);

            // Grab and convert to integer the index to be used
            int index = Integer.parseInt(taskStatement[taskStatement.length - 1]);

            // Assign value at index
            myArray[index] = val;
        }

        String[] printValuesAtIndex = {"Print element at index of 3",
                "Print element at index of 0",
                "Print element at index of 9"};

        for(String statement : printValuesAtIndex) {
            // Split the sentence by empty space
            String[] taskStatement = statement.split(" ");

            // Grab and convert to integer the index
            int indexToPrint = Integer.parseInt(taskStatement[taskStatement.length - 1]);

            // Print value at index position
            System.out.println(myArray[indexToPrint]);
        }

        // Convert and print entire array
        System.out.println(Arrays.toString(myArray));
    }

    public static void task_02() {
        /**
         * -Create a String array having size of 5
         * -Assign “abc” to index of 1
         * -Assign “xyz” to index of 4
         *
         * THEN:
         * -Print element at index of 3
         * -Print element at index of 0
         * -Print element at index of 4
         * -Print the entire array
         *
         * Expected Result:
         * null
         * null
         * xyz
         * [null, abc, null, null, xyz]
         */

        String[] myArray = new String[5];
        myArray[1] = "abc";
        myArray[4] = "xyz";

        System.out.println(myArray[3]);
        System.out.println(myArray[0]);
        System.out.println(myArray[4]);
        System.out.println(Arrays.toString(myArray));
    }

    public static void task_03() {
        /**
         * -Create an int array that stores numbers below
         * 23, -34, -56, 0, 89, 100
         *
         * THEN:
         * -Print the entire array
         * -Print the entire array sorted in ascending order
         *
         * Expected Result:
         * [23, -34, -56, 0, 89, 100]
         * [-56, -34, 0, 23, 89, 100]
         */

        int[] myArray = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void task_04() {
        /**
         * -Create a String array that stores countries below
         * Germany, Argentina, Ukraine, Romania
         *
         * THEN:
         * -Print the entire array
         * -Print the entire array sorted lexicographically
         *
         * Expected Result:
         * [Germany, Argentina, Ukraine, Romania]
         * [Argentina, Germany, Romania, Ukraine]
         */

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));
    }

    public static void task_05() {
        /**
         * -Create a String array that stores cartoon dogs below
         * Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
         *
         * THEN:
         * -Print the entire array
         * -Then, check if it contains Pluto
         * if it contains Pluto, then print true
         * if it does not contain Pluto, print false
         *
         * Expected Result:
         * [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
         * true
         */

        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));

        System.out.println(Arrays.asList(cartoonDogs).contains("Pluto"));
    }

    public static void task_06() {
        /**
         * -Create a String array that stores cartoon cats below
         * Garfield, Tom, Sylvester, Azrael
         *
         * THEN:
         * -Print the entire array sorted lexicographically
         * -Then, check if it contains Garfield and Felix
         * if it contains both, then print true
         * if it does not contain both, print false
         *
         * Expected Result:
         * [Azrael, Garfield, Sylvester, Tom]
         * false
         */

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean containsGarfield = Arrays.asList(cartoonCats).contains("Garfield");
        boolean containsFelix = Arrays.asList(cartoonCats).contains("Felix");

        System.out.println(containsGarfield && containsFelix);
    }

    public static void task_07() {
        /**
         * -Create a double array that stores numbers below
         * 10.5, 20.75, 70, 80, 15.75
         *
         * THEN:
         * -Print the entire array
         * -Print each element
         *
         * Expected Result:
         * [10.5, 20.75, 70, 80, 15.75]
         * 10.5
         * 20.75
         * 70
         * 80
         * 15.75
         */

        double[] nums = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(nums));

        for(double val : nums) {
            System.out.println(val);
        }
    }

    public static void task_08() {
        /**
         * -Create a char array that stores characters below
         * A, b, G, H, 7, 5, &, *, e, @, 4
         *
         * THEN:
         * -Print the entire array
         * -Print the total count of the letters
         * -Print the total count of lowercase letters
         * -Print the total count of uppercase letters
         * -Print the total count of digits
         * -Print the total count of special characters
         *
         * Expected Result:
         * [A, b, G, H, 7, 5, &, *, e, @, 4]
         * Letters = 5
         * Uppercase letters = 3
         * Lowercase letters = 2
         * Digits = 3
         * Special characters = 3
         */

        char[] randomChars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int letters = 0;
        int uppercaseLetters = 0;
        int lowercaseLetters = 0;
        int digits = 0;
        int specialCharacters = 0;

        for(char c : randomChars) {
            if (Character.isLetter(c)) {
                letters++;
                if (Character.isUpperCase(c)) {
                    uppercaseLetters++;
                } else if (Character.isLowerCase(c)) {
                    lowercaseLetters++;
                }
            } else if (Character.isDigit(c)) {
                digits++;
            } else {
                specialCharacters++;
            }
        }

        System.out.println(Arrays.toString(randomChars));
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + uppercaseLetters);
        System.out.println("Lowercase letters = " + lowercaseLetters);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + specialCharacters);
    }

    public static void task_09() {
        /**
         * -Create a String array that stores objects below
         * Pen, notebook, Book, paper, bag, pencil, Ruler
         *
         * THEN:
         * -Print the entire array
         * -Print how many elements starts with uppercase
         * -Print how many elements starts with lowercase
         * -Print how many elements starts with B or P, ignoring cases
         * -Print how many elements has “book” or “pen” in it, ignoring cases
         *
         * Expected Result:
         * [Pen, notebook, Book, paper, bag, pencil, Ruler]
         * Elements starts with uppercase = 3
         * Elements starts with lowercase = 4
         * Elements starting with B or P = 5
         * Elements having ”book” or “pen”= 4
         */

        String[] myArray = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int startsWithUppercase = 0;
        int startsWithLowercase = 0;
        int startsWithBorP = 0;
        int containsBookOrPen = 0;

        for(String word : myArray) {
            if(Character.isUpperCase(word.charAt(0))) startsWithUppercase++;
            if(Character.isLowerCase(word.charAt(0))) startsWithLowercase++;
            if(word.toLowerCase().startsWith("b") || word.toLowerCase().startsWith("p")) startsWithBorP++;
            if(word.toLowerCase().contains("book") || word.toLowerCase().contains("pen")) containsBookOrPen++;
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("Elements starts with uppercase = " + startsWithUppercase);
        System.out.println("Elements starts with lowercase = " + startsWithLowercase);
        System.out.println("Elements starting with B or P = " + startsWithBorP);
        System.out.println("Elements having ”book” or “pen”= " + containsBookOrPen);
    }

    public static void task_10() {
        /**
         * -Create an int array that stores numbers below
         * 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
         *
         * THEN:
         * -Print the entire array
         * -Print how many elements are more than 10
         * -Print how many elements are less than 10
         * -Print how many elements are 10
         *
         * Expected Result:
         * [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
         * Elements that are more than 10 = 5
         * Elements that are less than 10 = 4
         * Elements that are 10 = 2
         */

        int[] nums = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int greaterThanTen = 0;
        int lessThanTen = 0;
        int exact10 = 0;

        for(int num : nums) {
            if(num == 10) {
                exact10++;
            } else if(num > 10) {
                greaterThanTen++;
            } else if(num < 10) {
                lessThanTen++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(greaterThanTen);
        System.out.println(lessThanTen);
        System.out.println(exact10);
    }

    public static void task_11() {
        /**
         * -Create 2 int arrays that stores numbers below
         * First -> 5, 8, 13, 1, 2
         * Second -> 9, 3, 67, 1, 0
         *
         * THEN:
         * -Print both arrays
         * –Then, create a new array called that will take greatest of
         * same index from first 2 arrays
         * -Print third array as well
         *
         * Expected Result:
         * 1st array is =  [5, 8, 13, 1, 2]
         * 2nd array is = [9, 3, 67, 1, 0]
         * 3rd array is =  [9, 8, 67, 1, 2]
         */

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[first.length];

        for(int i = 0; i < first.length; i++) {
            third[i] = Math.max(first[i], second[i]);
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));
    }
}
