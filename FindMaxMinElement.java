package Arrays_Logical_Questions.Day_02;

/* a.Find Maximum Element in an Array.
   Input as: 6 3 2 1 5 5 4
   Output as: Max is: 6
 
   b.Find Minimum Element in an Array.
   Input as: 6 3 2 1 5 5 4
   Output as: Max is: 1             */

import java.util.Scanner;

public class FindMaxMinElement 
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
			System.out.println("Array element of index "+ i +" : "+ arr[i]);
		}
		System.out.println();
		sc.close();
		return arr;
	}
	
	public static void maxElement(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max element is: "+ max);
	}
	
	public static void minElement(int[] arr)
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Min element is: "+ min);
	}

	public static void main(String[] args)
	{
		int[] arr1 = createArray();
		maxElement(arr1);
		minElement(arr1);
	}
}
