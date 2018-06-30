package cn.gov.pbc.java.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.gov.pbc.java.concurrency.threaddefine.LiftOff;
/**
 * ִ����Executor��Ϊ�����Thread���󣬴Ӷ����˲�����̡�
 * 
 *  Executor�ڿͻ��˺�����ִ���ڼ��ṩ��һ����Ӳ㣬��ͻ���ֱ��ִ������ͬ������н����ִ������
 *  
 *  Executor����������첽�����ִ�У��Ӷ�������ʾ�Ĺ����̵߳��������ڡ�
 * 
 * 
 * @author renqingbin
 *
 */
public class CacheThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++){
			exec.execute(new LiftOff());
		}
		//��shutdown�����ĵ��ÿ��Է�ֹ�������ύ�����executor����ǰ�߳̽�����������shutdown()������֮ǰ�ύ����������
		//���������Executor�е������������֮�󾡿��˳���
		exec.shutdown();
	}

}
