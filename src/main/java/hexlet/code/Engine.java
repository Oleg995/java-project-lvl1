package hexlet.code;

import static java.lang.System.out;

public class Engine {
    public static final String TEXT1 = "'%s' is wrong answer ;(. Correct answer was: '%s' Let's try again, %s!%n";
    public static final String TEXT2 = "Your answer: ";

    public static void run(String task, String[] questions, String[] answers) {
        out.println("\nWelcome to the Brain Games!");
        out.print("May I have your name? ");
        String name = Cli.string();
        out.println("Hello, " + name + "!");
        out.println(task);
        out.println(questions[0]);
        out.print(TEXT2);
        String number = Cli.string();
        if (answers[0].equals(number)) {
            out.println("correct!");
            out.println(questions[1]);
            out.print(TEXT2);
            number = Cli.string();
            if (answers[1].equals(number)) {
                out.println("correct!");
                out.println(questions[2]);
                out.print(TEXT2);
                number = Cli.string();
                if (answers[2].equals(number)) {
                    out.println("correct!\nCongratulations, " + name + "!");
                } else {
                    out.printf(TEXT1, number, answers[2], name);
                }
            } else {

                out.printf(TEXT1, number, answers[1], name);
            }
        } else {
            out.printf(TEXT1, number, answers[0], name);
        }
    }
}

