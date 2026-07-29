class ResourceA {
}

class ResourceB {
}

public class DeadlockDemo {

    public static void main(String[] args) {

        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        Thread t1 = new Thread() {
            public void run() {
                synchronized (a) {
                    System.out.println("Thread1 locked ResourceA");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (b) {
                        System.out.println("Thread1 locked ResourceB");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (b) {
                    System.out.println("Thread2 locked ResourceB");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (a) {
                        System.out.println("Thread2 locked ResourceA");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}