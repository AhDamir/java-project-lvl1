package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
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
                Even.even(Cli.getUserName());
                break;
            case 3:
                Cli.getNameAndGreetings();
                Calc.calc(Cli.getUserName());
                break;
            default :
                System.out.println("See you!");
        }
    }
}
