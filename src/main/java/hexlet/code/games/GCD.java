package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static  void gcd(String userName) {
        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            final int upperRandomLimit = 100;
            int a = Engine.generateRandomNumber(upperRandomLimit);
            int b = Engine.generateRandomNumber(upperRandomLimit);
            String dataForQuestion = a + " " + b;
            Engine.askQuestion(dataForQuestion);

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
            String answer = Engine.getAnswer();
            if (answer.equals(String.valueOf(result))) {
                Engine.getCorrectAnswer();
            } else {
                Engine.getWrongAnswer(answer, String.valueOf(result), userName);
                return;
            }
        }
        Engine.getCongratulations(userName);
    }
}
