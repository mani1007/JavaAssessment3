package assessment3;

import java.util.ArrayList;
import java.util.Iterator;

public class FindInList {

	public static void main(String[] args) {
		
		ArrayList<String> course=new ArrayList<>();
		
		course.add("API Automation");
		course.add("Mobile Automation");
		course.add("Web Automation");
		
		Iterator<String> courseIt=course.iterator();
		
		int flag =0;
		
		while(courseIt.hasNext())
		{
			String temp = courseIt.next();
			
			if(temp.contains("Mobile"))
			{
				flag = 1;
				System.out.println("True");
				break;
			}
		}
				
		if (flag==0)
			System.out.println("False");

	}

}
