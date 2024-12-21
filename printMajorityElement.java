package Arrays_Logical_Questions.Day_02;

/*Find the Majority element.
 Print the Element which appeared More than n/2 Times. [n is length of the array] 
 Write a program to find an element in an array {3, 3, 4, 2, 4, 4, 2, 4, 4}
 that appears more than n/2 times. If no such element exists,
 display "No majority element."*/

import java.util.Scanner;

public class printMajorityElement 
{
	public static int[] createArray()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter "+ size +" element in an array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.println("Array element at index "+ i +" : "+ arr[i]);
		}
		sc.close();
		return arr;
	}
	
	public static void majorityElement(int[] arr)
	{ 
		int n = arr.length / 2;
		
		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}			
			if(count > n)
			{
				System.out.println("\nMajority element in array: "+ arr[i]);
				System.exit(0);
			}
			
		}
	}

	public static void main(String[] args)
	{
		int[] arr1 = createArray();
		majorityElement(arr1);
	}
}
