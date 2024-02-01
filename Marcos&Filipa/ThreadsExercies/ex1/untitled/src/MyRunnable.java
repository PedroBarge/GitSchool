// METHOD 1: PROVIDING A RUNNABLE OBJECT

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Running using Runnable");
        System.out.println("without sleep");
    }
}
