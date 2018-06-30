package cn.gov.pbc.java.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class AbnormalSemaphoreSample {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);
        for (int i=0;i<10;i++){
            Thread thread = new Thread(new MyWorker(semaphore));
            thread.start();
        }
        System.out.println("Action GO......");
        semaphore.release(5);

        System.out.println("Waiting for permission off");

        while (semaphore.availablePermits()!=0){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Action Go Again......");

        semaphore.release(5);


    }
}
