package assessment3;

import java.util.ArrayList;

public class ArrayListOperations {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(33);
		nums.add(44);
		nums.add(55);
		nums.add(66);
		nums.add(77);
		nums.add(88);
		
		System.out.println("Task 6:");
		
		nums.remove(1);
		
		System.out.println(nums);
		
		nums.remove(nums.indexOf(55));
		System.out.println(nums);
		
		nums.add(3, 90);
		System.out.println(nums);
		
		System.out.println("\nLength of the list: "+nums.size());
		
		System.out.println("\nAll Values from List");
		for(int value:nums)
			System.out.println(value);
		
		System.out.println("\nAll Values from Array");
		
		/* 
		   Object[] objarray = nums.toArray();
		   for(Object obj:objarray)
		    	System.out.println(obj);
			*/
		
		/*
		int arr[] = new int[nums.size()];
		
		for(int i=0;i<nums.size();i++)
		{
			arr[i]=nums.get(i);
			System.out.println(arr[i]);
		}
		
		*/
		
		Integer[] arr2= new Integer[nums.size()];
		
		for(int i=0;i<nums.size();i++)
		{
			arr2[i]=nums.get(i);
			System.out.println(arr2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		

	}

}
