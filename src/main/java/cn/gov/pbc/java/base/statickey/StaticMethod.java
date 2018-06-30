package cn.gov.pbc.java.base.statickey;

public class StaticMethod {
	/**
	 * 在一个类中定义一个方法为static，那就是说，无需本类的对象即可调用此方法
	 *	声明为static的方法有以下几条限制： 
	 *	· 它们仅能调用其他的static 方法。 
	 *	· 它们只能访问static数据。 
	 *	· 它们不能以任何方式引用this 或super。
	 */
	public static void go() {
		System.out.println("Welcome");
	}
}

