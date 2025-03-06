package decorator;

public class Customer {

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " $ " + coffee.cost());

		coffee = new MilkCoffeeDecorator(coffee);
		System.out.println(coffee.getDescription() + " $ " + coffee.cost());

		coffee = new SugarCoffeeDecorator(coffee);
		System.out.println(coffee.getDescription() + " $ " + coffee.cost());

	}
}
