package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Engine;

public class Progression {
    public static  void progression(String userName) {

        final int correctAnswerCounter = 3;
        for (int i = 0; i < correctAnswerCounter; i++) {
            final int upperLimitOfProgressionLength = 13;
            final int lowerLimitOfProgressionLength = 5;
            int progressionLength = Engine.generateRandomNumber(lowerLimitOfProgressionLength,
                    upperLimitOfProgressionLength);
            int[] progression = new int[progressionLength];
            final int firstNumberUpperRandomLimit = 20;
            progression[0] = Engine.generateRandomNumber(firstNumberUpperRandomLimit);
            final int progressionStepLimit = 10;
            int progressionStep = Engine.generateRandomNumber(progressionStepLimit);
            for (var j = 1; j < progressionLength; j++) {
                progression[j] = progression[j - 1] + progressionStep;
            }

            String[] stringProgression = new String[progressionLength];
            for (var k = 0; k < progressionLength; k++) {
                stringProgression[k] = String.valueOf(progression[k]);
            }

            int numberOfUnknownInProgression = Engine.generateRandomNumber(0, progressionLength - 1);
            String unknown = stringProgression[numberOfUnknownInProgression];
            stringProgression[numberOfUnknownInProgression] = "..";
            String dataForQuestion = Arrays.toString(stringProgression)
                    .replace("[", "")
                    .replace("]", "");
            Engine.askQuestion(dataForQuestion);
            String answer = Engine.getAnswer();
            if (answer.equals(unknown)) {
                Engine.getCorrectAnswer();
            } else {
                Engine.getWrongAnswer(answer, unknown, userName);
                return;
            }
        }
        Engine.getCongratulations(userName);
    }
}
