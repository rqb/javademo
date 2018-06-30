package cn.gov.pbc.java.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class MyWorker implements Runnable {

	private String name;
	private Semaphore semaphore;

	public MyWorker(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	public void run() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+" executed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			semaphore.release();
		}
	}

}
