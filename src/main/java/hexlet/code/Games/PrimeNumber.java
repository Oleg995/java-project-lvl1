package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeNumber {
    public static final int MAX_RANDOM = 500;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void run() {
        Random random = new Random();
        String[] questions = new String[LIMIT_LENGTH_ARRAYS];
        String[] answers = new String[LIMIT_LENGTH_ARRAYS];
        for (int round = 0; round < LIMIT_LENGTH_ARRAYS; round++) {
            int question = random.nextInt(MAX_RANDOM);
            answers[round] = isPrime(question) ? "yes" : "no";
            questions[round] = String.valueOf(question);
        }
        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questions, answers);
    }
    public static final int COUNT = 3;
    public static boolean isPrime(int question) {
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
}

