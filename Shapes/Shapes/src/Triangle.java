public class Triangle extends Shapes {

    double base = 0;
    double hight = 0;

    public void startTriangle() {
        System.out.print("Insert Base: ");
        base = scanner.nextDouble();
        System.out.print("Insert Altura: ");
        hight = scanner.nextDouble();
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double areaT;
        areaT = (base * hight) / 2;
        System.out.println("Triangle area is: " + areaT);
    }
}
