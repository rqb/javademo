package cn.gov.pbc.java.concurrency.queue;

public class SimpleBlockingQueueTest {
    public static void main(String[] args) {
        SimpleBlockingQueue queue = new SimpleBlockingQueue(5);

        queue.put("1111");
        queue.put("2222");
        queue.put("3333");
        queue.put("4444");
        queue.put("5555");
        System.out.println(queue  +"==="+ queue.size());

        new Thread(new Runnable() {
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
        }, "mythread").start();

        queue.put("6666");
        System.out.println(queue  +"==="+ queue.size());
    }
}
