package projects;

import sun.invoke.empty.Empty;

public class Project01 {
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
    }

    public static void task_01() {
        /**
         * -Store your name in a String variable called name
         * -Print the variable with a proper message
         * -EX/ My name is = name
         * NOTE: Uppercases, lowercases and spaces are important
         */

        String fullName, output;

        fullName = "Alex Boncut";

        System.out.println("My name is " + fullName + ".");
    }

    public static void task_02() {
        /**
         * -Create different char variables for each of your name letter and store them in separate variables as
         * nameCharacter1, nameCharacter2 and so on.
         * -Print variables with proper messages
         * -EX/Name letter 1 is = nameCharacter1
         *         Name letter 2 is = nameCharacter2
         */

        String fullName = "ALEXANDRU BONCUT";
        byte letterNumber = 1;
        byte charPosition = 0;

        while(charPosition < fullName.length()) {
            if(fullName.charAt(charPosition) == ' ') {
                System.out.println("\n");
                charPosition++;
                continue;
            };

            System.out.println(String.format("Name letter %s is = %s", letterNumber, fullName.charAt(charPosition++)));
            letterNumber++;
        }
    }


    public static void task_03() {
        /**
         * -Create different String variables to store info like myFavMovie, myFavSong, myFavCity, myFavActivity,
         * myFavSnack.
         * -Print variables with proper messages
         * -EX/My favorite movie is = myFavMovie
         */

        String myFavMovie = "Batman";
        String myFavSong = "Yabadabadoo";
        String myFavCity = "Chicago";
        String myFavActivity = "Soccer";
        String myFavSnack = "PB&J";

        System.out.println("My favorite movie is " + myFavMovie);
        System.out.println("My favorite song is " + myFavSong);
        System.out.println("My favorite city is " + myFavCity);
        System.out.println("My favorite activity is " + myFavActivity);
        System.out.println("My favorite snack is " + myFavSnack);
    }


    public static void task_04() {
        /**
         * -Create different int variables to store info like myFavNumber, numberOfStatesIVisited,
         * numberOfCountriesIVisited.
         * -Print variables with proper messages
         * -EX/My favorite number is = myFavNumber
         */

        int myFavNumber = 10;
        int numberOfStatesIVisited = 32;
        int numberOfCountriesIVisited = 22;

        System.out.println("My favorite number is " + myFavNumber + ".");
        System.out.println("I have visited " + numberOfStatesIVisited + " states.");
        System.out.println("I have visited " + numberOfCountriesIVisited + " countries.");
    }


    public static void task_05() {
        /**
         * -Create a boolean called amIAtSchoolToday
         * -Assign true to this variable if you are at campus today
         * -Assign false to this variable if you are joining online today
         * -Print variable value with a proper message using println() method
         * EX/ I am at school today = amIAtSchoolToday
         */

        Boolean amIAtSchoolToday = false;

        System.out.println("I am at school today = " + amIAtSchoolToday);
    }

    public static void task_06() {
        /**
         * -Create a boolean called isWeatherNiceToday
         * -Assign true to this variable if it is above 60F today
         * -Assign false to this variable if it is below or equal to 60F today
         * -Print variable value with a proper message using println() method
         * -EX/ Weather is nice today = isWeatherNiceToday
         */

        Boolean isWeatherNiceToday = true;

        System.out.println("Weather is nice today = " + isWeatherNiceToday);
    }
}
