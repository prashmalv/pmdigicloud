package practice;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1, "Vicky");
		Student engStudentOne = new EngineerStudents(1, "Ravi");
		EngineerStudents engStudentTwo = new EngineerStudents(2, "Arvind","Mechanical");
		
		System.out.println(student.testMyOOPSConcepts()); 
		System.out.println(engStudentOne.testMyOOPSConcepts()); 
		System.out.println(engStudentTwo.testMyOOPSConcepts()); 

	}

}
