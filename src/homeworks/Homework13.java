package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\n------------------------hasLowerCase------------------------\n");
        String hasLowerCaseTest1 = "";
        System.out.println("Test data 1: " + hasLowerCaseTest1);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasLowerCase(hasLowerCaseTest1) + "\n");

        String hasLowerCaseTest2 = "JAVA";
        System.out.println("Test data 2: " + hasLowerCaseTest2);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasLowerCase(hasLowerCaseTest2) + "\n");

        String hasLowerCaseTest3 = "125$";
        System.out.println("Test data 3: " + hasLowerCaseTest3);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + hasLowerCase(hasLowerCaseTest3) + "\n");

        String hasLowerCaseTest4 = "hello";
        System.out.println("Test data 4: " + hasLowerCaseTest4);
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + hasLowerCase(hasLowerCaseTest4) + "\n");

        System.out.println("\n------------------------noZero------------------------\n");
        ArrayList<Integer> noZeroTest1 = new ArrayList<>(Arrays.asList(1));
        System.out.println("Test data 1: " + noZeroTest1);
        System.out.println("Expected output: [1]");
        System.out.println("Actual output: " + noZero(noZeroTest1) + "\n");

        ArrayList<Integer> noZeroTest2 = new ArrayList<>(Arrays.asList(1,1,10));
        System.out.println("Test data 2: " + noZeroTest2);
        System.out.println("Expected output: [1, 1, 10]");
        System.out.println("Actual output: " + noZero(noZeroTest2) + "\n");

        ArrayList<Integer> noZeroTest3 = new ArrayList<>(Arrays.asList(0,1,10));
        System.out.println("Test data 3: " + noZeroTest3);
        System.out.println("Expected output: [1, 10]");
        System.out.println("Actual output: " + noZero(noZeroTest3) + "\n");

        ArrayList<Integer> noZeroTest1noZeroTest4 = new ArrayList<>(Arrays.asList(0,0,0));
        System.out.println("Test data 4: " + noZeroTest1noZeroTest4);
        System.out.println("Expected output: []");
        System.out.println("Actual output: " + noZero(noZeroTest1noZeroTest4) + "\n");

        System.out.println("\n------------------------numberAndSquare------------------------\n");
        int[] test1 = {1, 2, 3};
        System.out.println("Test data 1: " + Arrays.toString(test1));
        System.out.println("Expected output: [[1, 1], [2, 4], [3, 9]]");
        System.out.println("Actual output: " + Arrays.deepToString(numberAndSquare(test1)));

        int[] test2 = {0, 3, 6};
        System.out.println("\nTest data 2: " + Arrays.toString(test2));
        System.out.println("Expected output: [[0, 0], [3, 9], [6, 36]]");
        System.out.println("Actual output: " + Arrays.deepToString(numberAndSquare(test2)));

        int[] test3 = {1, 4};
        System.out.println("\nTest data 3: " + Arrays.toString(test3));
        System.out.println("Expected output: [[1, 1], [4, 16]]");
        System.out.println("Actual output: " + Arrays.deepToString(numberAndSquare(test3)));

        System.out.println("\n------------------------containsValue------------------------\n");
        String[] containsValueTest1 = {"abc", "foo", "java"};
        String value1 = "hello";
        System.out.println("Test data 1: " + Arrays.toString(containsValueTest1) + ", " + value1);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + containsValue(containsValueTest1, value1) + "\n");

        String[] containsValueTest2 = {"abc", "def", "123"};
        String value2 = "Abc";
        System.out.println("Test data 2: " + Arrays.toString(containsValueTest2) + ", " + value2);
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + containsValue(containsValueTest2, value2) + "\n");

        String[] containsValueTest3 = {"abc", "def", "123", "Java", "Hello"};
        String value3 = "123";
        System.out.println("Test data 3: " + Arrays.toString(containsValueTest3) + ", " + value3);
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + containsValue(containsValueTest3, value3) + "\n");

        System.out.println("\n------------------------reverseSentence------------------------\n");
        String reverseSentenceTest1 = "Hello";
        System.out.println("Test data 1: " + reverseSentenceTest1);
        System.out.println("Expected output: There is not enough words!");
        System.out.println("Actual output: " + reverseSentence(reverseSentenceTest1) + "\n");

        String reverseSentenceTest2 = "Java is fun";
        System.out.println("Test data 2: " + reverseSentenceTest2);
        System.out.println("Expected output: Fun is java");
        System.out.println("Actual output: " + reverseSentence(reverseSentenceTest2) + "\n");

        String reverseSentenceTest3 = "This is A sentence";
        System.out.println("Test data 3: " + reverseSentenceTest3);
        System.out.println("Expected output: Sentence A is this");
        System.out.println("Actual output: " + reverseSentence(reverseSentenceTest3) + "\n");

        System.out.println("\n------------------------removeStringSpecialsDigits------------------------\n");
        String removeStringSpecialsDigitsTest1 = "123Java #$%is fun";
        System.out.println("Test data 1: " + removeStringSpecialsDigitsTest1);
        System.out.println("Expected output: Java is fun");
        System.out.println("Actual output: " + removeStringSpecialsDigits(removeStringSpecialsDigitsTest1) + "\n");

        String removeStringSpecialsDigitsTest2 = "Selenium";
        System.out.println("Test data 2: " + removeStringSpecialsDigitsTest2);
        System.out.println("Expected output: Selenium");
        System.out.println("Actual output: " + removeStringSpecialsDigits(removeStringSpecialsDigitsTest2) + "\n");

        String removeStringSpecialsDigitsTest3 = "Selenium 123#$%Cypress";
        System.out.println("Test data 3: " + removeStringSpecialsDigitsTest3);
        System.out.println("Expected output: Selenium Cypress");
        System.out.println("Actual output: " + removeStringSpecialsDigits(removeStringSpecialsDigitsTest3) + "\n");

        System.out.println("\n------------------------removeArraySpecialsDigits------------------------\n");
        String[] removeArraySpecialsDigitsTest1 = {"123Java", "#$%is", "fun"};
        System.out.println("Test data 1: " + Arrays.toString(removeArraySpecialsDigitsTest1));
        System.out.println("Expected output: [Java, is, fun]");
        System.out.println("Actual output: " + Arrays.toString(removeArraySpecialsDigits(removeArraySpecialsDigitsTest1)) + "\n");

        String[] removeArraySpecialsDigitsTest2 = {"Selenium", "123$%", "###"};
        System.out.println("Test data 2: " + Arrays.toString(removeArraySpecialsDigitsTest2));
        System.out.println("Expected output: [Selenium, , ]");
        System.out.println("Actual output: " + Arrays.toString(removeArraySpecialsDigits(removeArraySpecialsDigitsTest2)) + "\n");

        String[] removeArraySpecialsDigitsTest3 = {"Selenium", "123#$%Cypress"};
        System.out.println("Test data 3: " + Arrays.toString(removeArraySpecialsDigitsTest3));
        System.out.println("Expected output: [Selenium, Cypress]");
        System.out.println("Actual output: " + Arrays.toString(removeArraySpecialsDigits(removeArraySpecialsDigitsTest3)) + "\n");

        System.out.println("\n------------------------removeAndReturnCommons------------------------\n");
        ArrayList<String> removeAndReturnCommonsTest1List1 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String> removeAndReturnCommonsTest1List2 = new ArrayList<>(Arrays.asList("abc", "xyz", "123"));
        System.out.println("Test data 1: list1 = " + removeAndReturnCommonsTest1List1 + ", list2 = " + removeAndReturnCommonsTest1List2);
        System.out.println("Expected output: []");
        System.out.println("Actual output: " + removeAndReturnCommons(removeAndReturnCommonsTest1List1, removeAndReturnCommonsTest1List2) + "\n");

        ArrayList<String> removeAndReturnCommonsTest2List1 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        ArrayList<String> removeAndReturnCommonsTest2List2 = new ArrayList<>(Arrays.asList("Java", "C#", "Python"));
        System.out.println("Test data 2: list1 = " + removeAndReturnCommonsTest2List1 + ", list2 = " + removeAndReturnCommonsTest2List2);
        System.out.println("Expected output: [Java]");
        System.out.println("Actual output: " + removeAndReturnCommons(removeAndReturnCommonsTest2List1, removeAndReturnCommonsTest2List2) + "\n");

        ArrayList<String> removeAndReturnCommonsTest3List1 = new ArrayList<>(Arrays.asList("Java", "C#", "C#"));
        ArrayList<String> removeAndReturnCommonsTest3List2 = new ArrayList<>(Arrays.asList("Python", "C#", "C++"));
        System.out.println("Test data 3: list1 = " + removeAndReturnCommonsTest3List1 + ", list2 = " + removeAndReturnCommonsTest3List2);
        System.out.println("Expected output: [C#]");
        System.out.println("Actual output: " + removeAndReturnCommons(removeAndReturnCommonsTest3List1, removeAndReturnCommonsTest3List2) + "\n");

        System.out.println("\n------------------------noXInVariables------------------------\n");
        ArrayList<String> noXInVariablesTest1 = new ArrayList<>(Arrays.asList("abc", "123", "#$%"));
        System.out.println("Test data 1: " + noXInVariablesTest1);
        System.out.println("Expected output: [abc, 123, #$%]");
        System.out.println("Actual output: " + noXInVariables(noXInVariablesTest1) + "\n");

        ArrayList<String> noXInVariablesTest2 = new ArrayList<>(Arrays.asList("xyz", "123", "#$%"));
        System.out.println("Test data 2: " + noXInVariablesTest2);
        System.out.println("Expected output: [yz, 123, #$%]");
        System.out.println("Actual output: " + noXInVariables(noXInVariablesTest2) + "\n");

        ArrayList<String> noXInVariablesTest3 = new ArrayList<>(Arrays.asList("x", "123", "#$%"));
        System.out.println("Test data 3: " + noXInVariablesTest3);
        System.out.println("Expected output: [123, #$%]");
        System.out.println("Actual output: " + noXInVariables(noXInVariablesTest3) + "\n");

        ArrayList<String> noXInVariablesTest4 = new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"));
        System.out.println("Test data 4: " + noXInVariablesTest4);
        System.out.println("Expected output: [yyy, ABC]");
        System.out.println("Actual output: " + noXInVariables(noXInVariablesTest4) + "\n");
    }

    public static boolean hasLowerCase(String str) {
        /**
         Requirement:
         -Create a method called hasLowerCase()
         -This method will take a String argument, and it will
         return boolean true if there is lowercase letter and false
         if it doesn’t.
         */
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> noZero(ArrayList<Integer> list) {
        /**
         Requirement:
         -Create a method called noZero()
         -This method will take one Integer ArrayList argument
         and it will return an ArrayList with all zeros removed
         from the original Integer ArrayList.
         NOTE: Assume that ArrayList size will be at least 1.
         */
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i != 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static int[][] numberAndSquare(int[] arr) {
        /**
         Requirement:
         -Create a method called numberAndSquare()
         -This method will take an int array argument and it will
         return a multidimensional array with all numbers
         squared.
         NOTE: Assume that array size is at least 1.
         */
        int[][] result = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            result[i][0] = arr[i];
            result[i][1] = arr[i] * arr[i];
        }
        return result;
    }

    public static boolean containsValue(String[] arr, String value) {
        /**
         -Create a method called containsValue()
         -This method will take a String array and a String
         argument, and it will return a boolean. Search the
         variable inside of the array and return true if it exists in
         the array. If it doesn’t exist, return false.
         NOTE: Assume that array size is at least 1.
         NOTE: The method is case-sensitive
         Hint: Use binarySearch() for easy solution
         */
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, value);
        return index >= 0;
    }

    public static String reverseSentence(String str) {
        /**
         Requirement:
         -Create a method called reverseSentence()
         -This method will take a String argument and it will
         return a String with changing the place of every word.
         All words should be in reverse order. Make sure that there
         are two words inside the sentence at least. If there is no
         two words return “There is not enough words!”.
         NOTE: After you reverse, only first letter must be
         uppercase and the rest will be lowercase!
         Hint: Use split() for easy solution
         Note: Make the new first word’s first letter upper case
         and make the old first word’s first letter lower case
         */

        // Split the string into an array of words
        String[] words = str.split(" ");
        // Check if there are at least two words
        if (words.length < 2) {
            return "There is not enough words!";
        }

        // Reverse the array of words
        String result = "";
        for (int i = words.length-1; i >= 0; i--) {
            if(i == words.length-1) {
                result += words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            } else {
                result += i == 0 ? words[i].toLowerCase() : words[i];
            }

            if(i != 0) {
                result += " ";
            }
        }
        return result;
    }

    public static String removeStringSpecialsDigits(String str) {
        /**
         Requirement:
         -Create a method called removeStringSpecialsDigits()
         -This method will take a String as argument, and it will
         return a String without the special characters or digits.
         NOTE: Assume that String length is at least 1.
         NOTE: Do not remove spaces.
         */
        // Use a regular expression to remove all special characters and digits from the string
        return str.replaceAll("[^A-Za-z\\s]", "");
    }

    public static String[] removeArraySpecialsDigits(String[] arr) {
        /**
         Requirement:
         -Create a method called removeArraySpecialsDigits()
         -This method will take a String array as argument, and
         it will return a String array without the special
         characters or digits from the elements.
         NOTE: Assume that array size is at least 1.
         */
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // Use a regular expression to remove all special characters and digits from the string
            result[i] = arr[i].replaceAll("[^A-Za-z\\s]", "");
        }
        return result;
    }

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list1, ArrayList<String> list2) {
        /**
         Requirement:
         -Create a method called removeAndReturnCommons()
         -This method will take two String ArrayList and it will
         return all the common words as String ArrayList.
         NOTE: Assume that both ArrayList sizes are at least 1.
         */
        // Create a new ArrayList to store the common elements
        ArrayList<String> commons = new ArrayList<>();
        // Loop through the elements of list1
        for (String element : list1) {
            // If the element exists in list2, add it to commons and remove it from list2
            if (list2.contains(element)) {
                commons.add(element);
                list2.remove(element);
            }
        }
        return commons;
    }

    public static ArrayList<String> noXInVariables(ArrayList<String> list) {
        /**
         Requirement:
         -Create a method called noXInVariables()
         -This method will take an ArrayList argument, and it will
         return an ArrayList with all the x or X removed from
         elements.
         If the element itself equals to x or X or contains only x
         letters, then remove that element.
         NOTE: Assume that ArrayList size is at least 1.
         */
        ArrayList<String> result = new ArrayList<>();
        for (String element : list) {
            // If the element contains only X or x, skip it
            if (element.equals("X") || element.equals("x")) continue;

            // Replace all X or x with empty string
            element = element.replaceAll("[Xx]", "");

            // If element contains only x letter skip it
            if(element.equals("")) continue;

            // Add the modified element to the result list
            result.add(element);
        }
        return result;
    }
}
