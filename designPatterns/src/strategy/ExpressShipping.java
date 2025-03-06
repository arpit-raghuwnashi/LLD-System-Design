package strategy;

public class ExpressShipping implements ShippingStrategy{

	@Override
	public double calculateShippingcost(double weight) {
		// TODO Auto-generated method stub
		return 70 * weight;
	}
	
}
