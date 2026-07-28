/*Q5. Synchronized Blocks**
Modify Q4 to use a `synchronized` block instead of a synchronized method, synchronizing only on the 
specific object needed. Explain the performance benefit over synchronizing the whole method.
*Concepts: synchronized blocks, lock granularity*
*/
class Count {
    int cnt = 0;

    void increment() {
        synchronized (this) {
            cnt++;
        }
    }
}

class C1 extends Thread {
    Count c;

    C1(Count c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            c.increment();
        }
    }
}

class C2 extends Thread {
    Count c;

    C2(Count c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            c.increment();
        }
    }
}

public class Synchronized_Blocks {
    public static void main(String[] args) throws InterruptedException {

        Count c = new Count();

        C1 t1 = new C1(c);
        C2 t2 = new C2(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + c.cnt);
    }
}