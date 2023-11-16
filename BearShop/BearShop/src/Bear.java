public class Bear {
    String talk;
    boolean canTalk;
    int battery;

    public Bear() {
        this.talk = "I love you";
        this.canTalk = true;
        this.battery = 100;
    }

    public void seeIfBatteryAndTalk() {
        if (canTalk){
            if (battery > 0) {
                System.out.println(talk);
                battery -= 20;
            }
        }else {
            System.out.println();
        }
    }

    public int checkBatteryLevel() {
        //System.out.println("Battery level: "+battery);
        return battery;
    }
}
