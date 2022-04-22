package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static  void run() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int numberOfQuestions = 3;

        String[][] dataForQuestion = new String[numberOfQuestions][2];
        for (var i = 0; i < numberOfQuestions; i++) {
            var question = generateRandomNumber();
            String correctAnswer;
            if (isEven(question)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            dataForQuestion[i][0] = String.valueOf(question);
            dataForQuestion[i][1] = correctAnswer;
        }

        Engine.run(gameDescription, dataForQuestion);
    }

    public static boolean isEven(int dataForQuestion) {
        return dataForQuestion % 2 == 0;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        final int upperRandomLimit = 20;
        return random.nextInt(upperRandomLimit) + 1;
    }
}

