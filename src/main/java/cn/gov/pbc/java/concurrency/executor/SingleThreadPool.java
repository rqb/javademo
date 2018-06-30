package cn.gov.pbc.java.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.gov.pbc.java.concurrency.threaddefine.LiftOff;

public class SingleThreadPool {

	/**
	 * SingleThreadExecutor���߳�����Ϊ1��FixedThreadPool,�������ϣ������һ���߳����������е�����������˵���������õġ�
	 * 
	 * ÿ�������ǰ��������ύ��˳��ִ�У���������һ������ʼ֮ǰ��ɡ�
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for(int i=0; i<5; i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();

	}

}
