package oop_projects;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

		HashMap<String, Double> products = new HashMap<>();

		products.put("milk", 4.0);
		products.put("egg", 1.5);
		products.put("bread", 1.0);
		System.out.println(products);

		products.remove("bread");
		System.out.println(products);

		products.replace("milk", 6.0);
		System.out.println(products);

		System.out.println(products.get("egg"));

	}

}
