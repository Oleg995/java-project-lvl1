package hexlet.code;

import java.util.Scanner;

import static java.lang.System.out;

public class Engine {
    private static final int NUMBER_OF_ROUNDS = 3;

    public static void run(String task, String[] questions, String[] answers) {
        out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        out.println("Hello, " + name + "!" + "\n" + task);
        for (int round = 0; round < NUMBER_OF_ROUNDS; round++) {
            out.println("Question: " + questions[round]);
            out.print("Your answer: ");
            String number = sc.nextLine();
            if (answers[round].equals(number)) {
                out.println("Correct!");
            } else {
                out.println("'" + number + "'" + " is wrong answer ;(. Correct answer was: " + "'"
                        + answers[round] + "'" + " Let's try again, " + name + "!");
                return;
            }
        }
        out.println("Congratulations, " + name + "!");
    }
}

