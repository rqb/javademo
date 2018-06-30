package cn.gov.pbc.java.concurrency.threaddefine;

/**
 * �̶߳��巽ʽ��
 * �߳��ǿ��������ģ��������Ҫһ����������ķ�ʽ���������Runnable�ӿ����ṩ��
 * Ҫ�붨������ֻ��Ҫʵ��Runnable�ӿڲ���дrun()����,�ǵĸ��������ִ��������
 * 
 * @author renqingbin
 *
 */
public class LiftOff implements Runnable {

	protected int countDown = 10;
	
	private static int taskCount = 0;
	
	//id������������Ķ��ʵ��������final�ģ�һ������ʼ��֮��ϣ��������
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
