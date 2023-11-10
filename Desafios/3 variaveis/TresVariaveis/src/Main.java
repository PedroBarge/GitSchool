import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quem sou eu");
        System.out.print("Qual o seu primeiro nome: ");
        Scanner stringScanner = new Scanner(System.in);
        String nome = stringScanner.next();
        System.out.print("Qual o seu segundo nome: ");
        String segnome = stringScanner.next();
        System.out.print("Qual a sua idade: ");
        int idade = stringScanner.nextInt();
        System.out.println("Eu sou o "+nome+" "+segnome+" tenho "+idade+" anos");
    }
}