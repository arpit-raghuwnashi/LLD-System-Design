package abstractfactory;

public class Client {
	private Chair chair;
	private Sofa sofa;
	
	public Client(FurnitureFactory factory) {
		this.chair = factory.createChair();
		this.sofa = factory.createSofa();
	}
	
	public void descuribFurniture() {
		this.chair.sitOn();
		this.sofa.lieOn();
	}
	
	
	
	public static void main(String[] args) {
		FurnitureFactory modrenFactory = new ModernFurnitureFactory();
		Client morden = new Client(modrenFactory);
		morden.descuribFurniture();
		
		FurnitureFactory vectorianFactory = new ModernFurnitureFactory();
		Client vectorian = new Client(vectorianFactory);
		vectorian.descuribFurniture();
	}

}
