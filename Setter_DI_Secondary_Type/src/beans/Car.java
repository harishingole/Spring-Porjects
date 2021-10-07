package beans;

public class Car {

	private String carname;
	private Engine engine;
	
	public Car() {
		System.out.println("Car Constructor");
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", engine=" + engine + "]";
	}
	
	
}
