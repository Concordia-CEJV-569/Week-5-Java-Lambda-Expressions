package lambda.intro;
interface Drawable {
	public void draw();
}

public class Main {

	public static void main(String[] args) {
		// without lambda, implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing");
			}
		};

		// with lambda
		Drawable d2 = () -> System.out.println("Drawing with lambda");

		d.draw();
		d2.draw();

	}

}
