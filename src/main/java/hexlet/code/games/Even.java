package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static  void even(String userName) {
        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            final int upperRandomLimit = 20;
            int dataForQuestion = Engine.generateRandomNumber(upperRandomLimit);
            Engine.askQuestion(String.valueOf(dataForQuestion));
            String answer = Engine.getAnswer();
            String result;
            if (Engine.isEven(dataForQuestion)) {
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
}
