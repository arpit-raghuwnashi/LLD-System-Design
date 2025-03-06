package strategy;

public class ShippingCostCalculator {
	private ShippingStrategy strategy;

	public ShippingCostCalculator(ShippingStrategy strategy) {
		this.strategy = strategy;
	}

	public double getShippingCost(double weight) {
		if (weight < 10)
			return 0;
		return this.strategy.calculateShippingcost(weight);
	}
}
