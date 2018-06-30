package cn.gov.pbc.java.base.statickey;

public class StaticMethodCall {

	/**
	 * 调用一个静态方法就是“类名.方法名”,静态方法的使用很简单如上所示。
	 * 
	 * 一般来说，静态方法常常为应用程序中的其它类提供一些实用工具所用，
	 * 在Java的类库中大量的静态方法正是出于此目的而定义的。
	 * 
	 */
	public static void main(String[] args) {
		StaticMethod.go();
	}

}
