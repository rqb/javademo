package cn.gov.pbc.java.concurrency.threaddefine;

/**
 * ��Runnable����ת��Ϊ��������Ĵ�ͳ��ʽ�ǰ����ύ��һ��Thread������ 
 * 
 * Thread������ֻ��Ҫһ��Runnable���󣬵���Thread�����start()����Ϊ���߳�ִ�б���ĳ�ʼ��������
 * Ȼ�����Runnable��run()�������Ա���������߳�������������
 * 
 * ����start�����������ǲ�����һ���Գ������з����ĵ��ã����Ǵ��������start()����Ѹ�ٷ����ˣ�
 * ʵ������������Ƕ�LiftOff.run()�ĵ��ã��������������û����ɣ�������ΪLiftOff.run()���ɲ�ͬ�߳�ִ�У�
 * ������Կ���ִ��main()�߳��е��������������κ�һ���̶߳�����������һ���̣߳�
 * 
 * �������Ӹ����߳�ȥ�����������񣬲��գ�MoreBasicThread
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
