import java.util.Random;

public class DrunkBear extends SimpleBear {

    public DrunkBear(String talk, boolean canTalk, int battery) {
        super(talk, canTalk, battery);
    }
    @Override
    public void simpleTalk() {
        Random randomDrunk = new Random();
        int intDrunk = randomDrunk.nextInt(100) + 1;

        if (intDrunk <= 20) {
            noTalk();
            System.out.println("ZZZ...");
        } else super.simpleTalk();
    }
}
