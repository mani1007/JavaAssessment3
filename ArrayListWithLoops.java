package assessment3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithLoops {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(81);
		nums.add(12);
		nums.add(45);
		nums.add(65);
		nums.add(98);
		nums.add(101);
		
		System.out.println("Task 1:");
		
		for(int i=0;i<nums.size();i++)
			System.out.println(nums.get(i));
		
		System.out.println("\nTask 2:");
		for(int value:nums)
			System.out.println(value);
		
		System.out.println("\nTask 3:");
		
		Iterator<Integer> numsIt = nums.iterator();
		while(numsIt.hasNext())
			System.out.println(numsIt.next());
		
		System.out.println("\nTask 4:");
		
		int sum=0;
		
		for(int value:nums)
			sum = sum+value;
		System.out.println(sum);

	}

}
