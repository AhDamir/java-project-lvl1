package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit) + 1;
    }

    public static int generateRandomNumber(int lowerRandomLimit, int upperRandomLimit) {
        Random random = new Random();
        return random.nextInt(upperRandomLimit - lowerRandomLimit + 1) + lowerRandomLimit;
    }
}
