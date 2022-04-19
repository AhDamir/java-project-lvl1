package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        final int item1 = 1;
        System.out.println("2 - Even");
        final int item2 = 2;
        System.out.println("3 - Calc");
        final int item3 = 3;
        System.out.println("4 - GCD");
        final int item4 = 4;
        System.out.println("5 - Progression");
        final int item5 = 5;
        System.out.println("6 - Prime");
        final int item6 = 6;
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        while (!scanner.hasNextInt() || !scanner.hasNext("[0123456]")) {
            System.out.println("Please enter a number from 0 to 6!");
            scanner.next();
        }
        switch (scanner.nextInt()) {
            case item1 -> Cli.getNameAndGreetings();
            case item2 -> {
                Cli.getNameAndGreetings();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Even.even(Cli.getUserName());

            }
            case item3 -> {
                Cli.getNameAndGreetings();
                System.out.println("What is the result of the expression?");
                Calc.calc(Cli.getUserName());
            }
            case item4 -> {
                Cli.getNameAndGreetings();
                System.out.println("Find the greatest common divisor of given numbers.");
                GCD.gcd(Cli.getUserName());
            }
            case item5 -> {
                Cli.getNameAndGreetings();
                System.out.println("What number is missing in the progression?");
                Progression.progression(Cli.getUserName());
            }
            case item6 -> {
                Cli.getNameAndGreetings();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
                Prime.prime(Cli.getUserName());
            }
            default -> System.out.println("See you!");
        }
    }
}
