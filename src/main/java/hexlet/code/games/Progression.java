package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int UPPER_LIMIT_OF_PROGRESSION_LENGTH = 13;
    private static final int LOWER_LIMIT_OF_PROGRESSION_LENGTH = 5;
    private static final int PROGRESSION_FIRST_NUMBER_UPPER_LIMIT = 20;
    private static final int PROGRESSION_STEP_LIMIT = 10;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAME_DESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        int progressionLength = Utils.generateRandomNumber(LOWER_LIMIT_OF_PROGRESSION_LENGTH,
                UPPER_LIMIT_OF_PROGRESSION_LENGTH);
        int progressionFirstNumber = Utils.generateRandomNumber(PROGRESSION_FIRST_NUMBER_UPPER_LIMIT);
        int progressionStep = Utils.generateRandomNumber(PROGRESSION_STEP_LIMIT);

        String[] stringProgression = generateProgression(progressionFirstNumber, progressionLength, progressionStep);

        int numberOfUnknownInProgression = Utils.generateRandomNumber(0, progressionLength - 1);
        String unknown = stringProgression[numberOfUnknownInProgression];
        stringProgression[numberOfUnknownInProgression] = "..";
        String[] roundData = new String[2];
        roundData[0] = Arrays.toString(stringProgression)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        roundData[1] = unknown;
        return roundData;
    }

    public static String[] generateProgression(int progressionFirstNumber, int progressionLength, int progressionStep) {
        int[] progression = new int[progressionLength];
        progression[0] = progressionFirstNumber;
        for (var j = 1; j < progressionLength; j++) {
            progression[j] = progression[j - 1] + progressionStep;
        }
        String[] stringProgression = new String[progressionLength];
        for (var k = 0; k < progressionLength; k++) {
            stringProgression[k] = String.valueOf(progression[k]);
        }
        return stringProgression;
    }
}
