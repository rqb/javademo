package cn.gov.pbc.java.concurrency;

/**
 *  start() method creates a new Thread and executes the run method in that thread. 
 *  If you invoke the run() method directly, the code in run method will execute in the current thread
 *  
 * @author renqingbin
 */
class A implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
 
class B implements Runnable {
 
    public void run() {
        new A().run();//name_thread1
        new Thread(new A(), "name_thread2").run();//name_thread1
        new Thread(new A(), "name_thread3").start();//name_thread3
    }
}
 
public class Overridding {
    public static void main(String[] args) {
        new Thread(new B(), "name_thread1").start();
    }
}

