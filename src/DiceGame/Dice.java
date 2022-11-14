package DiceGame;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of sides:");
        int sides = scanner.nextInt();

        if (validateSides(sides)) {
            Die die1 = new Die(sides);
            Die die2 = new Die(sides);

            while(keepPlaying()) {
                int roll1 = die1.roll();
                int roll2 = die2.roll();

                int diceSum = roll1 + roll2;

                checkForSpecialValues(diceSum);
                System.out.println(diceSum);
            }
        } else {
            System.out.println("Number of sides is invalid!");
        }
    }

    public static boolean keepPlaying() {
        System.out.println("Do you want to play?");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        return userInput.equalsIgnoreCase("y");
    }

    public static void checkForSpecialValues(int diceSum) {
        switch(diceSum) {
            case 2:
                System.out.println("snake eyes");
                break;
            case 7:
                System.out.println("craps");
                break;
            case 12:
                System.out.println("box cars");
                break;
        }
    }

    public static boolean validateSides(int sides) {
        int minSides = 3;
        int maxSides = 12;

        return (sides >= minSides && sides <= maxSides);
    }
}
