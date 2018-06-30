package cn.gov.pbc.java.base.init.explicitstatic;

public class Cups {
	
	static Cup cup1;
	static Cup cup2;
	
	/**
	 * 静态块 与其他静态初始化一样，仅执行一次；
	 * 当首次生成这个类的对象时，或者首次访问属于那个类的静态数据成员时（即便从未生成过那个类的对象）
	 */
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	

	Cups() {
		System.out.println("Cups()");
	}

}
