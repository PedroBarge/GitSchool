public class CrankBear extends SimpleBear {

    public CrankBear(String talk, boolean canTalk, int battery) {
        super(talk, canTalk, battery);
    }

    @Override
    public void simpleTalk() {
        if (battery <= 50) {
            System.out.println("Sad ;-;");
            noTalk();
        } else super.simpleTalk();
    }
}
