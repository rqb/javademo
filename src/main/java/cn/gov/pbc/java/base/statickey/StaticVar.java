package cn.gov.pbc.java.base.statickey;

/**
 * 声明为static的变量实质上就是全局变量。
 * 
 * 当声明一个对象时，并不产生static变量的拷贝，而是该类所有的实例变量共用同一个static变量。
 * 
 * 静态变量与静态方法类似。所有此类实例共享此静态变量，也就是说在类装载时，只分配一块存储空间，
 * 所有此类的对象都可以操控此块存储空间，当然对于final则另当别论了
 * 
 * @author renqingbin
 *
 */
public class StaticVar {
	static int c = 0;

	static void inc() {
		c++;
	}
}
