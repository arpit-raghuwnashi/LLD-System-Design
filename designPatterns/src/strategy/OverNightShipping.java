package strategy;

public class OverNightShipping implements ShippingStrategy{

	@Override
	public double calculateShippingcost(double weight) {
		// TODO Auto-generated method stub
		return 150 * weight;
	}
	
}
