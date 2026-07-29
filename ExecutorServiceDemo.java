/*Q9. ExecutorService and Thread Pools**
Rewrite a program that previously created 10 raw threads to instead use `ExecutorService` with 
a fixed thread pool of size 4. Submit 10 tasks and shut down the executor properly.
*Concepts: ExecutorService, thread pools, `submit()`, `shutdown()`**/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    int id;

    Task(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
    }
}

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 10; i++) {
            executor.submit(new Task(i));
        }

        executor.shutdown();
    }
}