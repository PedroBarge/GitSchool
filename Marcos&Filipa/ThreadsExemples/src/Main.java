public class Main {

    public static void main(String args[]) {

        // THE RUNNABLE METHOD
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        Thread thread = new MyThread();
        thread.start();
    }
}