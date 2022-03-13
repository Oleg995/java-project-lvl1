package hexlet.code;

import static java.lang.System.out;

public class Even {
    public static void evenGame() {
        out.println("\nWelcome to the Brain Games!");
        out.print("May I have your name? ");
        String name = Cli.helloName();
        out.println("Hello, " + name + "!");
        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        out.print("Question: 15\nYour answer: ");
        String answer1 = Cli.helloName();
        String text = "is wrong answer ;(. Correct answer was";
        if (answer1.equals("no")) {
            System.out.print("Correct!\nQuestion: 6\nYour answer: ");
            String answer2 = Cli.helloName();
            if (answer2.equals("yes")) {
                out.print("Correct!\nQuestion: 7\nYour answer: ");
                String answer3 = Cli.helloName();
                if (answer3.equals("no")) {
                    System.out.println("Correct!\nCongratulations, " + name + "!");
                } else if (answer3.equals("yes")) {
                    System.out.println("'yes'" + text + "'no'.");
                } else {
                    System.out.println(answer3 + text + "'no'.Let's try again, " + name +"!");
                }
            } else if (answer2.equals("no")) {
                System.out.println("'no'" + text + "'yes'.");
            }  else {
                System.out.println(answer2 + text + "'no'.Let's try again, " + name +"!");
            }
        } else if ( answer1.equals("yes")) {
            System.out.println("'yes'" + text + "'no'.");
        } else {
            System.out.println(answer1 + text + "'no'. Let's try again, " + name + "!");
        }
    }
}
