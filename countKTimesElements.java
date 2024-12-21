package Arrays_Logical_Questions.Day_02;

/*Count Elements Appearing Exactly k Times.
 Write a program to count how many elements appear exactly 2 times
 in an array {1, 2, 2, 3, 4, 4, 5, 5}.
 Example: 2, 4, and 5 each appear exactly twice.
 If k time elements are not found then print "No element found". */

import java.util.Scanner;

public class countKTimesElements 
{
	public static int[] createArray() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+size+" elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index " + i + ": " + arr[i]);
		}
		
		
		System.out.print("Enter k value: ");
		int k = sc.nextInt();
		
		System.out.print("K time elements in array: ");
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=1; j<arr.length; j++)
			{
				if(arr[i] == arr[j]) 
				{
					count++;
				}
			}
			if(count == k)
			{
				System.out.print(arr[i] +" ");
			}
		}
		
		sc.close();
		return arr;
	}

	public static void main(String[] args) 
	{
		createArray();
	}

}
