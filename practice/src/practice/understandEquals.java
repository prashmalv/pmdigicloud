package practice;

public class understandEquals {
	
	private int myID;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		understandEquals e1 = new understandEquals();
		e1.setMyID(10);
		understandEquals e2 = new understandEquals();
		e2.setMyID(10);
		understandEquals e3 = e1;
		e3.setMyID(10);
		
		System.out.println("=======Object == compare ===========");
		
		System.out.println(e1 == e2); // 
		System.out.println(e2 == e3); // 
		System.out.println(e1 == e3); // 
		
		System.out.println("=======Object equals ===========");
		
		System.out.println(e1.equals(e2)); // 
		System.out.println(e2.equals(e3)); // 
		System.out.println(e1.equals(e3)); // 
		
		System.out.println("=======String Example ===========");
		String first = "Baeldung"; 
		String second = "Baeldung"; 
		System.out.println(first == second); // True only in case of String
		
		String third = new String("Baeldung");
		String fourth = new String("Baeldung"); 
		System.out.println("result using == "+ third == fourth); // False
		
		System.out.println("result using .equals "+ third.equals(fourth) ); // true
	}
	
	public int getMyID() {
		return myID;
	}

	public void setMyID(int myID) {
		this.myID = myID;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		understandEquals newObj = (understandEquals) obj;
		
		if(this.myID == newObj.myID )
			return true;
		else
			return false;
		
	}
	 
}
