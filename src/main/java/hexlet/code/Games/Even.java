package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int LIMIT_NUMBER_RANDOM = 100;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void runGame() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int a = 0; a < LIMIT_LENGTH_ARRAYS; a++) {
            var questionAndAnswer = generateRoundData();
            questions[a] = questionAndAnswer[0];
            answers[a] = questionAndAnswer[1];
        }
        Engine.run("Answer 'yes' if number even otherwise answer 'no'.", questions, answers);

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateRoundData() {
        int number = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM);
        var question = String.valueOf(number);
        var answer = isEven(number) ? "yes" : "no";
        return new String[]{question, answer};
    }
}
