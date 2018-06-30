package cn.gov.pbc.java.concurrency.queue;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleBlockingQueue<E> {

    final Object items[];
    int count;//队列中元素的个数

    int putIndex;

    int takeIndex;

    private final ReentrantLock lock = new ReentrantLock();

    //等待放入元素的条件
    private final Condition notFull = lock.newCondition();
    //等待去元素的条件
    private final Condition notEmpty = lock.newCondition();

    public SimpleBlockingQueue(int capacity) {
        this.items=new Object[capacity];
    }

    public  void put(E e){
        final ReentrantLock lock = this.lock;

        try {
            lock.lockInterruptibly();
            while (count==items.length){
                System.out.println("放入线程阻塞.....");
                notFull.await();
            }
            insert(e);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void take(){
        final ReentrantLock lock = this.lock;

        try {
            lock.lockInterruptibly();

            while(count==0){
                System.out.println("取出线程阻塞.....");
                notEmpty.await();
            }
            extract();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    /**
     * 放入元素
     * @param x
     */
    private void insert(E x){
        final Object items[] = this.items;
        items[putIndex] = x;
        if(++putIndex==items.length)
            putIndex=0;
        count++;
        notEmpty.signal();
    }

    /**
     * 取出元素
     */
    private void extract(){
        final Object items[] = this.items;
        E x = (E) items[takeIndex];
        items[takeIndex] = null;
        if(++takeIndex==items.length)
            takeIndex = 0;
        count--;
        notFull.signal();
        System.out.println("取出一个元素完成.....");
    }

    public int size() {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "SimpleBlockingQueue{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
