package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}


