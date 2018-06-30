package cn.gov.pbc.java.concurrency.threaddefine;

/**
 * 线程定义方式：
 * 线程是可以驱动的，因此你需要一种描述任务的方式，这可以有Runnable接口来提供。
 * 要想定义任务只需要实现Runnable接口并编写run()方法,是的该任务可以执行你的命令。
 * 
 * @author renqingbin
 *
 */
public class LiftOff implements Runnable {

	protected int countDown = 10;
	
	private static int taskCount = 0;
	
	//id用来区分任务的多个实例，它是final的，一旦被初始化之后不希望被更改
	private final int id = taskCount++;
	
	
	public LiftOff() {
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		while(countDown-- >0){
			System.out.println(statuts());
			//
			Thread.yield();
		}
	}

	private String statuts() {
		return "#"+id + "(" + countDown + ")";
	}

}
