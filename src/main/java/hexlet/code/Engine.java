package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_ROUNDS = 3;

    public static void run(String task, String[][] roundsData) {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");

        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!" + "\n" + task);

            for (int round = 0; round < NUMBER_OF_ROUNDS; round++) {
                System.out.println("Question: " + roundsData[round][0]);
                System.out.print("Your answer: ");
                String number = sc.nextLine();

                if (roundsData[round][1].equals(number)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + number + "'" + " is wrong answer ;(. Correct answer was: " + "'"
                            + roundsData[round][1] + "'" + " Let's try again, " + name + "!");
                    return;
                }
            }
            System.out.println("Congratulations, " + name + "!");
        }
    }
}

