package decorator;

public class MilkCoffeeDecorator extends CoffeeDecorator {

	public MilkCoffeeDecorator(Coffee coffee) {
		// TODO Auto-generated constructor stub
		super(coffee);
	}

	public String getDescription() {
		return this.coffee.getDescription() + " along with Milk";
	}

	public double cost() {
		return this.coffee.cost() + 40;
	}
}
