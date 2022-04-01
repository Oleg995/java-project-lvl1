package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisor {
    public static final int LIMIT_NUMBER_RANDOM = 99;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void runGame() {
        Engine.run("Find the greatest common divisor of given numbers.", generateRoundData());
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

    private static String[][] generateRoundData() {
        String[][] roundsData = new String[LIMIT_LENGTH_ARRAYS][2];
        for (int i = 0; i < LIMIT_LENGTH_ARRAYS; i++) {
            int numberOneY = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM) + 1;
            int numberTwoY = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM) + 1;
            var question = numberOneY + " " + numberTwoY;
            var answer = String.valueOf(getGreatestCommonDivisor(numberOneY, numberTwoY));
            roundsData[i] = new String[]{question, answer};
        }
        return roundsData;
    }
}
