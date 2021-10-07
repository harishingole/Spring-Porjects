package beans;


public class Test {

	
	private String name;
	private int age;
	private String gender;
	
	public Test(){
		System.out.println("Test()");
	}
	
	public Test(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
