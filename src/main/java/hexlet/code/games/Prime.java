package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static  void prime(String userName) {
        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            final int upperRandomLimit = 101;
            int dataForQuestion = Engine.generateRandomNumber(2, upperRandomLimit);

            Engine.askQuestion(String.valueOf(dataForQuestion));
            String answer = Engine.getAnswer();
            String result;
            if (isPrime(dataForQuestion)) {
                result = "yes";
            } else {
                result = "no";
            }
            if (answer.equals(result)) {
                Engine.getCorrectAnswer();
            } else {
                Engine.getWrongAnswer(answer, result, userName);
                return;
            }
        }
        Engine.getCongratulations(userName);
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
