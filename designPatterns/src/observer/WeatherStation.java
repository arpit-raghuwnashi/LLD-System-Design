package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

	private double temprature;
	
	List<Observer> channels = new ArrayList<>();
	
	public void addObserver(Observer observer){
		channels.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		channels.remove(observer);
	}
	
	
	public void updateTemprature(double temp) {
		this.temprature = temp;
		System.out.println("Sending temprature update to all channels");
		notifyAllChannels();
		
	}
	
	public void notifyAllChannels() {
		for(Observer ob : channels)
			ob.updateTemprature(temprature);
	}
}
