package cn.gov.pbc.java.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.gov.pbc.java.concurrency.threaddefine.LiftOff;

public class SingleThreadPool {

	/**
	 * SingleThreadExecutor是线程数量为1的FixedThreadPool,这对于你希望在另一个线程中连续运行的任务事物来说，都是有用的。
	 * 
	 * 每个任务都是按照他们提交的顺序执行，并且在下一个任务开始之前完成。
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0; i<5; i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();

	}

}
