package hexlet.code;

import java.util.Scanner;

import static java.lang.System.out;

public class Engine {

    public static void run(String task, String[] questions, String[] answers) {
        out.println("\nWelcome to the Brain Games!");
        out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        out.println("Hello, " + name + "!");
        out.println(task);
        out.println("Question: " + questions[0]);
        out.print("Your answer: ");
        String number = sc.nextLine();
        if (answers[0].equals(number)) {
            out.println("correct!");
            out.println("Question: " + questions[1]);
            out.print("Your answer: ");
            number = sc.nextLine();
            if (answers[1].equals(number)) {
                out.println("correct!");
                out.println("Question: " + questions[2]);
                out.print("Your answer: ");
                number = sc.nextLine();
                if (answers[2].equals(number)) {
                    out.println("correct!\nCongratulations, " + name + "!");
                } else {
                    out.println("'" + number + "'" + " is wrong answer ;(. Correct answer was: " + "'"
                            + answers[2] + "'" + " Let's try again, " + name + "!");
                }
            } else {

                out.println("'" + number + "'" + " is wrong answer ;(. Correct answer was: " + "'"
                        + answers[1] + "'" + " Let's try again, " + name + "!");
            }
        } else {
            out.println("'" + number + "'" + " is wrong answer ;(. Correct answer was: " + "'"
                    + answers[0] + "'" + " Let's try again, " + name + "!");
        }
    }
}

