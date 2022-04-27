package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String GAMEDESCRIPTION = "What is the result of the expression?";
    public static final char[] OPERATORS = {'-', '+', '*'};
    public static final int MAXNUMTODEFINE = 20;

    public static void run() {
        String[][] roundsData = new String[Engine.NUMBEROFROUNDS][2];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(GAMEDESCRIPTION, roundsData);
    }

    public static String[] generateRoundData() {
        int a = Utils.generateRandomNumber(MAXNUMTODEFINE);
        char operator = OPERATORS[Utils.generateRandomNumber(OPERATORS.length) - 1];
        int b = Utils.generateRandomNumber(MAXNUMTODEFINE);
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
            default -> 0;
        };
    }
}
