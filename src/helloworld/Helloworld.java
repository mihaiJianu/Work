package hello;

import java.io.PrintStream;
public class HelloWorld {

	public static void main(String[] args) {
		PrintStream printObject = new PrintStream(System.out);
		printObject.println("Hello World!");
		printObject.print("Hello World! MF's");
		
		printObject.flush();

	}

}
