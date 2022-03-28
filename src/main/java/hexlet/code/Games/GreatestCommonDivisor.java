package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisor {
    public static final int LIMIT_NUMBER_RANDOM = 99;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void runGame() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            var questionAndAnswer = generateRoundData();
            questions[round] = questionAndAnswer[0];
            answers[round] = questionAndAnswer[1];
        }
        Engine.run("Find the greatest common divisor of given numbers.", questions, answers);
    }

    private static int getGreatestCommonDivisor(int a, int b) {
        var count = Math.min(a, b);
        for (int i = count; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                count = i;
                break;
            }
        }
        return count;
    }

    private static String[] generateRoundData() {
        int numberOneY = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM) + 1;
        int numberTwoY = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM) + 1;
        var question = numberOneY + " " + numberTwoY;
        var answer = String.valueOf(getGreatestCommonDivisor(numberOneY, numberTwoY));
        return new String[]{question, answer};
    }
}
