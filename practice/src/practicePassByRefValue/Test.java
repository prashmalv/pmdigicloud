package practicePassByRefValue;

//just remember that variables are references or pointers and its copies are passed to the methods, so java is always pass-by-value. It

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100
		
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());
		
		swap(red, blue);	
		

		System.out.println("red color after swap ="+red.getColor());//baloon=50
		System.out.println("blue color after swap ="+blue.getColor());//baloon=100
		
		actualSwapping(blue);
		System.out.println("blue color after new ="+blue.getColor()); //baloon=100
	}

	private static void actualSwapping(Balloon balloon) {//baloon=100
				
				balloon.setColor("Red");  //baloon=100
				balloon = new Balloon("Green");  //baloon=200
				balloon.setColor("Blue"); //baloon=200
	}

	private static void swap(Balloon o1Red, Balloon o2Blue) { //o1=50, o2=100
		
		Balloon temp = o1Red; //temp=50, o1=50, o2=100
		o1Red=o2Blue; //temp=50, o1=100, o2=100
		o2Blue=temp; //temp=50, o1=100, o2=50
	}

}
