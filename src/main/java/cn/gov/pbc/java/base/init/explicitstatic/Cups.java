package cn.gov.pbc.java.base.init.explicitstatic;

public class Cups {
	
	static Cup cup1;
	static Cup cup2;
	
	/**
	 * ��̬�� ��������̬��ʼ��һ������ִ��һ�Σ�
	 * ���״����������Ķ���ʱ�������״η��������Ǹ���ľ�̬���ݳ�Աʱ�������δ���ɹ��Ǹ���Ķ���
	 */
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	

	Cups() {
		System.out.println("Cups()");
	}

}
