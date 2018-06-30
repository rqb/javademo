package cn.gov.pbc.java.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclibarrierTest {
    public static void main(String[] args) {
        /**
         * parties       到达屏障之前必须被触发的线程数量
         * barrierAction 到达屏障之后触发的动作
         */
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("Action Go Again......");
            }
        });

        /**
         * 创建5个线程，每个线程循环执行3次
         * 每个线程调用await方法告诉CyclicBarrier我已经到达屏障
         */
        for(int i=1;i<6;i++){
            Thread thread = new Thread(new CyclicWorker(barrier));
            thread.start();
        }
    }
}
