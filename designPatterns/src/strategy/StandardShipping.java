package strategy;

public class StandardShipping implements ShippingStrategy{

	@Override
	public double calculateShippingcost(double weight) {
		// TODO Auto-generated method stub
		return 30 * weight;
	}
}
