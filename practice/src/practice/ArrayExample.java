package practice;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
			
	//calling2DArray
	execute2DArray();
	//calling3DArray
	execute3DArray();
	
	//Understand cloning
	executeCloninginArray();
	executeCloningInMDArray();
	
	//Understand imp methods in Array
	
	  compareArrays(); 
	  fillArrays(); 
	  equalsArrays(); 
	  binarySearchArrays();
	  copyOfArrays();
	 
}

	private static void copyOfArrays() {
		//create arrays
	    int array1[] = { 65, 20, 34, 56, 78, 97 };
	    // To print the elements in one line
	    System.out.println("Integer Array: "+ Arrays.toString(array1));
	    System.out.println("\nNew Arrays by copyOf method:");
	    System.out.println("Integer Array: "+ Arrays.toString( Arrays.copyOf(array1, 10)));
		
	}

	private static void binarySearchArrays() {
		  //create arrays
	    int array1[] = { 20, 34,56,78,97 };
	    int intKey = 56;
	    System.out.println(intKey + " found at index = " + Arrays .binarySearch(array1, intKey));
	    System.out.println(20 + " found at index = " + Arrays .binarySearch(array1, 20));
		
	}

	private static void equalsArrays() {
		 //create arrays to be compared
	    int array1[] = { 45, 68, 34, 20, 56 };
	    int array2[] = { 45, 68, 34, 20, 56 };
	    int array3[] = { 55, 78, 44, 10, 56 };
	    System.out.println("Comparing array1 and array2: "
	    + Arrays.equals(array1,array2));
	    System.out.println("Comparing array2 and array3: "
	    + Arrays.equals(array2,array3));
		
	}

	private static void fillArrays() {
		 // Create the Array
	    int myArray1[] = new int[5];
	    int fillvalue = 15;
	    Arrays.fill(myArray1, fillvalue);
	    // To fill the arrays
	    System.out.println("Integer Array on filling: "
	        + Arrays.toString(myArray1));
		
	}

	private static void compareArrays() {
		 // Create the first Array
	    int myArray1[] = { 10, 15, 32, 30 };
	    // Create the second Array
	    int myArray2[] = { 10, 25, 22 ,30};
	    // comparing both arrays
	    System.out.println("Comparing two integer arrays: "
	        + Arrays.compare(myArray1, myArray2));
		
	}

	private static void executeCloninginArray() {
		// TODO Auto-generated method stub
		int intArray[] = { 50, 60, 70 };
		
	    int clonedArray[] = intArray.clone();
	    
	    // will print false as a deep copy is created for a one-dimensional array
	    System.out.println(intArray == clonedArray);
	    System.out.print("Printing cloned array:\n");
	    for (int i = 0; i < clonedArray.length; i++)
	    {
	      System.out.print(clonedArray[i]+" ");
	    }
	}

	private static void executeCloningInMDArray() {
		// TODO Auto-generated method stub
				
		int intArray[][] = {{1,2,3},{4,5,6}};
		
	    int clonedArray[][] = intArray.clone();
	    
	    // will print false
	    System.out.println(intArray == clonedArray);
	    // it will print true as a shallow copy is created and sub-arrays are //shared
	    System.out.println(intArray[0] == clonedArray[0]);
	    System.out.println(intArray[1] == clonedArray[1]);
	    System.out.println("\nPrinting cloned array:");
	    
	    for (int i = 0; i < 2; i++)
	    {
	      for (int j = 0; j < 3; j++)
	      {
	        System.out.print(clonedArray[i][j]+ " ");
	      }
	      System.out.println();
	    }
		
	}

	private static void execute2DArray() {
	
		// create a 2d array
		
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
	
	
	for (int row = 0; row < a.length; ++row) {
        for(int column = 0; column < a[row].length; ++column) {
            System.out.println(a[row][column]);
        }
    }
	
	 // first for...each loop access the individual array
	for (int[] innerArray: a) {
        // second for...each loop access each element inside the row
        for(int data: innerArray) {
            System.out.println(data);
        }
    }
	}

	private static void execute3DArray() {
		// TODO Auto-generated method stub
		int[][][] test = {
		        {
		          {1, -2, 3}, 
		          {2, 3, 4}
		        }, 
		        { 
		          {-4, -5, 6, 9}, 
		          {1}, 
		          {2, 3}
		        } 
		};
		
		  // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
	}
}
