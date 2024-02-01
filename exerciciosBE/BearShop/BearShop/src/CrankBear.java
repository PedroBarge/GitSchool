public class CrankBear extends Bear {
    int sadC = 0;
    @Override
    public void seeIfBatteryAndTalk() {
        for (int i = 0; i < 10; i++) {
            if (checkBatteryLevel() >= 50) {
                super.seeIfBatteryAndTalk();
            } else {
                canTalk = false;
                if (sadC == 0) {
                    System.out.println("Sad song...");
                    sadC++;
                }
                break;
            }
        }
    }
}
