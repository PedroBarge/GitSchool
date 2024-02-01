abstract class Staff {

    double salary;
    double salaryPerYear;

    public Staff(double salary) {
        this.salary = salary;
        this.salaryPerYear = salary * 14;
    }

    abstract void salaryPerYearWithBonus();
}
