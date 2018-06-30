package cn.gov.pbc.java.classloader;

class Singleton{
	
	/**
	 * ��̬��������������Լ���̬����鶼��������ĳ�ʼ����䣬java������ᰴ�������ļ��е��Ⱥ�˳��ִ�����ǡ�
	 * 
	 * ׼���׶�(Ϊ��ľ�̬���������ڴ棬�������ʼ��ΪĬ��ֵ )
	 *        singleton=null; counter1=0; counter2=0
	 * ��ʼ���׶�(Ϊ��ľ�̬����������ȷ�ĳ�ʼֵ)
	 * 		  singleton = new Singleton() ��       counter1=1  counter2=1
	 *        public static int counter2 = 0;   counter2=0
	 */
	private static Singleton singleton = new Singleton();
	public static int counter1;
	public static int counter2 = 0;
	
	//private static Singleton singleton = new Singleton();
	
	private Singleton(){
		counter1++;
		counter2++;
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}


public class ClassLoaderTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println("counter1 = "+singleton.counter1);
		System.out.println("counter2 = "+singleton.counter2);
	}

}
