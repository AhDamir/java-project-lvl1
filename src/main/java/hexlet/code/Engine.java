package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void askQuestion(String dataForQuestion) {
        System.out.print("Question: ");
        System.out.println(dataForQuestion);
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void getCorrectAnswer() {
        System.out.println("Correct!");
    }

    public static void getWrongAnswer(String answer, String result, String userName) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'.");
        System.out.println("Let's try again, " + userName + ".");
    }

    public static void getCongratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int generateRandomNumber(int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit) + 1;
    }

    public static int generateRandomNumber(int lowerRandomLimit, int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit - lowerRandomLimit + 1) + lowerRandomLimit;
    }
    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"-", "+", "*"};
        int i = random.nextInt(2);
        return operators[i];
    }

    public static boolean isEven(int dataForQuestion) {
        return dataForQuestion % 2 == 0;
    }
}

