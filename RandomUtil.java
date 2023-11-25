import java.util.Random;

public class RandomUtil {

    private static final  Random random = new Random();
    public static int getRandom(int n){
        return random.nextInt(n) + 1;
    }

    public static boolean getBoolean(){
        return random.nextBoolean();
    }
}
