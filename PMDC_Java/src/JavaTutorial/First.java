package JavaTutorial;

public class First {

	static public  void main(String[] a) {
		// TODO Auto-generated method stub
		System.out.println("Testing");
		
		Student s1 = new Student();		
		s1.setCollegeName("Colleg1");
		s1.setStudentID(1);		
		s1.display();
		
		Student s2 = new Student(2,"College2");
		s2.display();
		
		Student s3 = new Student(3,"College2");
		s3.display();
		
		First f = new First();
		f.firstDisplay();
		
	}
	
	public  void firstDisplay() {
		System.out.println("just testing");
	}

}
