package Arrays_Logical_Questions.Day_02;

import java.util.Scanner;

public class SearchElementInArray 
{
	public static int searchElement(int[] a, int ele)
	{
		for(int i=0; i<a.length; i++)
		{
			if(ele == a[i])
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{

		int[] arr = {1, 4, 3, 5, 2, 6, 5};
		
		System.out.print("Array is: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter searching element: ");
		int search = sc.nextInt();
		
		int index = searchElement(arr, search);
		
		if(index < 0)
		{
			System.err.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index: "+ index);
		}
		sc.close();	}
	
}
