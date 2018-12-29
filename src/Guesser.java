import java.util.Random;

/**
 *
 * This is the random number generator that the user will input
 * By default the number will be blank
 */
public class Guesser {
    int x;
    int y;

    public Guesser(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String guessRange(int x, int y){
        Random ran = new Random();
        return String.valueOf(ran.nextInt((y - x) + 1) + x);
    }
}
