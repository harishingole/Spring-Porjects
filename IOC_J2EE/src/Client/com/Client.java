package Client.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args) {
//		Resource r = new ClassPathResource("resources/spring.xml");
//		BeanFactory  beanFactory = new XmlBeanFactory(r);
//		Test t = (Test) beanFactory.getBean("t");
//		Test t1 = (Test) beanFactory.getBean("t");
//		Test t2 = (Test) beanFactory.getBean("t");
//		System.out.println(t.equals(t1));
//		System.out.println(t1.equals(t2));
//		
//		t.hello();
		//find xml and load into container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		applicationContext.getBean("t");
		applicationContext.getBean("t");
		applicationContext.getBean("t");
	}
}
