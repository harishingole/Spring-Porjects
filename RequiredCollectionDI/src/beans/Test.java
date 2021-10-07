package beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Vector<String> fruits;
	private TreeSet<String> crickators;
	private HashMap<String, String> cc;

	public void setFruits(Vector<String> fruits) {
		this.fruits = fruits;
	}
	public void setCrickators(TreeSet<String> crickators) {
		this.crickators = crickators;
	}
	public void setCc(HashMap<String, String> cc) {
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
			System.out.print("Countries:: " +kk);
			System.out.print("Capitals:: "+ cc.get(kk));
		}
		
	}
}
