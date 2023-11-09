import java.util.Scanner;

public class Main {
    static Scanner choice = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleBear simpleBear = new SimpleBear("", true, 100);
        CrankBear crankBear = new CrankBear("", true, 100);
        DrunkBear drunkBear = new DrunkBear("", true, 100);

        System.out.println("Bear Shop");
        System.out.println("Menu");
        System.out.println("1- SimpleBear\n2- CrankBear\n3- DrunkBear");
        System.out.print("->");
        int userChoice = choice.nextInt();

        switch (userChoice){
            case 1:
                for (int i = 0; i < 10; i++) {
                    simpleBear.bearSimple();
                }
                break;
            case 2:
                crankBear.simpleTalk();
                break;
            case 3:
                break;
            default:
        }
    }
}