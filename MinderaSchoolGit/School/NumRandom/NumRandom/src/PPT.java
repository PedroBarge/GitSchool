import java.lang.Math;
import java.util.Scanner;

public class PPT {
    public static void main(String[] args) {
        Scanner readPPT = new Scanner(System.in);
        int max = 15;
        int min = 10;
        int media = max - min + 1;
        boolean ciclos = false;

        int randomInt = (int) (Math.random() * media) + 1;// Para gerar um numero inteiro aleatorio
        System.out.println(randomInt);
        //------------------------------------------------------------------
        System.out.println("Pedra Papel Tesoura");
        while (!ciclos) {
            System.out.println("Escolha UM: ");
            System.out.println("Pedra: 1");
            System.out.println("Papel: 2");
            System.out.println("Tesoura: 3");
            System.out.print("Escolha: ");
            int choosePPT = readPPT.nextInt();

            /*switch (randomInt){
                case 1:
                    //System.out.println("(CPU) Pedra");
                    switch (choosePPT){
                        case 1:
                            System.out.println("EMPATE");
                            break;
                        case 2:
                            System.out.println("VITORIA");
                            ciclos=true;
                            break;
                        case 3:
                            System.out.println("DERROTA");
                            break;
                    }
                    break;
                case 2:
                    //System.out.println("(CPU) Papel");
                    switch (choosePPT){
                        case 1:
                            System.out.println("DERROTA");
                            break;
                        case 2:
                            System.out.println("EMPATE");
                            break;
                        case 3:
                            System.out.println("VITORIA");
                            ciclos=true;
                            break;
                    }
                    break;
                case 3:
                    //System.out.println("(CPU) Tesoura");
                    switch (choosePPT){
                        case 1:
                            System.out.println("VITORIA");
                            ciclos=true;
                            break;
                        case 2:
                            System.out.println("DERROTA");
                            break;
                        case 3:
                            System.out.println("EMPATE");
                            break;
                    }
                    break;

                default:

            }*/

            if ((choosePPT == 1 && randomInt == 3) || (choosePPT == 2 && randomInt == 1) || (choosePPT == 3 && randomInt == 2)) {
                System.out.println("VITORIA");
                System.out.println("O computador escolheu "+randomInt);
                ciclos = true;
            } else if (choosePPT == randomInt) {
                System.out.println("EMPATE");
            } else {
                System.out.println("DERROTA");
            }

        }

    }
}
