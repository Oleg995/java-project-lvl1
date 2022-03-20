package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static final int LIMIT_NUMBER_RANDOM = 100;
    public static final int LIMIT_OPERATOR_NUMBER = 3;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void calculator() {
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        Random random = new Random();
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            int numberOne = random.nextInt(LIMIT_NUMBER_RANDOM);
            int numberTwo = random.nextInt(LIMIT_NUMBER_RANDOM);
            String[] operators = {"+", "-", "*"};
            int y = random.nextInt(LIMIT_OPERATOR_NUMBER);
            String operator = operators[y];
            questions[round] = numberOne + " " + operator + " " + numberTwo;
            answers[round] = String.valueOf(getExpress(numberOne, operator, numberTwo));
        }
        Engine.run("What is the result of the expression?", questions, answers);
    }

    public static int getExpress(int a, String c, int b) {
        return switch (c) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
    }
}

