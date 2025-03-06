package decorator;

public class SugarCoffeeDecorator extends CoffeeDecorator{

	public SugarCoffeeDecorator(Coffee coffee) {
		// TODO Auto-generated constructor stub
		super(coffee);
	}
	
	public String getDescription() {
		return this.coffee.getDescription() + " along with Sugar";
	}

	public double cost() {
		return this.coffee.cost() + 30;
	}

}
