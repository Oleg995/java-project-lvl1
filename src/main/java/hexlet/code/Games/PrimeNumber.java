package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    public static final int MAX_RANDOM = 500;
    public static final int LIMIT_LENGTH_ARRAYS = 3;
    private static final int COUNT = 3;

    public static void runGame() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            var questionAndAnswer = generateRoundData();
            answers[round] = questionAndAnswer[0];
            questions[round] = questionAndAnswer[1];
        }
        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questions, answers);
    }

    private static boolean isPrime(int question) {
        if (question < 2) {
            return false;
        } else if (question == 2) {
            return true;
        } else if (question % 2 == 0) {
            return false;
        } else {
            for (int i = COUNT; i < question; i += 2) {
                if (question % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static String[] generateRoundData() {
        int number = Utils.generateOfNumber(MAX_RANDOM) + 1;
        var question = isPrime(number) ? "yes" : "no";
        var answer = String.valueOf(number);
        return new String[]{question, answer};
    }
}

