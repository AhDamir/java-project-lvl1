package hexlet.code;

import java.util.Scanner;

public class Games {
    public static  void even(String userName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
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

    public static int randomNumber() {
        final int lowerRandomLimit = 1;
        final int upperRandomLimit = 100;
        return (int) (Math.random() * upperRandomLimit) + lowerRandomLimit;
    }
}
