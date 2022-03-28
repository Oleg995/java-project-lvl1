package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateOfNumber(int numb) {
        Random random = new Random();
        numb = random.nextInt(numb);
        return numb;
    }
}
