package com.properties.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.properties.cart.ShoppingCart;
import com.properties.items.Product;

public class Main {
	 public static void main(String[] args) throws Exception {
	        ApplicationContext context =
	            new GenericXmlApplicationContext("beans.xml");


	        Product aaa = (Product) context.getBean("aaa");
	        Product cdrw = (Product) context.getBean("cdrw");
	        Product dvdrw = (Product) context.getBean("dvdrw");

	        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
	        cart1.addItem(aaa);
	        cart1.addItem(cdrw);
	        System.out.println("Shopping cart 1 contains " + cart1.getItems().get(0));

	        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
	        cart2.addItem(dvdrw);
	        System.out.println("Shopping cart 2 contains " + cart2.getItems().get(0));

	    }
	        
}