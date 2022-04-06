package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName;
    public static  void getNameAndGreetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
