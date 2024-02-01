import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Classes Abstratas exemplo");
        boolean win;
        System.out.println("Ganhou a liga?");
        System.out.println("1- Sim | 2- Não");
        System.out.print("-> ");
        int winChoice = scanner.nextInt();

        win = winChoice == 1;

        President president = new President(25000);
        president.salaryPerYearWithBonus();
        System.out.println();
        Couch couch = new Couch(25000.00, win);
        couch.salaryPerYearWithBonus();
        System.out.println();
        Player player = new Player(25000.00, win);
        player.salaryPerYearWithBonus();
        System.out.println();
        System.out.println("Calcular o salario dos Seguranças por ano");
        System.out.print("Quantas invações de capo houveram este ano? ");
        int fieldInvacion = scanner.nextInt();
        SecuratyGuard securatyGuard = new SecuratyGuard(1500,fieldInvacion);
        securatyGuard.salaryPerYearWithBonus();
        System.out.println();
        System.out.println("Calcular o salario dos Apanha Bolas por ano");
        System.out.print("Quantos jogos tiveram presentes? ");
        int numOfGames = scanner.nextInt();
        Catcher catcher = new Catcher(20,numOfGames);
        catcher.salaryPerYearWithBonus();

    }
}