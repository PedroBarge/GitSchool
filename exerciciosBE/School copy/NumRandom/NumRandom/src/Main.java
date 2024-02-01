import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scRandom = new Scanner(System.in);
        int max = 15;
        int min = 10;
        int media = max - min + 1;
        boolean ciclos = false;

        int randomInt = (int) (Math.random() * media) + 1;// Para gerar um numero inteiro aleatorio
        System.out.println(randomInt);
        //------------------------------------------------------------------
        System.out.println("Numeros Random");
        System.out.println("Escolher um numero entre 1 e 10!");

        while (!ciclos) {
            System.out.print("Escolha um numero: ");
            int numRandom = scRandom.nextInt();

            if (numRandom > randomInt) {
                System.out.println("DICA: O numero Random é menor");
                continue;
            }
            if (numRandom < randomInt) {
                System.out.println("DICA: O numero Random é maior");
                continue;
            }
            if (numRandom == randomInt) {
                System.out.println("Acertou o numero");
                System.out.println("O computador escolheu: "+randomInt);
                ciclos = true;
            }
        }

    }
}