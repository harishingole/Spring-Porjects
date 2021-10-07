package beans;

import java.util.Properties;
import java.util.Set;

public class Test {

	private Properties properties;
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void printData() {
		Set<Object> keys = properties.keySet();
		for (Object key : keys) {
			System.out.println(key + " :: " + properties.getProperty(key.toString()));
		}
	}
}
