package cn.gov.pbc.java.concurrency.synchronization;

/**
 * 子线程循环10次，接着主线程循环20次，接着又回到子线程循环10次，接着再回到主线程循环20次，如此循环50次
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