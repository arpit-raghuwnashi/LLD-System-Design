package decorator;

public class SimpleCoffee implements Coffee{
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 40.00;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Simple Coffee";
	}
}
