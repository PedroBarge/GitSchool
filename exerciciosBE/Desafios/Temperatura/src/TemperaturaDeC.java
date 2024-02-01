import java.util.Scanner;

public class TemperaturaDeC {
    public static void main(String[] args) {

        boolean confirmar = false;
        while (!confirmar) {
            System.out.println("Com base em uma temperatura em graus celsius converter em:");
            System.out.println("Kelvin (K)");
            System.out.println("Réaumur (Re)");
            System.out.println("Rankine (Ra)");
            System.out.println("Fahrenheit (F)");
            System.out.print("Escrever opção: ");
            Scanner stringScanner = new Scanner(System.in);
            String temp = stringScanner.next();

            if (temp.equals("K") || temp.equals("Re") || temp.equals("Ra") || temp.equals("F")) {
                System.out.println("Temperatura de converção escolhida: " + temp);
                confirmar = true;
            } else {
                System.out.println("Temperatura invalida");
                continue;
            }

            System.out.print("Quantos gruas (ºC) a converter: ");
            int c = stringScanner.nextInt();

            switch (temp) {
                case "K":
                    num(K(c));
                    break;
                case "F":
                    num(F(c));
                    break;
                case "Ra":
                    num(Ra(c));
                    break;
                case "Re":
                    num(Re(c));
                    break;
                default:

            }

        /*if (temp.equals("K") || temp.equals("k")){
            num(K(c));
        }
        if (temp.equals("F") || temp.equals("f")){
            num(F(c));
        }
        if (temp.equals("Ra") || temp.equals("ra")){
                num(Ra(c));
        }
        if (temp.equals("Re") || temp.equals("re")){
            num(Re(c));
        }*/
        }
    }

    public static void num(double w) {
        System.out.print("Converção da temperatura indicada: ");
        System.out.println(w);
    }

    public static double K(int c) {
        return (c + 273.15);
    }

    public static double F(int c) {
        return (c * 1.8 + 32);
    }

    public static double Re(int c) {
        return (c * 0.8);
    }

    public static double Ra(int c) {
        return (c * 1.8 + 32 + 459.67);
    }
}