class MyThread extends Thread {

    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadLifecycleDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();

        System.out.println("State after creation: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());

        Thread.sleep(500);

        System.out.println("State during sleep: " + t.getState());

        t.join();

        System.out.println("State after completion: " + t.getState());
    }
}