// METHOD 2: EXTENDING THREAD

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("A running piece of code!");
    }
}
