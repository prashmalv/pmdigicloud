package polymorphism;

public class MathProcessor extends Processor {
	@Override
	public void process(int i, int j) {
		System.out.println("Sum of integers is " + (i + j));
	}

	@Override
	public void process(int[] ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		System.out.println("Sum of integer array elements is " + sum);
	}
}
