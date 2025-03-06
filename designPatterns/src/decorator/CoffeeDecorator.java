package decorator;

public class CoffeeDecorator implements Coffee{

	protected Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public String getDescription() {
		return coffee.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost();
	}

}
