package cn.gov.pbc.java.designpattern.factory.abstractfactory;

public class GoatCheese implements Cheese {

	public  GoatCheese(){
		prepareCheese();
	}
	
	@Override
	public void prepareCheese() {
		System.out.println("Prepare goat cheese ......");
	}

}
