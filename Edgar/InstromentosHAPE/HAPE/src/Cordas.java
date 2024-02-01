public class Cordas extends Instrumento {
    int numCordas;

    public Cordas(boolean isElectric, int numCordas) {
        super(isElectric);
        this.numCordas = numCordas;
    }

    public void numCordas() {
        numCordas = 4;
        System.out.println(numCordas);
    }

    @Override
    public String toString() {
        return "Numero de cordas: " + numCordas;
    }
}
