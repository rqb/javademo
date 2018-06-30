package cn.gov.pbc.java.concurrency.synchronization;

/**
 * ���߳�ѭ��10�Σ��������߳�ѭ��20�Σ������ֻص����߳�ѭ��10�Σ������ٻص����߳�ѭ��20�Σ����ѭ��50��
 * @author renqingbin
 *
 */
public class SynchronizationTest {
	
	public static void main(String[] args) {
		final Business business = new Business();
		new Thread(new Runnable() {
			
			public void run() {
				for(int i=1; i<=50; i++){
					business.sub(i);
				}
				
			}
		}).start();
		
		for(int i=1; i<=50; i++){
			business.main(i);
		}
		
	}

}


class Business{
	private boolean isSub = true;
	synchronized void main(int marker){
		while(!isSub){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1; i<=20; i++){
			System.out.println("main("+i+") loop of " + marker);
		}
		isSub = false;
		this.notify();
	}
	
	synchronized void sub(int marker){
		while(isSub){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1; i<=10; i++){
			System.out.println("sub("+i+") loop of " + marker);
		}
		isSub = true;
		this.notify();
	}
}