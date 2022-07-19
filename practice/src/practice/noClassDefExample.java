package practice;

// Class 1
public class noClassDefExample {
	// Java Program to Illustrate NoClassDefFoundError Exception
	// Method
		void greeting()
		{
			// Print statement whenever method is called
			System.out.println("hello!");
		}
}

// Class 2
// Main class
class Test {

	public static void main(String args[])
	{
		// Creating object of class 1
		// inside main() in class2
		noClassDefExample noClassDefExample = new noClassDefExample();

		// Calling method of above class
		noClassDefExample.greeting();
	}
}
