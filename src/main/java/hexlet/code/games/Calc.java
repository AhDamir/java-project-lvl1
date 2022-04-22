package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static  void run() {
        String gameDescription = "What is the result of the expression?";
        final int numberOfQuestions = 3;

        String[][] dataForQuestion = new String[numberOfQuestions][2];
        for (var i = 0; i < numberOfQuestions; i++) {
            int a = generateRandomNumber();
            String operator = generateOperator();
            int b = generateRandomNumber();
            dataForQuestion[i][0] = a + " " + operator + " " + b;
            int result = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                default -> 0;
            };
            dataForQuestion[i][1] = String.valueOf(result);
        }
        Engine.run(gameDescription, dataForQuestion);
    }
    public static int generateRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 20;
        return random.nextInt(upperRandomLimit) + 1;
    }

    public static String generateOperator() {
        Random random = new Random();
        String[] operators = {"-", "+", "*"};
        int i = random.nextInt(operators.length);
        return operators[i];
    }
}
