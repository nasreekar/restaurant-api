package com.lucasmro.restaurant.fixture;

import com.lucasmro.restaurant.enums.ProductType;
import com.lucasmro.restaurant.model.Product;

public class ProductFixture {
	public static Product createXEggHamburguer() {
		Product product = new Product();
		product.setId("5403d655c19e51e2ea3c02c0");
		product.setType(ProductType.HAMBURGUER);
		product.setDescription("X-EGG");
		product.setPrice(10.5);

		return product;
	}

	public static Product createCocaColaDrink() {
		Product product = new Product();
		product.setId("5403d7e6c19e51e2ea3c02c2");
		product.setType(ProductType.DRINK);
		product.setDescription("Coca-Cola");
		product.setPrice(4.0);

		return product;
	}
}
