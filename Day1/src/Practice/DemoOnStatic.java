package Practice;

//Java Program to Illustrate Static Binding

//Main class
 public class DemoOnStatic {

	// Static nested inner class
	// Class 1
	public static class superclass {

		// Method of inner class
		static void print()
		{

			// Print statement
			System.out.println(
				"print() in superclass is called");
		}
	}

	// Static nested inner class
	// Class 2
	public static class subclass extends superclass {

		// Method of inner class
		static void print()
		{

			// print statement
			System.out.println(
				"print() in subclass is called");
		}
	}

	// Method of main class
	// Main driver method
	public static void main(String[] args)
	{

		// Creating objects of static inner classes
		// inside main() method
		superclass A = new superclass();	//print() in superclass is called
		superclass B = new subclass();		//print() in superclass is called
		subclass B1 = new subclass();  //print() in subclass is called

		// Calling method over above objects
		A.print();
		B.print();
		B1.print();
	}
}

