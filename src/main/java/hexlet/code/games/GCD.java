package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void run() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        final int numberOfQuestions = 3;

        String[][] dataForQuestion = new String[numberOfQuestions][2];
        for (var i = 0; i < numberOfQuestions; i++) {
            int a = generateRandomNumber();
            int b = generateRandomNumber();
            dataForQuestion[i][0] = a + " " + b;
            int result = 0;
            if (a == b) {
                result = a;
            } else {
                while (a % b != 0) {
                    result = a % b;
                    a = b;
                    b = result;
                }
            }
            dataForQuestion[i][1] = String.valueOf(result);
        }
        Engine.run(gameDescription, dataForQuestion);
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 100;
        return random.nextInt(upperRandomLimit) + 1;
    }
}
