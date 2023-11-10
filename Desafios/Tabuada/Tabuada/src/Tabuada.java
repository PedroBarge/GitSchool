import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int calc = 0;
        boolean tabuada = false;
        while (!tabuada) {
            System.out.println("Tabuada");
            System.out.print("Tabuada do: ");
            Scanner stringScanner = new Scanner(System.in);
            int tab = stringScanner.nextInt();
            System.out.println("Tabuada do " + tab + " foi escolhida");

            for (int i = 1; i < 11; i++) {
                System.out.println(tab + "x" + i + "=" + tab*i);
               // calc = tab * i;
               // System.out.println(calc);

            }
            System.out.println("Deseja fazer outra tabuada? ");
            System.out.print("Sim [S] / Não [N]");
            String resposta = stringScanner.next();
            if (resposta.equals("S") || resposta.equals("s")) {
                continue;
            }else{
                break;
            }

        }

    }
}