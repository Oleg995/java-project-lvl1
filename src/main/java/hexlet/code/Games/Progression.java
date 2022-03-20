package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
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
        Random random = new Random();
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            int randomLength = MINIMAL_LENGTH_ARRAYS + random.nextInt(
                    MAX_LENGTH_ARRAYS - MINIMAL_LENGTH_ARRAYS + 1);
            int startIndex = MIN_VALUE + random.nextInt(MAX_START_INDEX - MIN_VALUE + 1);
            int difference = MIN_VALUE + random.nextInt(MAX_STEPS_ARRAYS - MIN_VALUE + 1);
            int[] a = new int[randomLength];
            a[0] = startIndex;

            int result = startIndex;
            for (int i = 1; i < a.length; i++) {
                result = result + difference;
                a[i] = result;
            }
            int randomNumber = random.nextInt(a.length - 1);
            questions[round] = round == 2 ? hiddenElementReverse(a, randomNumber) : hiddenElement(a, randomNumber);
            answers[round] = String.valueOf(a[randomNumber]);
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

    public static String hiddenElementReverse(int[] a, int b) {
        var result = new StringJoiner(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            int element = a[i];
            if (i == b) {
                result.add("..");
            } else {
                result.add(String.valueOf(element));
            }
        }
        return result.toString();
    }
}




