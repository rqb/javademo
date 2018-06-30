package cn.gov.pbc.java.base.string;

public class StringTest {

	public static void main(String[] args) {
		//Java����������ַ���������һ��String
		String x = "abc";
		String y = new String("abc");
		
		/**
		 * ��JVM ��������a��bָ��ͬһ��String���������ڴ���������ͬ�ģ�����a==b��
		 * 
		 * �����������ͬ��String������ʱ��ֻ��һ����ͬ��String������������������
		 * ���Ϊ�ַ�����פ��(string interning)��Java �����г���String�����Զ���פ����
		 * 
		 */
		String a = "abcd";
		String b = "abcd";
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true
		
		/**
		 * JVM��heap��c��dָ��������ͬ�Ķ�������c==dֵΪ�١���ͬ�Ķ����в�ͬ���ڴ����á�
		 */
		String c = new String("abcd");
		String d = new String("abcd");
		System.out.println(c == d);  // false
		System.out.println(c.equals(d)); // true
		
		/**
		 *  �������ַ���פ��String Interning
		 *  ��ʹ����String���ù��캯��(new String(""))��������������Ҳ��ִ���ַ���פ����
		 */
		String e = new String("abcd").intern();
		String f = new String("abcd").intern();
		System.out.println(e == f);  // Now true
		System.out.println(e.equals(f)); // True
		
		/**
		 * ���������Ҫ����һ���ַ���������Ҫʹ��˫���ŷ�ʽ�����ַ�����
		 * �������Ҫ�ڶ����´���һ���ַ�������ʱ�����Կ���ʹ�ù��캯����ʽ�����ַ����������и����캯�������ο���
		 */
	}

}
