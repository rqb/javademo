package cn.gov.pbc.java.base.init.staticinitialization;
/**
 * ִ�н����
 * Bowl(1)
 * Bowl(2)
 * 
 * @author renqingbin
 *
 */
public class StaticInitialization {

	/**
	 * ��ʼ����˳�����Ⱦ�̬���󣬺�Ǿ�̬����
	 * 
	 * ��̬��ʼ��ֻ����Class�����״μ��ص�ʱ�����һ��
	 * 
	 * Ҫִ��main()��̬�������������StaticInitialization�࣬Ȼ���侲̬��table��cupboard����ʼ��
	 * 
	 * �⽫�������Ƕ�Ӧ����Ҳ�����أ��������ǰ����˾�̬��Bowl�������Bowl���Ҳ�����ء�
	 * 
	 *1:table��ʼ��
	 *    bowl1��̬������ʼ��--------Bowl(1)
	 *    bowl2��̬������ʼ��--------Bowl(2)
	 *    ����Table()---------------Table()
	 *    ����bowl2.f1(1)-----------f1(1)
	 *2:cupboard��ʼ��
	 *    bowl4��̬������ʼ��--------Bowl(4)
	 *    bowl5��̬������ʼ��--------Bowl(5)
	 *    bowl3�Ǿ�̬������ʼ��------Bowl(3)
	 *    ����Cupboard()------------Cupboard()
	 *    ����bowl4.f1(2)-----------f1(2)
	 *3:ִ��main
	 *    3.1:print-----------------Creating new Cupboard() in main
	 *	  3.2:new Cupboard()����
	 *        ������Ա����bowl3------Bowl(3)
	 *        ����Cupboard()--------Cupboard()
	 *        ����bowl4.f1(2)-------f1(2)
	 *    3.3:print-----------------Creating new Cupboard() in main
	 *	  3.4:new Cupboard()����
	 *        ������Ա����bowl3------Bowl(3)
	 *        ����Cupboard()--------Cupboard()
	 *        ����bowl4.f1(2)-------f1(2)
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
