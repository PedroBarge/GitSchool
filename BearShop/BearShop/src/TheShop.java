import java.util.Random;

public class TheShop {
    int numBears;
    static int valueR;

    public void openShop() {
        Random random = new Random();
        valueR = random.nextInt(100) + 1;
        if (valueR % 2 == 0) {
            System.out.println("Simple");
            simpleWasCreate();
        } else if (valueR % 5 == 0) {
            System.out.println("Crank");
            crankWasCreate();
        } else {
            System.out.println("Drunk");
            drunkWasCrete();
        }
    }

    public void simpleWasCreate() {
        SimpleBear simpleBear = new SimpleBear("", true, 100);
        simpleBear.seeIfBatteryAndTalk();
    }

    public void crankWasCreate() {
        CrankBear crankBear = new CrankBear("", true, 100);
        crankBear.seeIfBatteryAndTalk();
    }

    public void drunkWasCrete() {
        DrunkBear drunkBear = new DrunkBear("", true, 100);
        drunkBear.seeIfBatteryAndTalk();
    }
}
