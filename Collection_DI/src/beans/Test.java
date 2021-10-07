package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List<String> fruits;
	private Set<String> crickators;
	private Map<String, String> cc;
	
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	public void setCrickators(Set<String> crickators) {
		this.crickators = crickators;
	}
	public void setCountriesAndCapitals(Map<String, String> cc) {
		this.cc = cc;
	}
	public void printData() {
		System.out.println("*********Fruits**********");
		for (String f : fruits) {
			System.out.println(f);
		}
		System.out.println("*********Crickators**********");
		for (String c : crickators) {
			System.out.println(c);
		}
		
		Set<String> keys = cc.keySet();
		System.out.println("*********Countries and Capitals**********");
		for (Object kk : keys) {
			System.out.println("Countries:: " +kk);
			System.out.println("Capitals:: "+ cc.get(kk));
		}
		
	}
}
