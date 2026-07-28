/*Q4. Synchronized Methods**
Fix the program in Q3 using the `synchronized` keyword on the increment method. Verify the counter 
now always reaches 200,000.
*Concepts: synchronized methods, monitor lock**/
class Count {
    int cnt = 0;

    synchronized void increment() {
        cnt++;
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

public class Race_condition_thread2 {
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