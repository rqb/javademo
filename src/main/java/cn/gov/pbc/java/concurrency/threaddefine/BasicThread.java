package cn.gov.pbc.java.concurrency.threaddefine;

/**
 * 将Runnable对象转变为工作任务的传统方式是把它提交给一个Thread构造器 
 * 
 * Thread构造器只需要一个Runnable对象，调用Thread对象的start()方法为该线程执行必须的初始化操作，
 * 然后调用Runnable的run()方法，以便在这个新线程中启动该任务。
 * 
 * 尽管start方法看起来是产生以一个对长期运行方法的调用，但是从输出看到start()方法迅速返回了，
 * 实际上你产生的是对LiftOff.run()的调用，并且这个方法还没有完成，但是因为LiftOff.run()是由不同线程执行，
 * 因此你仍可以执行main()线程中的其他操作。（任何一个线程都可以启动另一个线程）
 * 
 * 你可以添加更多线程去驱动更多任务，参照：MoreBasicThread
 * 
 * @author renqingbin
 *
 */
public class BasicThread {

	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		System.out.println("Waiting for LiftOff");
	}

}
