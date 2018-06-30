package cn.gov.pbc.java.base.init.staticinitialization;
/**
 * 执行结果：
 * Bowl(1)
 * Bowl(2)
 * 
 * @author renqingbin
 *
 */
public class StaticInitialization {

	/**
	 * 初始化的顺序是先静态对象，后非静态对象
	 * 
	 * 静态初始化只有在Class对象首次加载的时候进行一次
	 * 
	 * 要执行main()静态方法，必须加载StaticInitialization类，然后其静态域table、cupboard被初始化
	 * 
	 * 这将导致他们对应的类也被加载，由于他们包含了静态的Bowl对象，因此Bowl随后也被加载。
	 * 
	 *1:table初始化
	 *    bowl1静态变量初始化--------Bowl(1)
	 *    bowl2静态变量初始化--------Bowl(2)
	 *    调用Table()---------------Table()
	 *    调用bowl2.f1(1)-----------f1(1)
	 *2:cupboard初始化
	 *    bowl4静态变量初始化--------Bowl(4)
	 *    bowl5静态变量初始化--------Bowl(5)
	 *    bowl3非静态变量初始化------Bowl(3)
	 *    调用Cupboard()------------Cupboard()
	 *    调用bowl4.f1(2)-----------f1(2)
	 *3:执行main
	 *    3.1:print-----------------Creating new Cupboard() in main
	 *	  3.2:new Cupboard()对象
	 *        创建成员变量bowl3------Bowl(3)
	 *        调用Cupboard()--------Cupboard()
	 *        调用bowl4.f1(2)-------f1(2)
	 *    3.3:print-----------------Creating new Cupboard() in main
	 *	  3.4:new Cupboard()对象
	 *        创建成员变量bowl3------Bowl(3)
	 *        调用Cupboard()--------Cupboard()
	 *        调用bowl4.f1(2)-------f1(2)
	 *    3.5:table.f2(1)-----------f2(1)
	 *    3.6:cupboard.f3(1)--------f3(1)
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		
		table.f2(1);
		cupboard.f3(1);

	}

	static Table table = new Table();
	
	static Cupboard cupboard = new Cupboard();
}
