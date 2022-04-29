package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUM_TO_DEFINE = 100;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAME_DESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int a = Utils.generateRandomNumber(MAX_NUM_TO_DEFINE);
        int b = Utils.generateRandomNumber(MAX_NUM_TO_DEFINE);
        roundData[0] = a + " " + b;
        int gCD = calculateGCD(a, b);
        roundData[1] = String.valueOf(gCD);
        return roundData;
    }

    public static int calculateGCD(int a, int b) {
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
        return result;
    }
}
