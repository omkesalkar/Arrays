package Arrays_Logical_Questions.Day_02;

import java.util.Scanner;

public class SearchElementInArray 
{
	static Scanner sc = new Scanner(System.in);
	
	public static int[] createArray()
	{
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index "+ i +" : "+ arr[i]);
		}
		return arr;
	}
	
	public static void searchElement(int[] arr)
	{
		System.out.print("\nEnter search element: ");
		int element = sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == element)
			{
				System.out.println("Element found at index "+ i);
			}
		}
	}

	public static void main(String[] args)
	{
		int[] arr1 = createArray();
		searchElement(arr1);
	}
	
}
