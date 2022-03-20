package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class GreatestCommonDivisor {
    public static final int LIMIT_NUMBER_RANDOM = 100;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void threeGame() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        Random random = new Random();
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            int numberOneY = random.nextInt(LIMIT_NUMBER_RANDOM);
            int numberTwoY = random.nextInt(LIMIT_NUMBER_RANDOM);
            questions[round] = numberOneY + " " + numberTwoY;
            answers[round] = String.valueOf(getGreatestCommonDivisor(numberOneY, numberTwoY));
        }
        Engine.run("Find the greatest common divisor of given numbers.", questions, answers);
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        var count = Math.min(a, b);
        for (int i = count; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                count = i;
                break;
            }
        }
        return count;
    }
}
