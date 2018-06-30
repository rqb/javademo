package cn.gov.pbc.java.concurrency.threaddefine;

/**
 * 输出结果显示不同任务执行在线程被换进换出时混在一起，这种交换是由线程调度器自动控制的
 * 
 * @author renqingbin
 *
 */
public class MoreBasicThread {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff");
	}
}
