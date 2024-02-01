import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scnFib =new Scanner(System.in);
        int numFib;
        int total=0;
        int numAnt=0;
        int totalFib=1;
        int somaAtual=0;

        //------------------------------------------------------------------//
        System.out.println("Fibonacci");
        System.out.print("Inserir um numero limite de somas para a sequencia: ");
        numFib = scnFib.nextInt();
        //------------------------------------------------------------------//
        for (int i = 1; i <= numFib; i++) {
            somaAtual = i + somaAtual;
            numAnt = i-1;
            total = somaAtual + numAnt;
            System.out.println(total);
        }
    }
}