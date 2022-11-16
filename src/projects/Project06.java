package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("\n------------------------Task 01------------------------\n");
        String[] arr = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println("Test data: " + Arrays.toString(arr));
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + countMultipleWords(arr));

        System.out.println("\n------------------------Task 02------------------------\n");
        ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println("Test data: " + Arrays.toString(test1.toArray()));
        System.out.println("Expected output: [2, 6, 7, 0, 15]");
        System.out.println("Actual output: " + removeNegatives(test1));

        System.out.println("\n------------------------Task 03------------------------\n");
        System.out.println("Test data 1: \" \"");
        System.out.println("Expected output 1: false");
        System.out.println("Actual output: " + validatePassword(" ") + "\n");
        System.out.println("Test data 2: abcd");
        System.out.println("Expected output 2: false");
        System.out.println("Actual output: " + validatePassword("abcd") + "\n");
        System.out.println("Test data 3: abcd1234");
        System.out.println("Expected output 3: false");
        System.out.println("Actual output: " + validatePassword("abcd1234") + "\n");
        System.out.println("Test data 4: Abcd1234");
        System.out.println("Expected output 4: false");
        System.out.println("Actual output: " + validatePassword("Abcd1234") + "\n");
        System.out.println("Test data 5: Abcd123!");
        System.out.println("Expected output 5: true");
        System.out.println("Actual output: " + validatePassword("Abcd123!") + "\n");

        System.out.println("\n------------------------Task 04------------------------\n");
        System.out.println("Test data 1: a@gmail.com");
        System.out.println("Expected output 1: false");
        System.out.println("Actual output: " + validateEmailAddress("a@gmail.com") + "\n");
        System.out.println("Test data 2: abc@g.com");
        System.out.println("Expected output 2: false");
        System.out.println("Actual output: " + validateEmailAddress("abc@g.com") + "\n");
        System.out.println("Test data 3: abc@gmail.c");
        System.out.println("Expected output 3: false");
        System.out.println("Actual output: " + validateEmailAddress("abc@gmail.c") + "\n");
        System.out.println("Test data 4: abc@@gmail.com");
        System.out.println("Expected output 4: false");
        System.out.println("Actual output: " + validateEmailAddress("abc@@gmail.com") + "\n");
        System.out.println("Test data 5: abcd@gmail.com");
        System.out.println("Expected output 5: true");
        System.out.println("Actual output: " + validateEmailAddress("abcd@gmail.com") + "\n");
    }

    public static int countMultipleWords(String[] arr) {
        /**
         *  TASK-1 - countMultipleWords() method
         * Write a method that takes a String[] array as an argument and counts
         *  how many strings in the array has multiple words
         * This method will return an int which is the count of multiple words
         * NOTE: be careful about these as they are not multiple words ->"",    "   ",
         *  "    abc",  "abc   "
         *  Test data:
         *  ["foo", "", " ", "foo bar", "java is fun", " ruby "]
         *  Expected output:
         *  2
         */
        Pattern pattern = Pattern.compile("(?i)\\b[a-z]+\\b");

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            int temp = 0;

            while(matcher.find()) {
                temp++;
            }

            if(temp > 1) count++;
        }

        return count;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        /**
         * TASK-2 - removeNegatives() method
         * •Write a method that takes an "ArrayList<Integer> numbers" as an
         * argument and removes all negative numbers from the given list if there
         * are any
         * •This method will return an ArrayList with removed negatives
         */
        numbers.removeIf(n -> n < 0);

        return numbers;
    }

    public static boolean validatePassword(String password) {
        /**
         *validatePassword() method
         * •Write a method that takes a "String password" as an argument and
         * checks if the given password is valid or not
         * •This method will return true if given password is valid, or false if given
         * password is not valid
         * •A VALID PASSWORD:
         * -should have length of 8 to 16 (length of 7 or 17 should return false)
         * -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special
         * char
         * -should NOT have any space
         */

//         Method 1
//        boolean validLength = password.length() >= 8 && password.length() <= 16;
//        boolean hasDigit = password.matches(".*[0-9].*");
//        boolean hasUppercase = password.matches(".*[A-Z].*");
//        boolean hasLowercase = password.matches(".*[a-z].*");
//        boolean hasSpecialCharacter = password.matches(".+[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");

//        return (validLength && hasDigit && hasUppercase && hasLowercase && hasSpecialCharacter);

//         Method 2
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9])(?!.+\\s).{8,16}$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static boolean validateEmailAddress(String email) {
        /**
         * TASK-4 - validateEmailAddress() method
         * •Write a method that takes a "String email" as an argument and checks if
         * the given email is valid or not
         * •This method will return true if given email is true, or false if given email is
         * not valid
         * •A VALID EMAIL:
         * -should NOT have any space
         * -should not have more than one "@" character
         * -should be in the given format <2+chars>@<2+chars>.<2+chars>
         */
        Pattern pattern = Pattern.compile("\\w{2,}@\\w{2,}\\.\\S{2,}");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
