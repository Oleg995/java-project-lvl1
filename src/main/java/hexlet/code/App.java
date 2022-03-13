package hexlet.code;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int numb = Cli.number();
        if (numb == 1) {
            System.out.println("\nWelcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.helloName();
            System.out.println("Hello, " + name + "!");
        } else if (numb == 2) {
            Even.evenGame();
        }
        else { System.out.println("Goodbay");
        }
    }
}