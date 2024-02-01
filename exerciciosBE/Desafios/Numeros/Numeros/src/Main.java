import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        double media = 0;
        double media2 = 0;
        int ciclo = 0;
        int[] a = new int[0];

        boolean positivo = false;
        while (!positivo) {

            System.out.print("Introduzir numeros: ");
            int num = stringScanner.nextInt();

             if (num > 0) {
                ciclo++;
                //System.out.println("Utilizador: "+num);
                //System.out.println("Ciclo: "+ciclo);
                media2 = media2 + num;
                continue;
            } else {
                for (int i = 0; i < ciclo ; i++) {
                    media = media2 / ciclo;
                    a[i]
                }
                media = media2 / ciclo;
                System.out.println("Media: "+media);
               break;
            }
        }
    }
}