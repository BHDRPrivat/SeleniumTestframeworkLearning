package Demo;

public class ExceptionHandlingDemo {

	// Beispiel für ein zentrales Fehlerhandling
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoTry();
		try {
			DemoThrow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void DemoThrow() throws Exception {
		System.out.println("Hello World");
		int i = 1 / 0;
		System.out.println("Completed");
	}

	// Beispiel für das Fehlerhandling in der Klasse
	public static void DemoTry() {

		try {
			System.out.println("Hello World");
			int i = 1 / 0;
			System.out.println("Completed");
		} catch (Exception exp) {
			System.out.println("Inside Catch");
			System.out.println("Message: " + exp.getMessage());
			System.out.println("Cause: " + exp.getCause());
			exp.printStackTrace();
		}
	}

}
