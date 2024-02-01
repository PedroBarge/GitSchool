public class Catcher extends Staff{

    int numOfGames;
    public Catcher(double salary, int numOfGames) {
        super(salary);
        this.numOfGames = numOfGames;
    }

    @Override
    void salaryPerYearWithBonus() {
        super.salary += numOfGames *=20;
        System.out.println("Salario do apanha bolas por ano: "+super.salary);
    }
}
