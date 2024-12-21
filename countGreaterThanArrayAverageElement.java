package Arrays_Logical_Questions.Day_02;

/* Count Elements Greater than Average.
   Write a program to count how many elements in the array
   {10, 20, 30, 40, 50} are greater than the average of all the elements.*/

import java.util.Scanner;

public class countGreaterThanArrayAverageElement 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index "+ i +" : "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void countGreaterAverage(int[] arr)
	{
		int avg = 0;
		int count = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			avg = arr[arr.length / 2];
			
			if(arr[i] > avg)
			{
				count++;
			}
		}
		
		System.out.println("\nAverage of an array: "+avg);
		System.out.println("Greater than average elements: "+count);
	}

	public static void main(String[] args) 
	{
		int[] arr1 = createArray();
		countGreaterAverage(arr1);
	}

}
