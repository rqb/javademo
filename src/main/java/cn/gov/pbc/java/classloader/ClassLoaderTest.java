package cn.gov.pbc.java.classloader;

class Singleton{
	
	/**
	 * 静态变量的声明语句以及静态代码块都被看作类的初始化语句，java虚拟机会按照在类文件中的先后顺序执行他们。
	 * 
	 * 准备阶段(为类的静态变量分配内存，并将其初始化为默认值 )
	 *        singleton=null; counter1=0; counter2=0
	 * 初始化阶段(为类的静态变量赋予正确的初始值)
	 * 		  singleton = new Singleton() ：       counter1=1  counter2=1
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
