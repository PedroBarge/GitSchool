// METHOD 2: EXTENDING THREAD

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running with thread sleep");

        try {
            Thread.sleep(2000);
            System.out.println("2 seconds after");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("done");
    }
}
