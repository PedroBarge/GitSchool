public class Violino extends Cordas {
    boolean isStradivarius;

    public Violino(boolean isElectric, int numCordas, boolean isStradivarius) {
        super(isElectric, numCordas);
        this.isStradivarius = isStradivarius;
    }

    @Override
    public String toString() {
        return "Sou um violino Stradivarius?: "+isStradivarius;
    }
}
