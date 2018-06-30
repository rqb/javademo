package cn.gov.pbc.java.concurrency.callable;

import java.util.concurrent.Callable;
/**
 * Runnable是执行工作的独立任务，它不返回任何值。如果你希望任务在完成时能返回一个值，可以实现Callable接口而不是Runnable接口
 * 
 * Callable是一种具有类型参数的泛型，他的类型参数表示是从方法call()中的返回值，并且必须使用ExecutorService.submit()方法调用它
 * 
 * @author renqingbin
 *
 */
public class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult( int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TashWithResult " + id;
	}

}
