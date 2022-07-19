package practice;

public class aboutFinal {

	final static int MY_CONSTANT = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MY_CONSTANT = 15; // can't change
		passingFInal(MY_CONSTANT);
		finalMethod();
		try {
			System.out.println("testing finally");
		} catch(Exception e){
			System.out.println("Exception block will execute in case of any exception");
		}
		finally {
			// TODO: handle finally clause
			System.out.println("will always execute");
		}
	}

	private static final void finalMethod() {
		// TODO Auto-generated method stub
		System.out.println("You can not override final to child class");
	}

	private static void passingFInal(int myConstant) {
		// TODO Auto-generated method stub
		//MY_CONSTANT = 20; // can't change
	}
	
	
}
