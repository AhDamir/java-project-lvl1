package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

import hexlet.code.Engine;

public class Progression {
    public static void run() {
        String gameDescription = "What number is missing in the progression?";
        final int numberOfQuestions = 3;

        String[][] dataForQuestion = new String[numberOfQuestions][2];
        for (var i = 0; i < numberOfQuestions; i++) {
            final int upperLimitOfProgressionLength = 13;
            final int lowerLimitOfProgressionLength = 5;
            int progressionLength = generateRandomNumber(lowerLimitOfProgressionLength,
                    upperLimitOfProgressionLength);
            int[] progression = new int[progressionLength];
            final int progressionsFirstNumberUpperRandomLimit = 20;
            progression[0] = generateRandomNumber(progressionsFirstNumberUpperRandomLimit);
            final int progressionStepLimit = 10;
            int progressionStep = generateRandomNumber(progressionStepLimit);
            for (var j = 1; j < progressionLength; j++) {
                progression[j] = progression[j - 1] + progressionStep;
            }

            String[] stringProgression = new String[progressionLength];
            for (var k = 0; k < progressionLength; k++) {
                stringProgression[k] = String.valueOf(progression[k]);
            }

            int numberOfUnknownInProgression = generateRandomNumber(0, progressionLength - 1);
            String unknown = stringProgression[numberOfUnknownInProgression];
            stringProgression[numberOfUnknownInProgression] = "..";
            dataForQuestion[i][0] = Arrays.toString(stringProgression)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            dataForQuestion[i][1] = unknown;
        }

        Engine.run(gameDescription, dataForQuestion);
    }

    public static int generateRandomNumber(int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit) + 1;
    }

    public static int generateRandomNumber(int lowerRandomLimit, int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit - lowerRandomLimit + 1) + lowerRandomLimit;
    }
}
