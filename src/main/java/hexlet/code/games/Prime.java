package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void run() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
        final int numberOfQuestions = 3;

        String[][] dataForQuestion = new String[numberOfQuestions][2];
        for (var i = 0; i < numberOfQuestions; i++) {
            final int upperRandomLimit = 101;
            final int lowerRandomLimit = 2;
            int question = generateRandomNumber(lowerRandomLimit, upperRandomLimit);
            String correctAnswer;
            if (isPrime(question)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            dataForQuestion[i][0] = String.valueOf(question);
            dataForQuestion[i][1] = correctAnswer;
        }
        Engine.run(gameDescription, dataForQuestion);
    }

    public static int generateRandomNumber(int lowerRandomLimit, int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit - lowerRandomLimit + 1) + lowerRandomLimit;
    }

    public static boolean isPrime(int dataForQuestion) {
        int divider = 1;
        for (var j = 1; j < dataForQuestion - 1; j++) {
            divider += 1;
            if (dataForQuestion % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
