package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static  void calc(String userName) {

        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            final int upperRandomLimit = 20;
            int a = Engine.generateRandomNumber(upperRandomLimit);
            String operator = Engine.generateOperator();
            int b = Engine.generateRandomNumber(upperRandomLimit);
            String dataForQuestion = a + " " + operator + " " + b;
            Engine.askQuestion(dataForQuestion);
            int result = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                default -> 0;
            };
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
