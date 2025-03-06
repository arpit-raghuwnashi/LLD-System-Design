package observer;

public class CurrentConditionDisplay implements Observer {

	private double temprature;

	@Override
	public void updateTemprature(double temp) {
		this.temprature = temp;
		display();
	}

	public void display() {
		System.out.println("Current Condition temprature is : " + temprature);
	}
}
