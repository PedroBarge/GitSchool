public class President extends Staff {
    int bonus = 50000;

    public President(double salary) {
        super(salary);
    }
    @Override
    void salaryPerYearWithBonus() {
        super.salaryPerYear += bonus;
        System.out.println("Salario do presidente por ano com bonus: " + super.salaryPerYear);
    }

}
