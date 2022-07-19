package practice;

public class Control {

	public static void main(String[] args) {
		
		//Conditional Controls
		callingIfElseControl(); 
		callingSwitchControl();
		
		//Loop Controls
		callingWhileLoopControl();
		callingForLoopControl();
		callingForEachLoopControl();
		
		//Jump/Branching Statements
		usingBreakInControl();
		usingContinueInControl();
		usingReturnInControl();
	}


	private static void callingIfElseControl() {
		
		String browser = "chrome2";
		
		if(browser == "safari") {
		    System.out.println("The browser is safari");
		}
		else if(browser == "edge") {
		    System.out.println("The browser is edge");
		}
		else if(browser == "chrome"){
		    System.out.println("The browser is chrome");
		}
		else {
		    System.out.println("Not a supported browser");
		}
		
	}
	

	/*
	 * There are certain points that one needs to be remembered while using switch statements:

		The expression can be of type string, short, byte, int, char, or an enumeration.

		We cannot have any duplicate case values.

		The default statement is optional.

		Usually, the break statement is used inside the switch to terminate a statement sequence.

		The break statement is optional. If we do not provide a break statement, execution will continue to the next case. This is known as the trailing case.
	 * 
	 * */
	private static void callingSwitchControl() {

		String browser = "chrome";
		switch (browser)
		{
		    case "safari":
		        System.out.println("The browser is Safari");
		        break;
		    case "edge":
		        System.out.println("The browser is Edge");
		        break;
		    case "chrome":
		        System.out.println("The browser is Chrome");
		        break;
		    default:
		        System.out.println("The browser is not supported");
		}

		
	}
	
	private static void callingWhileLoopControl() {
		// TODO Auto-generated method stub
		
		// way 1
		int num = 10;  
        while( num > 0) {  
            System.out.println("The value of the number is: " + num);  
            num--;  // num = num - 1; 
        } 
        
        // way 2
        int num2 = 10;  
        do {  
            System.out.println("The value of the number is: " + num2);  
            num2--;  
        }while( num2 > 0);
	}
	
	private static void callingForLoopControl() {
		
		 for(int num = 1; num <=10; num++) 
	            System.out.println("The value of the number is: " + num);
		
	}

	private static void callingForEachLoopControl() {

		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
        System.out.println("Elements of the array are: ");
        
        for(int elem : array) {
            System.out.println(elem);  
        }
		
	}


	private static void usingBreakInControl() {
		// Example 1
		for(int index = 0; index < 10; index++) {
		    System.out.println("The value of the index is: " + index);
		    if(index==3) {
		        break;
		    }
		}
		
		//Example 2
		for(int outer_index = 0; outer_index < 2; outer_index++) {
		    System.out.println("The value of the outer index is: " + outer_index);
		    for(int inner_index = 0; inner_index < 10; inner_index++) {
		        System.out.println("The value of the inner index is: " + inner_index);
		        if(inner_index==3) {
		            break;
		        }
		    }
		    System.out.println("**********Inner loop ends**********");
		}

		
	}

	
	private static void usingContinueInControl() {
		// instead of exiting the loop, it goes to the next iteration.
		
		System.out.println("The odd numbers between 1 to 10 are: ");
		for(int number = 1; number <= 10; number++) {
		    if(number %2 == 0)
		        continue;
		    System.out.println(number);
		}

		
	}
	

	private static void usingReturnInControl() {
		// TODO Auto-generated method stub
	    System.out.println(search(3));
	    System.out.println(search(10));
	}
	
	public static String search(int key) {
	    int[] numbers = {1,2,3,4,5,6,7,8,9};
	    for(int element : numbers) {
	        if(element==key) {
	            return "Success";
	            //this next statement will never be executed
	            //System.out.println("Found the element");
	        } 
	    }  
	    return "Failure";
	}


	//Conclusion
	
/*
 * 	Decision-making statements are used to control the flow based on certain conditions.

	Loop statements are used to run a block of code repeatedly a number of times.

	Branching statements are used to transfer the control of the program to a different block of code or method.

	Control statements can make a Java program more effective and user-friendly when used efficiently.

	Control statements can be nested.
 * */


}
