package hexlet.code;

import java.util.Scanner;
class Cli {
    public static String helloName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int number() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

