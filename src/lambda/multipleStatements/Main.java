package lambda.multipleStatements;

@FunctionalInterface
interface Speakable {
	String speak(String message);
}

public class Main {

	public static void main(String[] args) {
		Speakable speakable = (message) -> {
			String message1 = message + " Hello World.";
			String message2 = message1 + " Another message";

			return message2;
		};

		System.out.println(speakable.speak("Hola!"));
	}

}
