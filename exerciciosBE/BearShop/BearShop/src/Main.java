import java.util.Scanner;

public class Main {
    static Scanner choice = new Scanner(System.in);
    static TheShop theShop = new TheShop();
    static TheOtherShop theOtherShop = new TheOtherShop();

    public static void main(String[] args) {

        int userChoice = 1;

        while (userChoice != 0) {
            System.out.println();
            System.out.println("Bear Shop");
            System.out.println("+-----+");
            System.out.println("Menu");
            System.out.println("1- Create a new Simple Bear\n2- Create a new Crank Bear\n3- Create a new Drunk Bear");
            System.out.println("4- Open shop (Random bear will be created)");
            System.out.println("5- Check Shop number of bears");
            System.out.println("6- Compare Shops");
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
                case 5:
                    theShop.checkerCounter();
                    break;
                case 6:
                    System.out.println();
                    theOtherShop.theOtherShop();
                    theOtherShop.checkerCounter();
                    System.out.println();
                    theShop.checkerCounter();
                    compareTwoShops();
                    break;
                default:
            }
        }
    }

    private static void compareTwoShops() {
        if (theShop.arrayListBearsFromStore.size() > theOtherShop.arrayListBearsFromOtherStore.size()) {
            System.out.println("\nMy shop make more Bears");
        } else {
            System.out.println("\nThe other Shop make more Bears");
        }
        if (theShop.arrayListBearsFromStore.size() == theOtherShop.arrayListBearsFromOtherStore.size()) {
            System.out.println("\nThe two make the same amount of Bears");
        }
    }
}