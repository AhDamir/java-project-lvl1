package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String GAMEDESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAXNUMTODEFINE = 20;

    public static  void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAMEDESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        var question = Utils.generateRandomNumber(MAXNUMTODEFINE);
        String correctAnswer;
        if (isEven(question)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        String[] roundData = new String[2];
        roundData[0] = String.valueOf(question);
        roundData[1] = correctAnswer;
        return roundData;
    }

    public static boolean isEven(int dataForQuestion) {
        return dataForQuestion % 2 == 0;
    }
}

