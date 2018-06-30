package cn.gov.pbc.java.concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicWorker implements Runnable {
    private CyclicBarrier barrier;

    public CyclicWorker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            for(int i=1; i<4; i++){
                System.out.println(Thread.currentThread().getName()+"第"+ i +"次 Executed!");
                barrier.await();//每个线程调用await方法告诉CyclicBarrier我已经到达屏障
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
