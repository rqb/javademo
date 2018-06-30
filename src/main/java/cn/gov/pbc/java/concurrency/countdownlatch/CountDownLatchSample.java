package cn.gov.pbc.java.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 等待多线程完成
 */
public class CountDownLatchSample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(6);
        for(int i=0;i<5;i++){
            Thread thread = new Thread(new FirstBatchWorker(latch));
            thread.start();
        }

        for (int i=0;i<5;i++){
            Thread thread = new Thread(new SecondBatchWorker(latch));
            thread.start();
        }

        while (latch.getCount()!=1){//等待First Batch执行完成
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Wait for first Batch finish");//此时latch.count=1,Second Batch还不能执行

        latch.countDown();//再次-1后latch.count=0,second batch开始执行
    }
}
