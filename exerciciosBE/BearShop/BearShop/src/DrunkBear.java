import java.util.Random;

public class DrunkBear extends Bear {
    @Override
    public void seeIfBatteryAndTalk() {
        Random random = new Random();
        int valueR = random.nextInt(100) + 1;
        for (int i = 0; i < 10; i++) {
            if (valueR >= 20) {
                super.seeIfBatteryAndTalk();
            } else {
                System.out.println("zzz");
                break;
            }
        }
    }
}
