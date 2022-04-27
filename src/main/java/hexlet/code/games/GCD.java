package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String GAMEDESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int MAXNUMTODEFINE = 100;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAMEDESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int a = Utils.generateRandomNumber(MAXNUMTODEFINE);
        int b = Utils.generateRandomNumber(MAXNUMTODEFINE);
        roundData[0] = a + " " + b;
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
        roundData[1] = String.valueOf(result);
        return roundData;
    }
}
