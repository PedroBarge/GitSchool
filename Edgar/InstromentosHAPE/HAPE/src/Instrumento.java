public class Instrumento {
    boolean isElectric;

    public Instrumento(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void checkElectric() {
        isElectric = false;
        System.out.println(false);
    }

    @Override
    public String toString() {
        return "Sou um instrumento "+isElectric;

    }
}
