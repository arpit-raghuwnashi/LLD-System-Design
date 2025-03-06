package strategy;

public class Customer {

	public static void main(String[] args) {
		ShippingCostCalculator calculator = new ShippingCostCalculator(new ExpressShipping());
		System.out.println(calculator.getShippingCost(9));
		
		System.out.println(new ShippingCostCalculator(new OverNightShipping()).getShippingCost(14));
	}
}
