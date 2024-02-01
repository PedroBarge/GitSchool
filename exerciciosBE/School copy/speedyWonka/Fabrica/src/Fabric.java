import java.util.ArrayList;

public class Fabric {

    static int perDay = 0;
    static int totalCost;
    static double cashMax = 3000000;
    static ArrayList<Car> cars = new ArrayList<>();
    static int countDays = 1;

    public static void work() {
        while (perDay <= 100) {
            int random = (int) (Math.random() * 100);
            if (cashMax > 0 || cashMax >= 600000 || countDays <= 30) {
                if (random >= 0 && random < 30) {
                    Car car = new Car("SUV", 10000);
                }
                if (random >= 30 && random < 60) {
                    Car car = new Car("DESPORTIVO", 30000);
                }
                if (random >= 60 && random < 80) {
                    Car car = new Car("OFFROAD", 20000);
                }
                if (random >= 80 && random <= 100) {
                    Car car = new Car("TRICICLO ", 5000);
                }
            }
            perDay++;
            countDays++;
        }
    }

    public static void test(Car car) {
        int random = (int) (Math.random() * 100);
        cashMax = cashMax - car.priceToMake;
        if (random >= 0 && random <= 15) {
            cars.remove(car);
        } else {
            cars.add(car);
        }
    }

    public static void nextMonth() {
        countDays = 0;
        System.out.println("Novo mês.....");
    }

    public static void report() {
        double totalProfit = 0;
        int suvTotal = 0;
        int desportivoTotal = 0;
        int offroadTotal = 0;
        int tricicloTotal = 0;

        for (int i = 0; i < cars.size(); i++) {
            totalCost = totalCost + cars.get(i).priceToMake;
            totalProfit = totalProfit + (cars.get(i).priceToMake * 1.20);
            if (cars.get(i).nameCar.equals("SUV")) {
                suvTotal++;
            }
            if (cars.get(i).nameCar.equals("DESPORTIVO")) {
                desportivoTotal++;
            }
            if (cars.get(i).nameCar.equals("OFFROAD")) {
                offroadTotal++;
            }
            if (cars.get(i).nameCar.equals("TRICICLO")) {
                tricicloTotal++;
            }
        }

        System.out.println("Relatório (dia " + countDays + ")\n +" +
                " SUV > " + suvTotal + "units || custo:" + (10000 * suvTotal) + "€ || lucro:" + ((10000 * 1.20) * suvTotal) + "€\n" +
                " DESPORTIVO > " + desportivoTotal + " units || custo:" + (30000 * desportivoTotal) + "€ || lucro:" + ((30000 * 1.20) * desportivoTotal) + "€\n" +
                " OFFROAD > " + offroadTotal + "units || custo:" + (20000 * offroadTotal) + "€ || lucro:" + ((20000 * 1.20) * offroadTotal) + "€\n" +
                " TRICICLO > " + tricicloTotal + "units || custo:" + (5000 * tricicloTotal) + "€ || lucro:" + ((5000 * 1.20) * tricicloTotal) + "€");
    }
}