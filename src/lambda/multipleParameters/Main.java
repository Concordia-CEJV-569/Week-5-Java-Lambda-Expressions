package lambda.multipleParameters;

interface Drawable {
	public void draw(int width, int height);
}

interface Addable {
	int add(int a, int b);
}

public class Main {

	public static void main(String[] args) {
		// with lambda
		Drawable d = (width, height) -> System.out.println("Drawing: Width" + width + ", Height: " + height);

		d.draw(10, 20);

		Addable addable = (a, b) -> a + b;
		System.out.println(addable.add(12, 13));
	}

}
