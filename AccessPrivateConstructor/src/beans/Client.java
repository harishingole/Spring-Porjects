package beans;

import java.lang.reflect.Constructor;

import test.Test;

public class Client {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("test.Test");
			Constructor<?>[] cons=  c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			cons[0].newInstance();
			cons[1].setAccessible(true);
			cons[1].newInstance(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
