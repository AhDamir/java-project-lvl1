package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUM_TO_DEFINE = 20;

    public static  void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAME_DESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        var question = Utils.generateRandomNumber(MAX_NUM_TO_DEFINE);
        String correctAnswer = isEven(question) ? "yes" : "no";
        String[] roundData = new String[2];
        roundData[0] = String.valueOf(question);
        roundData[1] = correctAnswer;
        return roundData;
    }

    public static boolean isEven(int dataForQuestion) {
        return dataForQuestion % 2 == 0;
    }
}

