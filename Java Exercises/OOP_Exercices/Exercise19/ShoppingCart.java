package oop_projects;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<CartItem> cartItems = new ArrayList<CartItem>();
	
	public void addItem(Product product, int quantity) {
		for(CartItem cartItem : cartItems) {
			if(cartItem.getProduct().equals(product)) {
				cartItem.addQuantity(quantity);
				return;
			}
		}
		CartItem cartItem = new CartItem(product, quantity);
		cartItems.add(cartItem);
	}
	public void removeItem(Product product, int quantity) {
		for(CartItem cartItem : cartItems) {
			if(cartItem.getProduct().equals(product)) {
				if(cartItem.getQuantity()>quantity) {
					cartItem.minusQuantity(quantity);
					return;
				}
				else if (cartItem.getQuantity()==quantity) {
					cartItems.remove(cartItem);
					return;
				}
				else if (cartItem.getQuantity()<quantity) {
					System.out.println("Invalid!");
				}
			}
		}
		System.out.println("Product does not exist");
	}
	public double totalPrice() {
		double totalPrice=0;
		for(CartItem cartItem : cartItems) {
			totalPrice += cartItem.getProduct().getPrice() * cartItem.getQuantity();
		}
		return totalPrice;
	}
	public void printReceipt() {
		System.out.println("========== YOUR RECEIPT ==========");
		for(CartItem cartItem : cartItems) {
			System.out.println(cartItem.getQuantity()+" x "+cartItem.getProduct().getName()
					+"            "+cartItem.getProduct().getPrice()+"DH"+"     ---> " 
					+(cartItem.getProduct().getPrice()*cartItem.getQuantity()));
		}
		System.out.println("===============================");
		System.out.println("TOTAL:                                                  "+totalPrice()+"DH");
		System.out.println("===============================");
	}

}
