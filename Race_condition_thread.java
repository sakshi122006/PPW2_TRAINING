/*Q3. Race Condition Demo**
Write a program where two threads increment a shared counter variable 100,000 times 
each without synchronization. Run it and observe that the final count is often less than 200,000. Explain why.
*Concepts: race condition, shared mutable state**/
/* Q3. Race Condition Demo
Write a program where two threads increment a shared counter variable
100,000 times each without synchronization.
*/

class Count {
    int cnt = 0;

    void increment() {
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

public class Race_condition_thread {
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