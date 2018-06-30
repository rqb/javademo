package cn.gov.pbc.java.base.init.explicitstatic;

public class ExplicitStatic {

	public static void main(String[] args) {
		System.out.println("inside main()");
		Cups.cup1.f(99);
	}
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();

}
