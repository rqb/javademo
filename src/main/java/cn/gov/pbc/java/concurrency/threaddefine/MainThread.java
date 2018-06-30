package cn.gov.pbc.java.concurrency.threaddefine;

public class MainThread {

	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		/**
		 * 这个任务的run()不是由单独的线程驱动的，它是在main()中直接调用的
		 * 
		 * 当从Runnable导出一个类时，它必须具有run()方法，但这个方法并无特殊之处--它不会产生任何内在线程的能力
		 * 
		 * 要实现线程行为，你必须显式的将一个任务附加到线程上
		 * 
		 * 将Runnable对象转变为工作任务的传统方式是把它提交给一个Thread构造器  参照BasicThread
		 */
		launch.run();
	}

}
