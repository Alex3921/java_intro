package first_package;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(findLastIndexOf("Alexandru", 'u'));
//        System.out.println(clearChar("I love java", 'a'));
//        System.out.println(clearWord("I love java", "av"));
//        System.out.println(frontAndBack("abxxxab"));
                System.out.println(17 / 5);
    }

    public static int findLastIndexOf(String s, char c) {
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }

    public static String clearChar(String s, char c) {
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c) {
                result += s.charAt(i);
            }
        }

        return result;
    }

    public static String clearWord(String word1, String word2) {
        String newWord = "";

        for(int i = 0; i < word1.length(); i++) {
            if(!word1.substring(i).startsWith(word2)) {
                newWord += word1.charAt(i);
            } else {
                i += word2.length() - 1;
            }
        }

        return newWord;
    }

    public static String frontAndBack(String string) {
        String result = "";

        for(int i = 0; i < (string.length() / 2 - 1); i++) {
            if(string.endsWith(string.substring(0, i + 1))) {
                result = string.substring(0, i + 1);
            }
        }

        return result;
    }
}
