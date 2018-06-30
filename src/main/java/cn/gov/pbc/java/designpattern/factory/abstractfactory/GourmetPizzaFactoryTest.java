package cn.gov.pbc.java.designpattern.factory.abstractfactory;

public class GourmetPizzaFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
		pizzaFactory.createPizza("cheese");
		pizzaFactory.createPizza("veggie");
	}
}
