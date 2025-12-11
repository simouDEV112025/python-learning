package ecommerce.model.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<CartItem> items = new ArrayList<>();

	public List<CartItem> getItems() {
		return items;
	}

	public void clear() {
		items.clear();
	}

}
