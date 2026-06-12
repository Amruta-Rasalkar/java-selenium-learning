package javalearning;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum = 5; //int is primitive datatype, myNum is variable, 5 is value assigned to the variable myNum 
		String website = "Rahul Shetty Academy"; // String is non-primitive datatype
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + "is the value stored in the variable myNum");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);
		
		//Arrays
		int[] arr = new int[5]; // to declare the number of values you gonna store in an array
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] =5;
		
		int[] arr2 = {1,2,4,5,6,7,8,10,122};
		System.out.println(arr2[2] + "lol");
		
		//for loop arr.length - 5
		//for(int i = 0; i< arr.length; i++)
		//{
		//	System.out.println(arr[i]);
		//}
		
		for (int i = 0; i<arr2.length; i++) 
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = { "rahul","shetty","selenium"};
		for(int i=0; i<name.length; i++) 
		{
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		for(String s: name)
		{
			System.out.println("start" + s);
		}
		
	}

}
