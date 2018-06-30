package cn.gov.pbc.java.designpattern.factory.abstractfactory;

public class GourmetToppingFactory extends BaseToppingFactory {
	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}
	@Override
	public Sauce createSauce() {
		return new CaliforniaOilSauce();
	}
}
