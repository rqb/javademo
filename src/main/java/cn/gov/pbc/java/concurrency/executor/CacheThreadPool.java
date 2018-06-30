package cn.gov.pbc.java.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.gov.pbc.java.concurrency.threaddefine.LiftOff;
/**
 * 执行器Executor将为你管理Thread对象，从而简化了并发编程。
 * 
 *  Executor在客户端和任务执行期间提供了一个间接层，与客户端直接执行任务不同，这个中介对象将执行任务。
 *  
 *  Executor允许你管理异步任务的执行，从而无需显示的管理线程的生命周期。
 * 
 * 
 * @author renqingbin
 *
 */
public class CacheThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++){
			exec.execute(new LiftOff());
		}
		//对shutdown方法的调用可以防止新任务被提交给这个executor，当前线程将继续运行在shutdown()被调用之前提交的所有任务
		//这个程序将在Executor中的所有任务完成之后尽快退出。
		exec.shutdown();
	}

}
