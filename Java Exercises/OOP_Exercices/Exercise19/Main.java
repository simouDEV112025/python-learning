package oop_projects;

public class Main {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		Product p1 = new Product("milk", 4);
		Product p2 = new Product("egg", 1.5);
		Product p3 = new Product("chocolat", 15);
		Product p4 = new Product("chicken", 20);
		
		shoppingCart.addItem(p1, 2);     // 2 milks → 8 DH
	    shoppingCart.addItem(p2, 6);      // 6 eggs → 9 DH
	    shoppingCart.addItem(p4, 1);  // 1 chicken → 20 DH

	    shoppingCart.printReceipt(); // should show all items correctly

	    System.out.println("----------------------------");

	    shoppingCart.removeItem(p2, 3);   // remove 3 eggs (now 3 left)
	    shoppingCart.removeItem(p1, 2);  // remove all milk (0 left → removed)
	    shoppingCart.removeItem(p3, 2);

	    shoppingCart.printReceipt(); // updated receipt
		

	}

}
 