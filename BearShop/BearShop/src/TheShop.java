import java.util.Random;

public class TheShop {
    int numBears;
    static int valueR;

    public void openShop() {
        Random random = new Random();
        valueR = random.nextInt(100) + 1;

        if (valueR % 2 == 0){
            SimpleBear simpleBear = new SimpleBear("", true, 100);
        }
    }


}
