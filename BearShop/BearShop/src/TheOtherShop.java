import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

public class TheOtherShop extends TheShop {
    ArrayList<String> arrayListBearsFromOtherStore = new ArrayList<>();
    int countOtherBear = 0;

    public void theOtherShop() {

        Random random = new Random();
        int bearsRandom = random.nextInt(50);
        for (int i = 0; i < bearsRandom; i++) {
            valueR = random.nextInt(100) + 1;
            if (valueR % 2 == 0) {
                arrayListBearsFromOtherStore.add("Simple Bear");
                countOtherBear++;
            } else if (valueR % 5 == 0) {
                arrayListBearsFromOtherStore.add("Simple Bear");
                countOtherBear++;
            } else {
                arrayListBearsFromOtherStore.add("Simple Bear");
                countOtherBear++;
            }
        }
    }

    @Override
    public void checkerCounter() {
        System.out.println("The Other shop has created " + countOtherBear + " bears");
        System.out.println("The list of bears: ");
        for (int i = 0; i < arrayListBearsFromOtherStore.size(); i++) {
            System.out.println(i + 1 + "-" + arrayListBearsFromOtherStore.get(i));
        }
    }
}
