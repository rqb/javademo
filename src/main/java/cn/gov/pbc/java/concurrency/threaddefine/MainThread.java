package cn.gov.pbc.java.concurrency.threaddefine;

public class MainThread {

	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		/**
		 * ��������run()�����ɵ������߳������ģ�������main()��ֱ�ӵ��õ�
		 * 
		 * ����Runnable����һ����ʱ�����������run()�����������������������֮��--����������κ������̵߳�����
		 * 
		 * Ҫʵ���߳���Ϊ���������ʽ�Ľ�һ�����񸽼ӵ��߳���
		 * 
		 * ��Runnable����ת��Ϊ��������Ĵ�ͳ��ʽ�ǰ����ύ��һ��Thread������  ����BasicThread
		 */
		launch.run();
	}

}
