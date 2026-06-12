package javalearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		int[] arr2 = {1,2,4,5,6,7,8,10,122};
		
		//check if array has multiple of 2
		for(int i=0; i<arr2.length; i++)
		{
			if( arr2[i] % 2 ==0) 
			{
				System.out.println(arr2[i]);
				break; //loop stops at 2 coz it got it's first multiple of 2
			}
			else 
			{
				System.out.println( arr2[i] + " is not multiple of 2");
			}
		}
		List<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("Selenium");
		System.out.println(a.get(3));
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		for(String val:a) {
			System.out.println(val);
		}
		
		//item is present in ArrayList
		System.out.println(a.contains("selenium"));
		String[] name = {"rahul", "shetty","selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium");

	}

}
