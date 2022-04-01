package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final int LIMIT_NUMBER_RANDOM = 100;
    public static final int LIMIT_OPERATOR_NUMBER = 3;
    public static final int LIMIT_LENGTH_ARRAYS = 3;
    public static final char[] OPERATORS = {'+', '-', '*'};

    public static void runGame() {
        Engine.run("What is the result of the expression?", generateRoundData());
    }


    private static int calculate(int a, int b, char c) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }

    private static String[][] generateRoundData() {
        String[][] roundsData = new String[LIMIT_LENGTH_ARRAYS][2];
        for (int i = 0; i < LIMIT_LENGTH_ARRAYS; i++) {
            int numberOne = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM);
            int numberTwo = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM);
            int y = Utils.generateOfNumber(LIMIT_OPERATOR_NUMBER);
            char operator = OPERATORS[y];
            var question = numberOne + " " + operator + " " + numberTwo;
            var answer = String.valueOf(calculate(numberOne, numberTwo, operator));
            roundsData[i] = new String[]{question, answer};
        }
        return roundsData;
    }
}

