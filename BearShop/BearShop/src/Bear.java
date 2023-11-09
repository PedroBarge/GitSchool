public class Bear {
    String talk;
    boolean canTalk;
    int battery;

    public Bear(String talk, boolean canTalk, int battery) {
        this.talk = "I love you";
        this.canTalk = true;
        this.battery = 100;
    }

    public void seeIfBatteryAndTalk() {
        if (battery > 0) {
            System.out.println(talk);
            battery -= 20;
        }
    }

    public int checkBatteryLevel() {
        System.out.println("Battery level: "+battery);
        return battery;
    }
}
