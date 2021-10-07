package beans;

public class Engine {

	private int modelYear;
	
	public Engine() {
		System.out.println("Engine Constructor");
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	@Override
	public String toString() {
		return "Engine [modelYear=" + modelYear + "]";
	}
	
}
