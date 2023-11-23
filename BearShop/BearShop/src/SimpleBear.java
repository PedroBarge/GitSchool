public class SimpleBear extends Bear {
    @Override
    public void seeIfBatteryAndTalk() {
        for (int i = 0; i < 10; i++) {
            if (checkBatteryLevel() > 0) {
                super.seeIfBatteryAndTalk();
            } else {
                System.out.println("No more battery");
                break;
            }
        }
    }
}
