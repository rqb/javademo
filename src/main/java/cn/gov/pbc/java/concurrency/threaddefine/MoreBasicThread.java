package cn.gov.pbc.java.concurrency.threaddefine;

/**
 * ��������ʾ��ͬ����ִ�����̱߳���������ʱ����һ�����ֽ��������̵߳������Զ����Ƶ�
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
