public class SimpleBear {
    String talk;
    boolean canTalk;
    int battery = 100;

    public SimpleBear(String talk, boolean canTalk, int battery) {
        this.talk = "I love you";
        this.canTalk = true;
        this.battery = battery;
    }

    public void checkBattery() {
        if (battery <= 0) {
            System.out.println("No more battery");
            noTalk();
        }
    }
    public boolean noTalk() {
        canTalk = false;
        return false;
    }
    public void simpleTalk() {
        if (!noTalk()) {
            battery -= 20;
            System.out.println(talk);
        }
    }

    public void bearSimple(){
        do {
            simpleTalk();
            checkBattery();
        }while (noTalk());
    }

}
