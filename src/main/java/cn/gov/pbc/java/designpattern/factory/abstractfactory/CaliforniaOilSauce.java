package cn.gov.pbc.java.designpattern.factory.abstractfactory;

public class CaliforniaOilSauce implements Sauce {

	public CaliforniaOilSauce(){
		prepareSause();
	}
	
	@Override
	public void prepareSause() {
		System.out.println("Preparing tomato sauce..");
	}
}
