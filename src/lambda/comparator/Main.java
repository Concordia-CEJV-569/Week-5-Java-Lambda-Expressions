package lambda.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(1, "Macbook Pro", 2200));
		productList.add(new Product(2, "iPhone 13", 1200));
		productList.add(new Product(3, "Microsoft Surface", 2000));
		productList.add(new Product(4, "Samsung TV", 3000));

//		Collections.sort(productList, (p1, p2) -> {
//			return p1.name.compareTo(p2.name);
//		});

		System.out.println("Sorting by name => ");
		Collections.sort(productList, Comparator.comparing(p -> p.name));
		productList.forEach(product -> System.out.println(product));

		System.out.println("\nSorting by price => ");
		Collections.sort(productList, Comparator.comparing(p -> p.price));
		productList.forEach(product -> System.out.println(product));
	}

}
