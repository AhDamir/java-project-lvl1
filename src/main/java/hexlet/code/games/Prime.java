package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String GAMEDESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
    public static final int MAXNUMTODEFINE = 101;
    public static final int MINNUMTODEFINE = 2;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAMEDESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];
        int question = Utils.generateRandomNumber(MINNUMTODEFINE, MAXNUMTODEFINE);
        String correctAnswer;
        if (isPrime(question)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        roundData[0] = String.valueOf(question);
        roundData[1] = correctAnswer;
        return roundData;
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
