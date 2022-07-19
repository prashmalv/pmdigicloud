package practice;

public class EngineerStudents extends Student {
	
	private String branch ="Computer Science";
	
	public EngineerStudents(int rollNumber, String studentName) {
		super(rollNumber, studentName);
		// TODO Auto-generated constructor stub
	}

	public EngineerStudents(int rollNumber, String studentName, String engBranch) {
		super(rollNumber, studentName);
		this.branch = engBranch;
	}

	public String getStream() {
		return branch;
	}

	public void setStream(String stream) {
		branch = stream;
	}
	
	public String testMyOOPSConcepts() {
		return "return from Engineer subclass"+this.getRollNumber()+" "+this.getStudentName()+" "+this.getStream();
	}

}
