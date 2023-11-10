import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int total = 0;
        int mult = 1;
        boolean ciclos = false;
        while (!ciclos) {
            System.out.println("Jogo FIZZ BUZZ");
            System.out.print("Inserir numero: ");
            Scanner intScanner = new Scanner(System.in);
            int x = intScanner.nextInt();
            int number = x;
            if (number % 3==0 && number % 5==0 ) {
                System.out.println("FIZZBUZZ!!");

            }
            else if (number % 3==0) {
                System.out.println("FIZZ!!");

            }
            else if (number % 5==0 ) {
                System.out.println("BUZZ!!");

            }

            /*for (int i = x; i > 0; i--) {
                System.out.println(i);
                total = total + i;
                if (i % 2 == 0) {
                    mult = mult *i;
                }
            }*/

            System.out.println("Deseja repetir? ");
            System.out.print("Sim [S] / Não [N]");
            String resposta = intScanner.next();
            if (resposta.equals("S") || resposta.equals("s")) {
                continue;
            }else{
                break;
            }

        }
    }
}