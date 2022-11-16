package assessment3;

import java.util.ArrayList;

public class ArrayToList {

	public static void main(String[] args) {
		
		int numsArr[] = {23,65,78,63,75,23,76,87,90};
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		System.out.println("Task 5:");
		for(int i=0;i<numsArr.length;i++)
			numsList.add(numsArr[i]);
		
		System.out.println(numsList);

	}

}
