public class Player extends Staff {
    boolean winLeage;

    public Player(double salary, boolean winLeage) {
        super(salary);
        this.winLeage = winLeage;
    }

    @Override
    void salaryPerYearWithBonus() {
        String salaryRouded;
        if (winLeage) {
            super.salaryPerYear *= 1.10;
            salaryRouded = String.format("%.2f", salaryPerYear);
            System.out.println("Se a liga ganhar: Salario do jogador com bonus: " + salaryRouded+ " por ano");
        } else {
            super.salaryPerYear *= 1.05;
            salaryRouded = String.format("%.2f", salaryPerYear);
            System.out.println("Se a liga perder: Salario do jogador: " + salaryRouded + " por ano");
        }
    }
}
