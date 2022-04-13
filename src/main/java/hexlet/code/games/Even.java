package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static  void even(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            System.out.print("Question: ");
            int number = generateRandomNumber();
            System.out.println(number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + ".");
                    return;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + ".");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 20;
        return random.nextInt(upperRandomLimit) + 1;
    }

   /* public boolean isEven(int number) {

    }*/
}
