package observer;

public class StatisticsConditionDisplay implements Observer {

	private double temprature;

	@Override
	public void updateTemprature(double temp) {
		// TODO Auto-generated method stub
		this.temprature = temp;
		display();
	}

	public void display() {
		System.out.println("Statistics Condition temprature is : " + temprature);
	}
}
