package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String GAMEDESCRIPTION = "What number is missing in the progression?";
    public static final int UPPERLIMITOFPROGRESSIONLENGTH = 13;
    public static final int LOWERLIMITOFPROGRESSIONLENGTH = 5;
    public static final int PROGRESSIONFIRSTNUMBERUPPERLIMIT = 20;
    public static final int PROGRESSIONSTEPLIMIT = 10;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAMEDESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int progressionLength = Utils.generateRandomNumber(LOWERLIMITOFPROGRESSIONLENGTH,
                UPPERLIMITOFPROGRESSIONLENGTH);
        int[] progression = new int[progressionLength];
        progression[0] = Utils.generateRandomNumber(PROGRESSIONFIRSTNUMBERUPPERLIMIT);
        int progressionStep = Utils.generateRandomNumber(PROGRESSIONSTEPLIMIT);
        for (var j = 1; j < progressionLength; j++) {
            progression[j] = progression[j - 1] + progressionStep;
        }
        String[] stringProgression = new String[progressionLength];
        for (var k = 0; k < progressionLength; k++) {
            stringProgression[k] = String.valueOf(progression[k]);
        }
        int numberOfUnknownInProgression = Utils.generateRandomNumber(0, progressionLength - 1);
        String unknown = stringProgression[numberOfUnknownInProgression];
        stringProgression[numberOfUnknownInProgression] = "..";
        roundData[0] = Arrays.toString(stringProgression)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        roundData[1] = unknown;
        return roundData;
    }
}
