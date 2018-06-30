package cn.gov.pbc.java.concurrency.callable;

import java.util.concurrent.Callable;
/**
 * Runnable��ִ�й����Ķ����������������κ�ֵ�������ϣ�����������ʱ�ܷ���һ��ֵ������ʵ��Callable�ӿڶ�����Runnable�ӿ�
 * 
 * Callable��һ�־������Ͳ����ķ��ͣ��������Ͳ�����ʾ�Ǵӷ���call()�еķ���ֵ�����ұ���ʹ��ExecutorService.submit()����������
 * 
 * @author renqingbin
 *
 */
public class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult( int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TashWithResult " + id;
	}

}
