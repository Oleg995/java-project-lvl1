package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static final int LIMIT_NUMBER_RANDOM = 100;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void evenGame() {
        Random random = new Random();
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int a = 0; a < LIMIT_LENGTH_ARRAYS; a++) {
            int number = random.nextInt(LIMIT_NUMBER_RANDOM);
            questions[a] = String.valueOf(number);
            answers[a] = check(number) ? "yes" : "no";
        }
        Engine.run("Answer 'yes' if number even otherwise answer 'no'.", questions, answers);

    }

    public static boolean check(int number) {
        return number % 2 == 0;
    }
}
