package hexlet.code;

import hexlet.code.Games.Calculator;
import hexlet.code.Games.Even;
import hexlet.code.Games.GreatestCommonDivisor;
import hexlet.code.Games.PrimeNumber;
import hexlet.code.Games.Progression;

import java.util.Scanner;

public class App {
    public static final int GREET_NUMBER = 1;
    public static final int EVEN_NUMBER = 2;
    public static final int CALC_NUMBER = 3;
    public static final int GCD_NUMBER = 4;
    public static final int PROGRESSION_NUMBER = 5;
    public static final int PRIME_NUMBER = 6;
    public static final int EXIT_NUMBER = 0;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_NUMBER + " - Greet");
        System.out.println(EVEN_NUMBER + " - Even");
        System.out.println(CALC_NUMBER + " - Calculator");
        System.out.println(GCD_NUMBER + " - GCD");
        System.out.println(PROGRESSION_NUMBER + " - Arithmetic progression");
        System.out.println(PRIME_NUMBER + " - Prime");
        System.out.println(EXIT_NUMBER + " - Exit");
        System.out.print("Your choice: ");

        try (Scanner sc = new Scanner(System.in)) {
            int numb = sc.nextInt();
            switch (numb) {
                case GREET_NUMBER -> Cli.greet();
                case EVEN_NUMBER -> Even.runGame();
                case CALC_NUMBER -> Calculator.runGame();
                case EXIT_NUMBER -> System.out.println("Goodbye");
                case GCD_NUMBER -> GreatestCommonDivisor.runGame();
                case PROGRESSION_NUMBER -> Progression.runGame();
                case PRIME_NUMBER -> PrimeNumber.runGame();
                default -> System.out.println("there is no such option. try again");
            }
        }
    }
}
