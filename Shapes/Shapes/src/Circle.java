public class Circle extends Shapes{
    double radius = 0;
    public void startCircle(){
        System.out.print("Insert radius: ");
        radius = scanner.nextDouble();
        calculateArea();
    }
    @Override
    public void calculateArea() {
        double areaC = 3.15 * radius / 2;
        System.out.println("Circle area is: " +areaC);
    }
}
