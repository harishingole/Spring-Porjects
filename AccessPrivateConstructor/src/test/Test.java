package test;

public class Test {

	private Test() {
		System.out.println("Access Private Constructor");
	}
	private Test(int a) { 
		System.out.println("Access Private Parameterized Constructor : "+a);
	}
}
