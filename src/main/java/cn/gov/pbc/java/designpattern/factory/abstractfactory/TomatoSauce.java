package cn.gov.pbc.java.designpattern.factory.abstractfactory;

public class TomatoSauce implements Sauce {

	public TomatoSauce(){
		prepareSause();
	}
	
	@Override
	public void prepareSause() {
		System.out.println("Preparing tomato sauce..");
	}

}
