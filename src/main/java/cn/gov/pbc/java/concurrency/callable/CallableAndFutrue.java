package cn.gov.pbc.java.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableAndFutrue {

	public static void main(String[] args) {
		
		/**
		 * 实例1
		 * 
		 */
		ExecutorService threadpool = Executors.newSingleThreadExecutor();
		Future future = threadpool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(5000);
				return "hello";
			}
		});
		
		try {
			System.out.println("拿到结果" + future.get());//等待线程执行结果
			try {
				System.out.println("拿到结果" + future.get(100, TimeUnit.MILLISECONDS));//等待线程执行结果, 超过多长时间超时
			} catch (TimeoutException e) {
				e.printStackTrace();
			}//等待线程执行结果
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("执行完成");
		
		/**
		 * 实例2
		 * 
		 * CompletionService用于提交一组Callable任务，其take()方法返回已完成的一个Callable任务对应的Future对象
		 * 
		 */
		ExecutorService fixthreadpool = Executors.newFixedThreadPool(10);
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(fixthreadpool);
		
		for(int i=0; i < 10; i++){
			final int seq = i;
			completionService.submit(new Callable<Integer>() {
	
				@Override
				public Integer call() throws Exception {
					Thread.sleep(5000);
					return seq;
				}
			});
		}
		
		for(int i=0; i < 10; i++){
			try {
				System.out.println(completionService.take().get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
