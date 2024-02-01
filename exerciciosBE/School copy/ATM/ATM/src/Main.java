import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnATM = new Scanner(System.in);
        int rest = 0;
        int notes50 = 0;
        int notes20 = 0;
        int notes10 = 0;
        int notes1 = 0;
        int numOut = 0;

        boolean checkValue = false;

        //------------------------------------------------------------------
        System.out.println("ATM");

        while (!checkValue) {
            System.out.print("Inserir valor a retirar: ");
            numOut = scnATM.nextInt();
            if (numOut <= 0) {
                System.out.println("ERROR");
                continue;
            } else checkValue = true;
        }
        //------------------------------------------------------------------
        while (rest != numOut) {
            while ((rest + 50) <= numOut) {
                rest += 50;
                notes50++;
            }
            while ((rest + 20)<=numOut){
                rest += 20;
                notes20++;
            }
            while ((rest + 10) <= numOut) {
                rest += 10;
                notes10++;
            }
            while ((rest + 1)<=numOut){
                rest += 1;
                notes1++;
            }
        }
        //------------------------------------------------------------------
        System.out.println("Notas de 50€: " + notes50);
        System.out.println("Notas de 20€: " + notes20);
        System.out.println("Notas de 10€: " + notes10);
        System.out.println("Notas de 1€: " + notes1);
    }
}