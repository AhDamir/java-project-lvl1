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
                System.out.println("Welcome to the Brain Games!");
                Cli.getNameAndGreetings();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                Cli.getNameAndGreetings();
                even();
                break;
            case 0:
                System.out.println("See you!");
                return;
        }

    }
    public static  void even() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            System.out.print("Question: ");
            int number = randomNumber();
            System.out.println(number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Cli.userName);
                    return;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Cli.userName);
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
    public static int randomNumber()
    {
        int min = 1;
        int max = 100;
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
