package cn.gov.pbc.java.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreWorker implements Runnable {

	private String name;
	private Semaphore semaphore;

	public SemaphoreWorker(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is waiting for a permit");
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() +" acquired a permit!");
			System.out.println(Thread.currentThread().getName()+" executed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			semaphore.release();
		}
	}

}
