import java.util.Random;

public class TheShop {
    static int valueR;
    static int countBear = 0;

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
            drunkWasCreate();
        }
        countBear++;
    }

    public void simpleWasCreate() {
        SimpleBear simpleBear = new SimpleBear();
        simpleBear.seeIfBatteryAndTalk();
    }

    public void crankWasCreate() {
        CrankBear crankBear = new CrankBear();
        crankBear.seeIfBatteryAndTalk();
    }

    public void drunkWasCreate() {
        DrunkBear drunkBear = new DrunkBear();
        drunkBear.seeIfBatteryAndTalk();
    }
    public void checkerCounter(){
        System.out.println("The shop has created "+countBear+" bears");
    }
}
