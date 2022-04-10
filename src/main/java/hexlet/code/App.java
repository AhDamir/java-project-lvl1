package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: ");
        int gameNumber = scanner.nextInt();
        switch (gameNumber) {

            case 1:
                Cli.getNameAndGreetings();
                break;
            case 2:
                Cli.getNameAndGreetings();
                String userName = Cli.getUserName();
                Games.even(userName);
                break;
            default:
                System.out.println("See you!");
                return;
        }

    }

}
