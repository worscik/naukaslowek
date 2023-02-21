package pl.naukaslowek.AppUtils;

import java.util.Map;
import java.util.Random;

public class AppUtils {

    public final static int START_RANGE = 0;

    public static int randomNumber(Map<String,String> wordsSet){
        Random random = new Random();
        int endRange = wordsSet.size();
        int randomNumber = random.nextInt(START_RANGE,endRange);
        return randomNumber;
    }

}
