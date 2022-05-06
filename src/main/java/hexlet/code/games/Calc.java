package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'-', '+', '*'};
    private static final int MAX_NUM_TO_DEFINE = 20;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAME_DESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        int a = Utils.generateRandomNumber(MAX_NUM_TO_DEFINE);
        char operator = OPERATORS[Utils.generateRandomNumber(OPERATORS.length) - 1];
        int b = Utils.generateRandomNumber(MAX_NUM_TO_DEFINE);
        String[] roundData = new String[2];
        roundData[0] = a + " " + operator + " " + b;
        roundData[1] = String.valueOf(calculate(a, b, operator));
        return roundData;
    }

    public static int calculate(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new RuntimeException("Unknown operator!!!");
        };
    }
}
