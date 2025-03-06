package factory;

public class FurnitureFactory {

	public static Furtuniture getFurnitureDetails(String factory) {
		if ("Sofa".equals(factory)) {
			return new MordenSofa();
		} else if ("Chair".equals(factory)) {
			return new ModrenChair();
		} else
			return null;
	}
}
