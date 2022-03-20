package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GreatestCommonDivisor;
import hexlet.code.Games.PrimeNumber;
import hexlet.code.Games.Progression;

import static java.lang.System.out;

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
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        out.println("4 - GCD");
        out.println("5 - Arithmetic progression");
        out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int numb = Cli.number();
        switch (numb) {
            case GREET_NUMBER -> {
                System.out.println("\nWelcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String name = Cli.string();
                System.out.println("Hello, " + name + "!");
            }
            case EVEN_NUMBER -> Even.evenGame();
            case CALC_NUMBER -> Calc.calculator();
            case EXIT_NUMBER -> System.out.println("Goodbye");
            case GCD_NUMBER -> GreatestCommonDivisor.threeGame();
            case PROGRESSION_NUMBER -> Progression.run();
            case PRIME_NUMBER -> PrimeNumber.run();
            default -> out.println("there is no such option. try again");
        }
    }
}
