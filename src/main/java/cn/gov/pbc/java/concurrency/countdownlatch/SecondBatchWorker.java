package cn.gov.pbc.java.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 第二批工作
 */
public class SecondBatchWorker implements Runnable {

    private CountDownLatch latch;

    public SecondBatchWorker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println(Thread.currentThread().getName()+"Second Batch Executed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
