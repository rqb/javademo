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
		 * ʵ��1
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
			System.out.println("�õ����" + future.get());//�ȴ��߳�ִ�н��
			try {
				System.out.println("�õ����" + future.get(100, TimeUnit.MILLISECONDS));//�ȴ��߳�ִ�н��, �����೤ʱ�䳬ʱ
			} catch (TimeoutException e) {
				e.printStackTrace();
			}//�ȴ��߳�ִ�н��
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("ִ�����");
		
		/**
		 * ʵ��2
		 * 
		 * CompletionService�����ύһ��Callable������take()������������ɵ�һ��Callable�����Ӧ��Future����
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
