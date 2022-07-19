package polymorphism;

public class ProcessorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p = new Processor();
		Processor mp = new MathProcessor(); // mathprocessor object will be called
		
		p.process(10, 20);
		mp.process(30,40);
	}

}
