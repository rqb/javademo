package cn.gov.pbc.java.concurrency.callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		
		ArrayList<Future<String>> result = new ArrayList<Future<String>>();
		
		for (int i=0; i<5; i++){
			result.add(exec.submit(new TaskWithResult(i)));
		}
		
		/**
		 * submit方法产生了Future对象，它用Callable返回结果的特定类型进行了参数化
		 * 
		 * 可以用isDone()来查询Future是否已经完成，当任务完成它具有一个结果，可以调用get()方法获取结果。
		 * 
		 * 也可以不用isDone()进行检查 直接调用get(),这种情况下get()将阻塞，直到结果准备就绪。
		 * 
		 * 你也可以在试图调用get()之前，调用具有超时的get()
		 */
		for(Future<String> fs : result){
			try {
				System.out.println(fs.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
