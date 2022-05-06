package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
    private static final int MAX_NUM_TO_DEFINE = 101;
    private static final int MIN_NUM_TO_DEFINE = 2;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAME_DESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int question = Utils.generateRandomNumber(MIN_NUM_TO_DEFINE, MAX_NUM_TO_DEFINE);
        String correctAnswer = isPrime(question) ? "yes" : "no";
        roundData[0] = String.valueOf(question);
        roundData[1] = correctAnswer;
        return roundData;
    }

    public static boolean isPrime(int dataForQuestion) {
        if (dataForQuestion > 1) {
            int divider = 1;
            for (var j = 1; j < dataForQuestion - 1; j++) {
                divider += 1;
                if (dataForQuestion % divider == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
