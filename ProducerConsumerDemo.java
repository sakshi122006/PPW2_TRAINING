class Buffer {
    int value;
    boolean available = false;

    synchronized void produce(int val) throws InterruptedException {

        while (available) {
            wait();
        }

        value = val;
        System.out.println("Produced: " + value);

        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {

        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + value);

        available = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.produce(i);
            }
        } catch (Exception e) {
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                b.consume();
            }
        } catch (Exception e) {
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}