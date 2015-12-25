package com.properties.cart;

import java.util.ArrayList;
import java.util.List;

import com.properties.items.Product;

public class ShoppingCart {
	private List<Product> items = new ArrayList<>();

	public void addItem(Product product) {
		items.add(product);
	}

	public List<Product> getItems() {
		return items;
	}

}
