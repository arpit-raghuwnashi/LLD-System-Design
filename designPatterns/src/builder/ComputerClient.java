package builder;

public class ComputerClient {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder().setName("Apple Macbook Air").setModel("M2")
				.setProcessor("Mac Os").setRam("8").setRom("512").build();

		System.out.println("Computer name : " + computer.getName());
		System.out.println("Computer Model : " + computer.getModel());
		System.out.println("Computer Processor : " + computer.getProcessor());
		System.out.println("Computer Ram : " + computer.getRam());
		System.out.println("Computer Rom : " + computer.getRom());

		
		System.out.println("----------------------------------------------------");
		
		Computer windows = new Computer.ComputerBuilder().setName("Windows 11")
				.setProcessor("Octa Core 8").setRam("16").setRom("265").build();

		System.out.println("Computer name : " + windows.getName());
//		System.out.println("Computer Model : " + windows.getModel());
		System.out.println("Computer Processor : " + windows.getProcessor());
		System.out.println("Computer Ram : " + windows.getRam());
		System.out.println("Computer Rom : " + windows.getRom());
		
		
		// output
		/*
		  	Computer name : Apple Macbook Air
			Computer Model : M2
			Computer Processor : Mac Os
			Computer Ram : 8
			Computer Rom : 512
			----------------------------------------------------
			Computer name : Windows 11
			Computer Processor : Octa Core 8
			Computer Ram : 16
			Computer Rom : 265
		 */
	}
}
