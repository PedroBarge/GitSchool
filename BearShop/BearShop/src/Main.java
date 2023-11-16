import java.util.Scanner;

public class Main {
    static Scanner choice = new Scanner(System.in);

    public static void main(String[] args) {
        TheShop theShop = new TheShop();
        int userChoice = 1;

        while (userChoice != 0) {
            System.out.println();
            System.out.println("Bear Shop");
            System.out.println("+-----+");
            System.out.println("Menu");
            System.out.println("1- Create Simple Bear\n2- Create Crank Bear\n3- Create Drunk Bear");
            System.out.println("4- Open shop (Random bear will be create)");
            System.out.println("0- Exit");
            System.out.print("-> ");
            userChoice = choice.nextInt();
            System.out.println();

            switch (userChoice) {
                case 1:
                    theShop.simpleWasCreate();
                    break;
                case 2:
                    theShop.crankWasCreate();
                    break;
                case 3:
                    theShop.drunkWasCreate();
                    break;
                case 4:
                    theShop.openShop();
                    break;
                case 0:
                    theShop.checkerCounter();
                    break;
                default:
            }
        }
    }
}