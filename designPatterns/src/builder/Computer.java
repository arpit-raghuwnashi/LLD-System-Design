package builder;

public class Computer {

	private String name;
	private String model;
	private String processor;
	private String ram;
	private String rom;
	
	public Computer(ComputerBuilder computer) {
		this.name = computer.name;
		this.model = computer.model;
		this.processor = computer.processor;
		this.ram = computer.ram;
		this.rom = computer.rom;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public String getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

	public String getRom() {
		return rom;
	}

	static class ComputerBuilder {
		private String name;
		private String model;
		private String processor;
		private String ram;
		private String rom;

		public ComputerBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public ComputerBuilder setModel(String model) {
			this.model = model;
			return this;
		}

		public ComputerBuilder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}

		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}

		public ComputerBuilder setRom(String rom) {
			this.rom = rom;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}

	}
}
