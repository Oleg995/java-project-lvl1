package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public class PrimeNumber {
    public static final int MAX_RANDOM = 500;
    public static final int LIMIT_LENGTH_ARRAYS = 3;
    private static final int COUNT = 3;

    public static void runGame() {
        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", generateRoundData());
    }

    private static String[][] generateRoundData() {
        String[][] roundsData = new String[LIMIT_LENGTH_ARRAYS][2];
        for (int i = 0; i < LIMIT_LENGTH_ARRAYS; i++) {
            int number = Utils.generateOfNumber(MAX_RANDOM) + 1;
            var answer = Primes.isPrime(number) ? "yes" : "no";
            var question = String.valueOf(number);
            roundsData[i] = new String[]{question, answer};
        }
        return roundsData;
    }
}

