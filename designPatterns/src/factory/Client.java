package factory;

public class Client {

	public static void main(String[] args) {
		Furtuniture factory = FurnitureFactory.getFurnitureDetails("Chair");
		factory.getDetails();
	}
}
