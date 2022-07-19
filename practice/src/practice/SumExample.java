package practice;

import java.util.stream.IntStream;

public class SumExample {

	public static void main(String[] args) {
		// Imperative - How?
		
		int sum = 0;
		for (int i=0;i<=100;i++)
				sum = sum+i;
		System.out.println("Sum value from 0 to 100 is - "+sum);
		
		//Declarative - What ?
		int sumNew = IntStream.rangeClosed(0, 100).sum();
		
		System.out.println("Sum value from declarative way 0 to 100 is - "+sumNew);
						

	}

}
