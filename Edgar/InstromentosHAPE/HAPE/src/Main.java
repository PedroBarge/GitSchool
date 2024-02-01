public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Violino violino = new Violino(true, 4, false);
        Cordas violinoCordas = new Cordas(true, 4);
        Instrumento violinoInstrumento = new Instrumento(true);

        System.out.println(violino);
        System.out.println(violinoCordas);
        System.out.println(violinoInstrumento);
    }
}