import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int total = 0;
        int mult = 1;
        boolean ciclos = false;
        while (!ciclos) {
            System.out.println("Ciclo invertido");
            System.out.print("Inserir numero: ");
            Scanner stringScanner = new Scanner(System.in);
            int x = stringScanner.nextInt();
            int number = x;
            for (int i = x; i > 0; i--) {
                System.out.println(i);
                total = total + i;
                if (i % 2 == 0) {
                    mult = mult * i;
                }

            }
            System.out.println("A soma de todos os valores: " + total);
            System.out.println("A multiplicação dos pares: " + mult);
            System.out.println("Deseja repetir? ");
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