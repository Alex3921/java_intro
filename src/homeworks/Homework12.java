package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\n------------------------noDigits------------------------\n");
        String str1 = "\"\"";
        System.out.println("Test data 1: " + str1);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: " + noDigit(str1) + "\n");

        String str2 = "Java";
        System.out.println("Test data 2: " + str2);
        System.out.println("Expected output: Java");
        System.out.println("Actual output: " + noDigit(str2) + "\n");

        String str3 = "123Hello";
        System.out.println("Test data 3: " + str3);
        System.out.println("Expected output: Hello");
        System.out.println("Actual output: " + noDigit(str3) + "\n");

        String str4 = "123Hello World149";
        System.out.println("Test data 4: " + str4);
        System.out.println("Expected output: Hello World");
        System.out.println("Actual output: " + noDigit(str4) + "\n");

        String str5 = "123Tech456Global149";
        System.out.println("Test data 5: " + str5);
        System.out.println("Expected output: TechGlobal");
        System.out.println("Actual output: " + noDigit(str5) + "\n");

        System.out.println("\n------------------------noVowel------------------------\n");
        String str6 = "\"\"";
        System.out.println("Test data 1: " + str6);
        System.out.println("Expected output: \"\"");
        System.out.println("Actual output: " + noVowel(str6) + "\n");

        String str7 = "xyz";
        System.out.println("Test data 2: " + str7);
        System.out.println("Expected output: xyz");
        System.out.println("Actual output: " + noVowel(str7) + "\n");

        String str8 = "JAVA";
        System.out.println("Test data 3: " + str8);
        System.out.println("Expected output: JV");
        System.out.println("Actual output: " + noVowel(str8) + "\n");

        String str9 = "125$";
        System.out.println("Test data 4: " + str9);
        System.out.println("Expected output: 125$");
        System.out.println("Actual output: " + noVowel(str9) + "\n");

        String str10 = "TechGlobal";
        System.out.println("Test data 5: " + str10);
        System.out.println("Expected output: TchGlbl");
        System.out.println("Actual output: " + noVowel(str10) + "\n");

        System.out.println("\n------------------------hasUpperCase------------------------\n");
        String str11 = "\"\"";
        System.out.println("Test data 1: " + str11);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasUpperCase(str11) + "\n");

        String str12 = "java";
        System.out.println("Test data 2: " + str12);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasUpperCase(str12) + "\n");

        String str13 = "John’s age is 29";
        System.out.println("Test data 3: " + str13);
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + hasUpperCase(str13) + "\n");

        String str14 = "$125.0";
        System.out.println("Test data 4: " + str14);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasUpperCase(str14) + "\n");

        System.out.println("\n------------------------middleInt------------------------\n");
        System.out.println("Test data 1: 1, 1, 1");
        System.out.println("Expected output: 1");
        System.out.println("Actual output: " + middleInt(1, 1, 1) + "\n");

        System.out.println("Test data 2: 1, 2, 2");
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + middleInt(1, 2, 2) + "\n");

        System.out.println("Test data 3: 5, 5, 8");
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + middleInt(5, 5, 8) + "\n");

        System.out.println("Test data 4: 5, 3, 5");
        System.out.println("Expected output: 5");
        System.out.println("Actual output: " + middleInt(5, 3, 5) + "\n");

        System.out.println("Test data 5: -1, 25, 10");
        System.out.println("Expected output: 10");
        System.out.println("Actual output: " + middleInt(-1, 25, 10) + "\n");

        System.out.println("\n------------------------no13------------------------\n");
        int[] arr1 = {1, 2, 3, 4};
        System.out.println("Test data 1: {1, 2, 3, 4}");
        System.out.println("Expected output: {1, 2, 3, 4}");
        System.out.println("Actual output: " + Arrays.toString(no13(arr1)) + "\n");

        int[] arr2 = {13, 2, 3};
        System.out.println("Test data 2: {13, 2, 3}");
        System.out.println("Expected output: {0, 2, 3}");
        System.out.println("Actual output: " + Arrays.toString(no13(arr2)) + "\n");

        int[] arr3 = {13, 13, 13, 13, 13};
        System.out.println("Test data 3: {13, 13, 13, 13, 13}");
        System.out.println("Expected output: {0, 0, 0, 0, 0}");
        System.out.println("Actual output: " + Arrays.toString(no13(arr3)) + "\n");

        System.out.println("\n------------------------arrFactorial------------------------\n");
        int[] arr4 = {1, 2, 3, 4};
        System.out.println("Test data 1: {1, 2, 3, 4}");
        System.out.println("Expected output: {1, 2, 6, 24}");
        System.out.println("Actual output: " + Arrays.toString(arrFactorial(arr4)) + "\n");

        int[] arr5 = {0, 5};
        System.out.println("Test data 2: {0, 5}");
        System.out.println("Expected output: {1, 120}");
        System.out.println("Actual output: " + Arrays.toString(arrFactorial(arr5)) + "\n");

        int[] arr6 = {5, 0, 6};
        System.out.println("Test data 3: {5, 0, 6}");
        System.out.println("Expected output: {120, 1, 720}");
        System.out.println("Actual output: " + Arrays.toString(arrFactorial(arr6)) + "\n");

        int[] arr7 = {};
        System.out.println("Test data 4: {}");
        System.out.println("Expected output: {}");
        System.out.println("Actual output: " + Arrays.toString(arrFactorial(arr7)) + "\n");

        System.out.println("\n------------------------categorizeCharacters------------------------\n");
        String str15 = "     ";
        System.out.println("Test data 1: \"     \"");
        System.out.println("Expected output: [ , , ]");
        System.out.println("Actual output: " + Arrays.toString(categorizeCharacters(str15)) + "\n");

        String str16 = "abc123$#%";
        System.out.println("Test data 2: \"abc123$#%\"");
        System.out.println("Expected output: [abc, 123, $#%]");
        System.out.println("Actual output: " + Arrays.toString(categorizeCharacters(str16)) + "\n");

        String str17 = "12ab$%3c%";
        System.out.println("Test data 3: \"12ab$%3c%\"");
        System.out.println("Expected output: [abc, 123, $%%]");
        System.out.println("Actual output: " + Arrays.toString(categorizeCharacters(str17)) + "\n");
    }

    public static String noDigit(String s) {
        /**
         *-Create a method called noDigit()
         * -This method will take one String argument and it will
         * return a new String with all digits removed from the
         * original String
         */
        return s.replaceAll("\\d", "");
    }

    public static String noVowel(String s) {
        /**
         Requirement:
         -Create a method called noVowel()
         -This method will take one String argument and it will
         return a new String with all vowels removed from the
         original String
         */
        return s.replaceAll("[aeiouAEIOU]", "");
    }

    public static boolean hasUpperCase(String s) {
        /**
         -Create a method called hasUpperCase()
         -This method will take one String argument and it will return boolean
         true if there is an uppercase letter and false otherwise.
         */
        return s.matches(".*[A-Z].*");
    }

    public static int middleInt(int a, int b, int c) {
        /**
         Requirement:
         -Create a method called middleInt()
         -This method will take three int arguments and it will return the middle
         */
        // check if a is the middle int
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return a;
        }
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            return b;
        }
        else {
            return c;
        }
    }

    public static int[] no13(int[] arr) {
        /**
         Requirement:
         -Create a method called no13()
         -This method will take an int array as argument and it will return a new
         array with all 13 replaced with 0.
         NOTE: Assume length will always be more than zero.
         */
        int[] no13 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {
                no13[i] = 0;
            } else {
                no13[i] = arr[i];
            }
        }

        return no13;
    }

    public static int calculateFactorial(int num) {
        // if the given number is 0 or 1, return 1 (0! and 1! equal 1)
        if (num == 0 || num == 1) {
            return 1;
        }

        // create a variable to store the result of the factorial
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static int[] arrFactorial(int[] arr) {
        /**
         Requirement:
         -Create a method called arrFactorial()
         -This method will take an int array as argument and it will return the
         array with every number replaced with their factorials.
         NOTE: If given array is empty, then return it back empty.
         NOTE: 0! equals to 1
         */
        if (arr.length == 0) {
            return arr;
        }

        int[] arrFactorial = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrFactorial[i] = calculateFactorial(arr[i]);
        }

        return arrFactorial;
    }

    public static String[] categorizeCharacters(String str) {
        /**
         Requirement:
         -Create a method called categorizeCharacters()
         -This method will take String as an argument and return a String array as
         letters at index of 0, digits at index of 1 and specials at index of 2.
         NOTE: IGNORE SPACES
         NOTE: Assume length will always be more than zero.
         */
        // create three empty strings to store the letters, digits, and specials in the string
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specials = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
            else if (Character.isDigit(c)) {
                digits.append(c);
            }
            else if (!Character.isWhitespace(c)){
                specials.append(c);
            }
        }

        // return the three strings containing the letters, digits, and specials in the string as an array
        return new String[]{letters.toString(), digits.toString(), specials.toString()};
    }
}
