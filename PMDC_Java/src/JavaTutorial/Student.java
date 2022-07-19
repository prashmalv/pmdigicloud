package JavaTutorial;

public class Student {
	
	private int studentID ;
	private String CollegeName;
	
	static {
		//it will be calledon l time
		System.out.println("Inside Static initializer");
	}
	
	//initializer
	{
		//whenever your object instance is called only first time
		System.out.println("Inside Instance initializer");
	}

	
	//No -Arg Constructor
	Student(){
		 studentID =1;
		 CollegeName ="ABC";
	}
	//Paramterised Constructor
	Student(int studentID2,String CollegeName2 ){
		 studentID =studentID2;
		 CollegeName =CollegeName2;
	}
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	
	void display(){
		String localVal = "my value";
		System.out.println("student info is "+ studentID);
		display2(localVal);
	}
	void display2(String passValue) {
		System.out.println(passValue);
	}
	

}
