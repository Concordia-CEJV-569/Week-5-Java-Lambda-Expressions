package lambda.filterStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

		System.out.println("Before filtering =>");
		productList.forEach(product -> System.out.println(product));

		System.out.println("-------------------");

		System.out.println("After filtering =>");
		Stream<Product> filteredData = productList.stream().filter(product -> product.price > 2000);
		filteredData.forEach(product -> System.out.println(product));
	}

}
