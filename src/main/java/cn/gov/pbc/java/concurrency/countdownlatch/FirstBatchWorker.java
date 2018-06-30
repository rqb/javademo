package cn.gov.pbc.java.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 第一批工作
 */
public class FirstBatchWorker implements Runnable {

    private CountDownLatch latch;

    public FirstBatchWorker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"First Batch Executed");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
    }
}
