package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Imperative - How
		List<Integer> newListWithoutDuplicates = new ArrayList<Integer>();
		for(Integer val :myList )
		{
			if(!newListWithoutDuplicates.contains(val))
				newListWithoutDuplicates.add(val);
		}
		System.out.println("List after removal of duplicates is "+newListWithoutDuplicates);
		
		// Declarative - What ?
		List<Integer> newUniqueList = 
				myList.stream().distinct().collect(Collectors.toList());
		System.out.println("List after removal of duplicates with declarative is "+newUniqueList);

	}

}
