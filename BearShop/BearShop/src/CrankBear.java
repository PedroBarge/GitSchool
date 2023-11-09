public class CrankBear extends Bear {

    public CrankBear(String talk, boolean canTalk, int battery) {
        super(talk, canTalk, battery);
    }

    @Override
    public void seeIfBatteryAndTalk() {
        for (int i = 0; i < 10; i++) {
            if (checkBatteryLevel() >= 50) {
                super.seeIfBatteryAndTalk();
            }else {
                System.out.println("Sad song...");
                break;
            }
        }
    }
}
