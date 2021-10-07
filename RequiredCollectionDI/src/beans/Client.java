package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resourse/spring.xml");
	 	Test t = (Test)applicationContext.getBean("t");
		t.printData();
	}
}
