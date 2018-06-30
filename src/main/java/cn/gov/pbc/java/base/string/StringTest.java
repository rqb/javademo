package cn.gov.pbc.java.base.string;

public class StringTest {

	public static void main(String[] args) {
		//Java里可以用两种方法来创建一个String
		String x = "abc";
		String y = new String("abc");
		
		/**
		 * 在JVM 方法区，a和b指向同一个String字面量，内存引用是相同的，所以a==b。
		 * 
		 * 当创建多个相同的String字面量时，只有一个相同的String字面量被保存下来。
		 * 这称为字符串的驻留(string interning)。Java 中所有常量String都会自动被驻留。
		 * 
		 */
		String a = "abcd";
		String b = "abcd";
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true
		
		/**
		 * JVM堆heap中c和d指向两个不同的对象，所以c==d值为假。不同的对象有不同的内存引用。
		 */
		String c = new String("abcd");
		String d = new String("abcd");
		System.out.println(c == d);  // false
		System.out.println(c.equals(d)); // true
		
		/**
		 *  运行期字符串驻留String Interning
		 *  即使两个String是用构造函数(new String(""))构建，在运行期也会执行字符串驻留。
		 */
		String e = new String("abcd").intern();
		String f = new String("abcd").intern();
		System.out.println(e == f);  // Now true
		System.out.println(e.equals(f)); // True
		
		/**
		 * 如果仅仅需要创建一个字符串，你需要使用双引号方式创建字符串。
		 * 如果你需要在堆里新创建一个字符串对象时，可以考虑使用构造函数方式创建字符串。这里有个构造函数用例参考。
		 */
	}

}
