package cn.gov.pbc.java.base.statickey;

public class StaticVarCall {
	
	public static void prt(String s) {
		System.out.print(s);
	}

	/**
	 * ��ӡ�������֤�����ǹ���һ��洢����static�����е�������C�е�ȫ�ֱ����ĸ��
	 * @param args
	 */
	public static void main(String[] args) {
		StaticVar value1, value2;
		value1 = new StaticVar();
		value2 = new StaticVar();
		prt("value1.c=" + value1.c + " value2.c=" + value2.c);
		System.out.println();
		value2.inc();
		prt("value1.c=" + value1.c + " value2.c=" + value2.c);
	}
}
