package practice;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLengthOfString();
		jointwoString();
		compareTwoString();
		javaStringsAreImmutable();
		//reverseString();
	}

	private static void javaStringsAreImmutable() {
		// TODO Auto-generated method stub
		// String created using String literal
        String s1 = "TAT"; 
        String s2 = "TAT";
        
          // String created using 'new' keyword
        String s3 = new String("TAT"); 
        String s4 = new String("TAT");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
	}

	private static void compareTwoString() {
		// TODO Auto-generated method stub
		// create 3 strings
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first.equals(second); // We can also compare two strings using the == operator in Java.
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	}

	private static void jointwoString() {
		// TODO Auto-generated method stub
		// create first string
	    String first = "Java ";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second); // We can also join two strings using the + operator in Java. 
	    System.out.println("Joined String: " + joinedString);
	}

	private static void getLengthOfString() {
		// TODO Auto-generated method stub
		// create a string
	    String greet = "Hello! World";
	    System.out.println("String: " + greet);

	    // get the length of greet
	    int length = greet.length();
	    System.out.println("Length: " + length);
	    
	 // use the escape character
	    String example = "This is the \"String\" class.";
	}

}
