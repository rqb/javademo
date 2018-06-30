package cn.gov.pbc.java.concurrency.callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		
		ArrayList<Future<String>> result = new ArrayList<Future<String>>();
		
		for (int i=0; i<5; i++){
			result.add(exec.submit(new TaskWithResult(i)));
		}
		
		/**
		 * submit����������Future��������Callable���ؽ�����ض����ͽ����˲�����
		 * 
		 * ������isDone()����ѯFuture�Ƿ��Ѿ���ɣ����������������һ����������Ե���get()������ȡ�����
		 * 
		 * Ҳ���Բ���isDone()���м�� ֱ�ӵ���get(),���������get()��������ֱ�����׼��������
		 * 
		 * ��Ҳ��������ͼ����get()֮ǰ�����þ��г�ʱ��get()
		 */
		for(Future<String> fs : result){
			try {
				System.out.println(fs.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
