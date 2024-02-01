public class Couch extends Staff {
    boolean winLeage;

    public Couch(double salary, boolean winLeage) {
        super(salary);
        this.winLeage = winLeage;
    }

    @Override
    void salaryPerYearWithBonus() {
        String salaryRouded;
        if (winLeage) {
            super.salaryPerYear *= 1.20;
            salaryRouded = String.format("%.2f", salaryPerYear);
            System.out.println("Se a liga ganhar: Salario do treinador com bonus: " + salaryRouded + " por ano");
        } else {
            super.salaryPerYear *= 1.10;
            salaryRouded = String.format("%.2f", salaryPerYear);
            System.out.println("Se a liga perder: Salario do treinador: " + salaryRouded + " por ano");
        }
    }
}
