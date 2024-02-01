import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) {
        Scanner scnSWC = new Scanner(System.in);
        boolean msgErro = false;
        String inputSWC = null;
        //------------------------------------------------------------------//
        System.out.println("\n Star Wars Characters:\n");
        while (!msgErro) {
            System.out.println("1- General Kenobi");
            System.out.println("2- Yoda");
            System.out.println("3- Chewbacca");
            System.out.println("4- Anakin Skywalker");
            System.out.println("5- Droids");
            System.out.println("6- C-3PO");
            System.out.println("7- R2-D2");
            System.out.println("8- BB-8");
            System.out.print("Introduzir numero: ");
            inputSWC = scnSWC.next();

            if (inputSWC.equals("1") || inputSWC.equals("2") || inputSWC.equals("3") || inputSWC.equals("4") || inputSWC.equals("5") || inputSWC.equals("6") || inputSWC.equals("7") || inputSWC.equals("8")) {
                msgErro = true;
            } else {
                System.out.println("Introduziu um valor errado, tentar novamente.");
                continue;
            }
        }

        switch (inputSWC) {
            case "1":
                System.out.println("\u001b[44;1m Hello there. \u001b[0m");
                break;

            case "2":
                System.out.println("\u001b[42;1m You must unlearn what you have learned. \u001b[0m");
                break;

            case "3":
                System.out.println("\u001b[48;5;94m AGHRRAAAAAAAA!!! \u001b[0m");
                break;

            case "4":
                System.out.println("\u001b[41;1m This is where the fun begins. \u001b[0m");
                break;

            case "5":
                System.out.println("\u001b[46;1m Roger, Roger ! \u001b[0m");
                break;

            case "6":
                System.out.println("\u001b[43;1m You watch your language! \u001b[0m");
                break;

            case "7":
                System.out.println("\u001b[44;1m UUUUUIIIIIIIIIIIII!!!! \u001b[0m");
                break;

            case "8":
                System.out.println("\u001b[48;5;208m They see me rollin. \u001b[0m");
                break;
        }
    }
}