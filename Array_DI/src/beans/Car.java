package beans;

public class Car {
	private String[] carnames;
	private Engine[] engines;
	
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printData() {
		for (String car : carnames) {
			System.out.println("Car Name ::"+car);
		
		for (Engine engine : engines) {
			System.out.println("Engine Name ::"+ engine.getModelyear());
		}
		}
	}
}
