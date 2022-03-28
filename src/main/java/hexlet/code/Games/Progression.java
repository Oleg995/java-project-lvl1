package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    public static final int MINIMAL_LENGTH_ARRAYS = 5;
    public static final int MAX_LENGTH_ARRAYS = 10;
    public static final int MAX_START_INDEX = 10;
    public static final int MAX_STEPS_ARRAYS = 8;
    public static final int MIN_VALUE = 2;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void run() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            var questionAndAnswer = generateRoundData();
            questions[round] = questionAndAnswer[0];
            answers[round] = questionAndAnswer[1];
        }
        Engine.run("Find the greatest common divisor of given numbers.", questions, answers);
    }

    public static String hiddenElement(int[] a, int b) {
        var result = new StringJoiner(" ");
        for (int i = 0; i < a.length; i++) {
            int element = a[i];
            if (i == b) {
                result.add("..");
            } else {
                result.add(String.valueOf(element));
            }
        }
        return result.toString();
    }

    private static int[] generateSequence(int startIndex, int difference, int length) {
        int[] a = new int[length];
        a[0] = startIndex;
        int result = startIndex;
        for (int i = 1; i < a.length; i++) {
            result = result + difference;
            a[i] = result;
        }
        return a;
    }

    private static String[] generateRoundData() {
        int randomLength = MINIMAL_LENGTH_ARRAYS + Utils.generateOfNumber(
                MAX_LENGTH_ARRAYS - MINIMAL_LENGTH_ARRAYS + 1);
        int startIndex = MIN_VALUE + Utils.generateOfNumber(MAX_START_INDEX - MIN_VALUE + 1);
        int difference = MIN_VALUE + Utils.generateOfNumber(MAX_STEPS_ARRAYS - MIN_VALUE + 1);
        int[] a = generateSequence(startIndex, difference, randomLength);
        int randomNumber = Utils.generateOfNumber(a.length - 1);
        var question = hiddenElement(a, randomNumber);
        var answer = String.valueOf(a[randomNumber]);
        return new String[]{question, answer};
    }
}





