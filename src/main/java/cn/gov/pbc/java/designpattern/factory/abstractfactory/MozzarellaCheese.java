package cn.gov.pbc.java.designpattern.factory.abstractfactory;

public class MozzarellaCheese implements Cheese {

	public  MozzarellaCheese(){
		prepareCheese();
	}
	
	@Override
	public void prepareCheese() {
		System.out.println("Prepare Mozzarella cheese ......");
	}

}
