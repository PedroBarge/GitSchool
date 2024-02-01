public class SecuratyGuard extends Staff {
    int counterFieldInvasion;
    int bonusMax = 2000;
    int bonusMin = 1000;

    public SecuratyGuard(double salary, int counterFieldInvasion) {
        super(salary);
        this.counterFieldInvasion = counterFieldInvasion;
    }

    @Override
    void salaryPerYearWithBonus() {
        if (counterFieldInvasion <= 0) {
            super.salary += bonusMax;
            System.out.println("Salario do Segurança com bonus: " + super.salary);
        } else {
            bonusMax -= counterFieldInvasion *= 20;
            if (bonusMin >= bonusMax) {
                super.salary += bonusMin;
                System.out.println("Salario do Segurança: " + super.salary + " com o bonus minimo");
            } else {
                super.salary += bonusMax;
                System.out.println("Salario do Segurança: " + super.salary + " com o bonus");
            }
        }
    }
}
