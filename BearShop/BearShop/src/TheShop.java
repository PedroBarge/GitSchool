import java.util.ArrayList;
import java.util.Random;

public class TheShop {
    static int valueR;
    static int countBear = 0;
    ArrayList<String> arrayListBearsFromStore = new ArrayList<>();

    public void openShop() {
        Random random = new Random();
        valueR = random.nextInt(100) + 1;
        if (valueR % 2 == 0) {
            simpleWasCreate();
        } else if (valueR % 5 == 0) {
            crankWasCreate();
        } else {
            drunkWasCreate();
        }
    }

    public void simpleWasCreate() {
        System.out.println("Simple");
        SimpleBear simpleBear = new SimpleBear();
        simpleBear.seeIfBatteryAndTalk();
        arrayListBearsFromStore.add("Simple Bear");
        countBear++;
    }

    public void crankWasCreate() {
        System.out.println("Crank");
        CrankBear crankBear = new CrankBear();
        crankBear.seeIfBatteryAndTalk();
        arrayListBearsFromStore.add("Crank Bear");
        countBear++;
    }

    public void drunkWasCreate() {
        System.out.println("Drunk");
        DrunkBear drunkBear = new DrunkBear();
        drunkBear.seeIfBatteryAndTalk();
        arrayListBearsFromStore.add("Drunk Bear");
        countBear++;
    }

    public void checkerCounter() {
        System.out.println("The shop has created " + countBear + " bears");
        System.out.println("The list of bears: ");
        for (int i = 0; i < arrayListBearsFromStore.size(); i++) {
            System.out.println(i+1+"-"+arrayListBearsFromStore.get(i));
        }
    }
}
