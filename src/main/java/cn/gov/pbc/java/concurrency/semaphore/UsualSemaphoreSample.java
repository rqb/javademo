package cn.gov.pbc.java.concurrency.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Semaphore用来控制同时访问特定资源的线程数量，它通过协调各个线程，以保证合理利用公共资源
 */
public class UsualSemaphoreSample {

    public static void main(String[] args) {
        System.out.println("Action Go......");

        Semaphore semaphore = new Semaphore(5);

        for (int i=0; i<10; i++){
            Thread thread = new Thread(new SemaphoreWorker(semaphore));
            thread.setName("Thread"+i);
            thread.start();
        }
    }
}
