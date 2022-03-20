package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String string() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int number() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

