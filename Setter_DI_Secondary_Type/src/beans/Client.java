package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		String file[] = new String[] {"resources/car.xml","resources/engine.xml"};
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(file);
		Car c1 = (Car)applicationContext.getBean("c");
		System.out.println(c1);
	}
}
