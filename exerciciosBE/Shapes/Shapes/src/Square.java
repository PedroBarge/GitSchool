public class Square extends Shapes {

    double width;

    public void startSquare() {
        System.out.print("Insert width: ");
        width = scanner.nextDouble();
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double areaS = width * width;
        System.out.println("Square area is: " + areaS);
    }
}
