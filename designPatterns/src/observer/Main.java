package observer;

public class Main {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
		StatisticsConditionDisplay statisticsConditionDisplay = new StatisticsConditionDisplay();
		
		station.addObserver(currentConditionDisplay);
		station.addObserver(statisticsConditionDisplay);
	
		station.updateTemprature(38.4);
		station.updateTemprature(32.6);
	}
}
