package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String gameDescription, String[][] dataForQuestion) {
        getName();
        System.out.println(gameDescription);
        for (String[] strings : dataForQuestion) {
            System.out.print("Question: ");
            System.out.println(strings[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals(strings[1])) {
                Engine.getCorrectAnswer();
            } else {
                Engine.getWrongAnswer(answer, strings[1]);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    private static String userName;
    public static  void getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void getCorrectAnswer() {
        System.out.println("Correct!");
    }

    public static void getWrongAnswer(String answer, String result) {
        System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}
