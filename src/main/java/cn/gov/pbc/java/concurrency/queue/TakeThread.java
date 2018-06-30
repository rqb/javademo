package cn.gov.pbc.java.concurrency.queue;

public class TakeThread implements Runnable {

    SimpleBlockingQueue queue;

    public TakeThread(SimpleBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("新启动线程，休息一会，取出一个元素.....");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("取出元素之前......"+queue+"===="+queue.size());
        queue.take();
        System.out.println("取出元素之后......"+queue+"===="+queue.size());
    }
}
