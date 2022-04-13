package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static  void calc(String userName) {
        System.out.println("What is the result of the expression?");
        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            System.out.print("Question: ");
            int a = generateRandomNumber();
            String operator = generateOperator();
            int b = generateRandomNumber();
            System.out.println(a + operator + b);
            int result = 0;
            if (operator.equals("+")) {
                result = a + b;
            } else if (operator.equals("-")) {
                result = a - b;
            } else if (operator.equals("*")) {
                result = a * b;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + userName + ".");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 20;
        return random.nextInt(upperRandomLimit) + 1;
    }

    private static String generateOperator() {
        Random random = new Random();
        String[] operators = {"-", "+", "*"};
        int i = random.nextInt(2);
        return operators[i];
    }
}
