package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int LIMIT_NUMBER_RANDOM = 100;
    public static final int LIMIT_OPERATOR_NUMBER = 3;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void runGame() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            var questionAndAnswer = generateRoundData();
            questions[round] = questionAndAnswer[0];
            answers[round] = questionAndAnswer[1];
        }
        Engine.run("What is the result of the expression?", questions, answers);
    }

    private static int calculator(int a, int b, char c) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }

    private static String[] generateRoundData() {
        int numberOne = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM);
        int numberTwo = Utils.generateOfNumber(LIMIT_NUMBER_RANDOM);
        char[] operators = {'+', '-', '*'};
        int y = Utils.generateOfNumber(LIMIT_OPERATOR_NUMBER);
        char operator = operators[y];
        var question = numberOne + " " + operator + " " + numberTwo;
        var answer = String.valueOf(calculator(numberOne, numberTwo, operator));
        return new String[]{question, answer};
    }
}

