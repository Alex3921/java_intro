package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("\n------------------------Task 01------------------------\n");
        System.out.println("Number of consonants in \"hello\": "  + countConsonants("hello"));
        System.out.println("Number of consonants in \"JAVA\":  "   + countConsonants("JAVA"));
        System.out.println("Number of consonants in \"\":      "       + countConsonants(""));

        System.out.println("\n------------------------Task 02------------------------\n");
        System.out.println("The words in \"java  is    fun\" are: " + wordArray("java  is    fun"));
        System.out.println("The words in \"Hello, nice to meet you !!\" are: " + wordArray("Hello, nice to meet you!!"));

        System.out.println("\n------------------------Task 03------------------------\n");
        System.out.println("Removed extra spaces:");
        System.out.println(removeExtraSpaces("java  is    fun"));
        System.out.println(removeExtraSpaces("Hello,    nice to   meet     you!!"));

        System.out.println("\n------------------------Task 04------------------------\n");
        System.out.println("Test sentence: I go to TechGlobal");
        System.out.println("Number of words length 3 or less: " + count3OrLess("I go to TechGlobal") + "\n");
        System.out.println("Test sentence: Hi, my name is John Doe");
        System.out.println("Number of words length 3 or less: " + count3OrLess("Hi, my name is John Doe") + "\n");

        System.out.println("\n------------------------Task 05------------------------\n");
        ArrayList<String> dobList = new ArrayList<String>(
                Arrays.asList("01/21/1999","1/20/1991","10/2/1991","12-20 2000","12/16/19500"));
        for(String dob : dobList) {
            System.out.println("Test dob is: " + dob);
            System.out.println("Valid: " + isDateFormatValid(dob) + "\n");
        }

        System.out.println("\n------------------------Task 06------------------------\n");
        ArrayList<String> emailList = new ArrayList<String>(
                Arrays.asList("abc@gmail.com", "abc@student.techglobal.com", "a@gmail.com", "abcd@@gmail.com", "abc@gmail"));
        for(String email : emailList) {
            System.out.println("Test email is: " + email);
            System.out.println("Valid format: " + isEmailFormatValid(email) + "\n");
        }
    }

    public static int countConsonants(String str) {
        /**
         *Write a method named countConsonants() that takes a
         * String as an argument a returns how many consonants
         * are in the String.
         * NOTE: You must use regex
         * Example program1:
         * String str = "hello";
         * Program: 3
         * Example program2:
         * String str = "JAVA";
         * Program: 2
         * Example program2:
         * String str = "";
         * Program: 0
         */

        // Regex will match everything except: a, e, i, o, u, whitespace, digits, special characters
        Pattern pattern = Pattern.compile("(?i)[^aeiou\\s\\d\\W]");
        Matcher matcher = pattern.matcher(str);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static String wordArray(String str) {
        /**
         * Write a method named wordArray() that takes a String
         * as an argument a returns a String array with all the
         * words in the String
         * NOTE: Make as dynamic as possible.
         * Example program1:
         * String str = "hello";
         * Program: [hello]
         * Example program2:
         * String str = "java  is    fun";
         * Program: [java, is, fun]
         * Example program2:
         * String str = "Hello, nice to meet you!!";
         * Program: [Hello, nice, to, meet, you]
         */

        Pattern pattern = Pattern.compile("(?i)\\w+");
        Matcher matcher = pattern.matcher(str);

        ArrayList<String> wordList = new ArrayList<String>();

        while (matcher.find()) {
            wordList.add(matcher.group());
        }

        return Arrays.toString(wordList.toArray());
    }

    public static String removeExtraSpaces(String str) {
        /**
         * Write a method named removeExtraSpaces() that takes
         * a String as an argument a returns the String back with
         * all extra spaces removed.
         * NOTE: Make sure you use regex
         * Example program1:
         * String str = “hello”;
         * Program: hello
         * Example program2:
         * String str = “java  is    fun”;
         * Program: java is fun
         * Example program2:
         * String str = “Hello,    nice to   meet     you!!”;
         * Program: Hello, nice to meet you!!
         */

        return str.replaceAll("\\s+", " ");
    }

    public static int count3OrLess(String str) {
        /**
         * Write a method named count3OrLess() that asks the
         * user to enter a sentence. Return a count of how many
         * words are 3 characters long or less.
         * NOTE: You must use regex
         * Example program1:
         * String str = “I go to TechGlobal”;
         * Program: 3
         * Example program2:
         * String str = “Hi, my name is John Doe”;
         * Program: 4
         * Example program2:
         * String str = “Hello guys”;
         * Program: 0
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a sentence:");
        String input = str;

        Pattern pattern = Pattern.compile("\\b\\w{1,3}\\b");
        Matcher matcher = pattern.matcher(input);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static boolean isDateFormatValid(String dateOfBirth) {
        /**
         * Write a method named isDateFormatValid() that takes a
         * String dateOfBirth as an argument and checks if the given
         * date matches the given DOB requirements.
         * This method would return a true or false boolean
         * Format: nn/nn/nnnn
         * Example program1:
         * String dateOfBirth = “01/21/1999”;
         * Program: true
         * Example program2:
         * String dateOfBirth = “1/20/1991”;
         * Program: false
         * Example program3:
         * String dateOfBirth = “10/2/1991”;
         * Program: false
         * Example program4:
         * String dateOfBirth = “12-20 2000”;
         * Program: false
         * Example program5:
         * String dateOfBirth = “12/16/19500”;
         * Program: false
         */

        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matcher = pattern.matcher(dateOfBirth);

        return matcher.matches();
    }

    public static boolean isEmailFormatValid(String email) {
        /**
         * Write a method named isEmailFormatValid() that takes a String
         * email as an argument and checks if the given email matches
         * the given email requirements.
         * This method would return a true or false boolean.
         * Format: <2+chars>@<2+chars>.<2+chars>
         * NOTE: Do not use any type of loop. Use Regex
         * Example program1:
         * String email = “abc@gmail.com”;
         * Program: true
         * Example program2:
         * String email = “abc@student.techglobal.com”;
         * Program: true
         * Example program3:
         * String email = “a@gmail.com”;
         * Program: false
         * Example program4:
         * String email = “abcd@@gmail.com”;
         * Program: false
         * Example program5:
         * String email = “abc@gmail”;
         * Program: false
         */
        Pattern pattern = Pattern.compile("\\w{2,}@\\w{2,}\\.\\S{2,}");
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
