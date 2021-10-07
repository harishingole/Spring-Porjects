package Client.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Spring.com.Test;

public class Client {

	public static void main(String[] args) {
		//find xml
		Resource r = new ClassPathResource("resources/spring.xml");

		//load xml into container
		BeanFactory  beanFactory = new XmlBeanFactory(r);
		
		//create test class object
		Test t = (Test) beanFactory.getBean("t");
		Test t1 = (Test) beanFactory.getBean("t");
		Test t2 = (Test) beanFactory.getBean("t");
	}
}
